#!/bin/bash

# shellcheck source=/dev/null
# shellcheck disable=SC1007
# shellcheck disable=SC2097
# shellcheck disable=SC2098
# shellcheck disable=SC2317

source ~/.bashrc

script_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)

_rel_path() {
    local prompt
    local root

    root="$(
        OLD_PWD=""
        while [[ "$PWD" != "$OLD_PWD" ]]; do
            [ -d .git ] && echo "$PWD" && exit 0
            OLD_PWD="$PWD"
            cd ..
        done
        exit 1
    )"

    # shellcheck disable=SC2181
    if [[ $? == 0 ]]; then
        prompt="${PWD#"$root"}"
        prompt="${prompt#/}"
    else
        prompt="${PWD/"$HOME"/\~}"
    fi

    echo -n "$prompt"
}

_set_bash_prompt() {
    local prompt
    prompt=$(_rel_path)

    if ((${#prompt} > 13)); then
        prompt+="\n"
    elif ((${#prompt} > 0)); then
        prompt+=" "
    fi

    prompt="$(tput setaf 12)${prompt# }$(tput sgr0)$ "
    PS1=$prompt
}

_ask() {
    local question="$1"
    local accept_re_pattern="^$2\$"
    local default="$3"

    local answer

    if [ -n "$default" ]; then
        question+="($default)"
    fi
    question+=':'

    while true; do
        read -r -p "$question " answer
        [ "${#answer}" -eq 0 ] && answer="$default" && break
        [[ "$answer" =~ $accept_re_pattern ]] && break
    done
    echo -n "$answer"
}

pwd
ls --color

datetime="$(date +"%y%m%d,%H%M%S")"
IFS=, read -r datepart timepart <<<"$datetime"

source .state

if [ ! -e "date/d$datepart" ]; then
    class="$(_ask 'Ange klass' '[A-Z]+2[3-9]' "$class")"
    lession_number="$(_ask 'Ange lektion' '[1-9][0-9]?' "$((lession_number + 1))")"
    git fetch
    git stash
    if ! git checkout "$datepart" 2>/dev/null; then
        git checkout -b "$datepart"
        git push
    fi
    git stash pop
fi

echo -e "class='$class'\nlession_number='$lession_number'" >.state

lession="lektion${lession_number}"

mkdir -p "date/d$datepart/recordings"
mkdir -p "$class"

[ ! -e "$class/$lession" ] && ln -rs "date/d$datepart" "$class/$lession"

cd "date/d$datepart" || true

record_timing="recordings/${timepart}_timing.txt"
record="recordings/${timepart}.txt"

export -f _rel_path
export -f _set_bash_prompt
export PROMPT_COMMAND=_set_bash_prompt
export SHELL="$script_dir/bash_noprofile_norc"

trap 'read -r size _ < <(wc -c "$record"); if ((size < 500)); then rm "$record" "$record_timing"; fi' EXIT

script -e -q "--t=$record_timing" -q "$record"

exit $?

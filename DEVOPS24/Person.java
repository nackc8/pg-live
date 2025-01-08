package d250108;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String greet() {
        // Alt. sätt men med duplicerad kod: return "Hej" + ", jag heter " + name + " och är " + age + " år gammal.";
        return greet("Hej");
    }

    String greet(String greeting) {
        return greeting + ", jag heter " + name + " och är " + age + " år gammal.";
    }

    public static void main(String[] args) {
        Person p = new Person("Anna", 30);
        System.out.println(p.greet());
        System.out.println(p.greet("Hallå"));
    }
}

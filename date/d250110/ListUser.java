package d250110;

import java.util.List;
import java.util.ArrayList;

public class ListUser {
    public static void main(String[] args) {
        // List list = new ArrayList();
        // list.add("hello");
        // String s = (String) list.get(0);

        // Med generics kan Java hjälpa till att se till att man
        // bara sätter in strängar i listan. Då behöver man inte
        // heller göra någon explicit typkonvertering.

        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0);
    }
}

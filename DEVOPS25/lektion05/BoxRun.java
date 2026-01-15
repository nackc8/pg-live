public class BoxRun {
    public static void main(String[] args) {
        Box<String> lada = new Box<String>();
        var greeting = "Hej";
        lada.set(greeting);

        // typ = String
        var iboxen = lada.get();

        // Exempel med Box som inte är generisk och lagrar typen Object

        // Mer jobb, högre risk

        // Box obox = new Box();
        // obox.set(greeting);
        // // Typ = Object
        // var iobjladan = obox.get();
        // // Funkar inte.
        // System.out.println(((String) iobjladan).length());
        // String iobjladankonverat = (String) iobjladan;
        // System.out.println(iobjladankonverat.length());

    }
}

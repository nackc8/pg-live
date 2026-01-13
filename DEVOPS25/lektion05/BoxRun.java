public class BoxRun {
    public static void main(String[] args) {
        // Box<String> lada = new Box<String>();
        var greeting = "Hej";
        // lada.set(greeting);

        // var iboxen = lada.get();

        // Exempel med Box som inte är generisk och lagrar typen Object

        Box obox = new Box();
        obox.set(greeting);
        var iobjladan = obox.get();
    }
}

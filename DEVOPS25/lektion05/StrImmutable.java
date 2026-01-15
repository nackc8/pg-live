

public class StrImmutable {
    public static void main(String[] args) {
        String namn = "Xi";

        namn = "Pelle";

        var namn2 = "Pelle"; // Samma strängobjekt!

        int x = 1;
        System.out.println(x);
    }
}

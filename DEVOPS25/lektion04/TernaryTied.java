

public class TernaryTied {
    public static void main(String[] args) {
        boolean big = true;
        boolean dangerous = true;

        // Mål:
        // Om big:
        //  size += + 50  , annars + 0
        // Om inte big, men dangerous
        //  size += + 200  , annars + 0

        var size = 100 + (big ? 50: (dangerous ? 200 : 0));

        System.out.println(size);

        var sizeNonTernary = 100;
        if (big) {
            sizeNonTernary += 50;
        }
        if (dangerous) {
            sizeNonTernary += 200;
        }

        System.out.println(sizeNonTernary);

    }
}

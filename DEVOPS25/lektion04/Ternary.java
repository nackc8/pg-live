

public class Ternary {
    public static void main(String[] args) {
        boolean big = true;
        boolean dangerous = true;

        var size = 100 + (big ? 50: 0) + (dangerous ? 200 : 0);

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



public class DoWhile {
    public static void main(String[] args) {
        int number = 100_000;

        do {
            number += 200;
            System.out.println("number: " + number);
        } while (number < 1000);

        System.out.println("Final: " + number);
    }
}

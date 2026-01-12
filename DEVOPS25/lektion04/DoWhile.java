

public class DoWhile {
    public static void main(String[] args) {
        int number = 100_000;

        // MINST en gång, till skillnad från while .. do
        do {
            number += 200;
            System.out.println("number: " + number);
        } while (number < 1000);

        System.out.println("Final: " + number);
    }
}

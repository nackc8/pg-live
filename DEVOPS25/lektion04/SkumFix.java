

public class SkumFix {
    public static void main(String[] args) {
        int x = 10;
        // Post = ändra direkt FÖRE
        System.out.printf("x = %d\n", ++x);
        System.out.printf("x = %d\n", x);
        System.out.printf("x = %d\n", --x);
        // // Brain overload
        // x = 10;
        // System.out.printf("x = %d\n", x++ + x++);
    }
}

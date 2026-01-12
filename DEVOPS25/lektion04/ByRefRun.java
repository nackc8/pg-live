
public class ByRefRun {
    public static void increaseInteger(Integer i) {
        i += 1;
    }

    public static void increaseInt(int i) {
        i += 1;
        System.out.println("local: " + i);

    }

    public static void increase(ByRef b) {
        b.age += 1;
    }

    public static void main(String[] args) {
        var obj = new ByRef();
        increase(obj);
        System.out.println(obj.age);
        var prim = 123;
        increaseInt(prim);
        System.out.println(prim);
    }
}

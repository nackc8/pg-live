
public class ByRefRun {
    public static void increase(ByRef b) {
        b.age += 1;
    }

    public static void main(String[] args) {
        var obj = new ByRef();
        increase(obj);
        System.out.println(obj.age);
    }
}

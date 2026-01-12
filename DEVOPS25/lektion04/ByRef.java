public class ByRef {
    public int age = 12;

    public static int ohNo(){
        return this.age;
    }
}

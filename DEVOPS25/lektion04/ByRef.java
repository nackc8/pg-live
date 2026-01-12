

public class ByRef {
    public int age = 0;
}

class Run {
        public static void main(String[] args) {
            var obj = new ByRef();
            System.out.println(obj.age);
    }
}

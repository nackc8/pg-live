
/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}

// public class Box {
//     // T stands for "Type"
//     private Object t;

//     public void set(Object t) { this.t = t; }
//     public Object get() { return t; }
// }

package d250110;

import d250110.Car;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car(0.5, 10);

        c.incSpeed(4);
        c.signal();
    }
}

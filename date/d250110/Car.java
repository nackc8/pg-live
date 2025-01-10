package d250110;

public class Car extends Vehicle {
    public Car(int angleRadians, int speed) {
        super(angleRadians, speed);
    }

    @Override
    public void signal() {
        System.out.println("Honk!");
    }
}

package d250110;


public class CarMain {
    public static void main(String[] args) {
        Car c = new Car(0.5, 10);

        c.incSpeed(4);
        c.signal();
        c.autoSteering(); // Finns i Car


        Vehicle v = new Car(0.5, 10);
        v.incSpeed(4);
        v.signal();
        v.autoSteering(); // Finns i Car

    }
}

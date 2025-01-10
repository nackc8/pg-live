package d250110;

// Vid arv så utökar barnklassen föräldraklassen, "extends".

public class Car extends AbstractVehicle {
    public Car(double angleRadians, int speed) {
        super(angleRadians, speed);
    }

    @Override
    public void signal() {
        System.out.println("Honk!");
    }

    public void autoSteering() {
        System.out.println("Auto");
    }
}

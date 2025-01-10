package d250110;

public abstract class Vehicle {
    int angleRadians = 0;
    int speed = 0;

    public Vehicle(int angleRadians, int speed) {
        this.angleRadians = angleRadians;
        this.speed = speed;
    }

    public abstract void signal();
}

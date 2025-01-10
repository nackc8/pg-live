package d250110;

public abstract class AbstractVehicle {
    int angleRadians = 0;
    int speed = 0;

    public AbstractVehicle(int angleRadians, int speed) {
        this.angleRadians = angleRadians;
        this.speed = speed;
    }

    public abstract void signal();
}

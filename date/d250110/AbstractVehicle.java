package d250110;

// En abstrakt klass får man inte instansiera då den innehåller
// minst en metod som är abstract. Att en metod är absrakt betyder
// att barnklassen måste implementera den.

public abstract class AbstractVehicle {
    double angleRadians = 0;
    int speed = 0;

    public AbstractVehicle(double angleRadians, int speed) {
        this.angleRadians = angleRadians;
        this.speed = speed;
    }

    public void incSpeed(int s) {
        speed += s;
    }

    public abstract void signal();
}

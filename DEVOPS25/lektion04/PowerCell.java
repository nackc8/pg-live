

public class PowerCell {
    static float totalPower = 0.0f;

    private float power = 0.0f;

    static final float PI = 3.141592f;

    public PowerCell(float power) {
        PowerCell.totalPower += power;
        this.power = power;
    }

    public PowerCell() {
        this(1f);
    }

    public float getPIPower() {
        this.PI = 3f;
        return this.PI * this.power;
    }

    public float getPower() {
        return this.power;
    }
}

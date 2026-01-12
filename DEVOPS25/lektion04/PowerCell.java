

public class PowerCell {
    static float totalPower = 0.0f;

    private float power = 0.0f;

    public PowerCell(float power) {
        PowerCell.totalPower += power;
        this.power = power;
    }

    public PowerCell() {
        this(1f);
    }

    public float getPower() {
        return this.power;
    }
}



public class PowerCell {
    static float totalPower = 0.0f;

    private float power = 0.0f;

    public PowerCell(float power) {
        PowerCell.totalPower += power;
        this.power = power;
    }

    public PowerCell() {
        PowerCell.totalPower += 1f;
        this.power = 1.f;
    }

    public float getPower() {
        return this.power;
    }
}

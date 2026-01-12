

public class PowerCell {
    static float totalPower = 0.0f;

    private float power = 0.0f;

    private void addPower(float power) {
        PowerCell.totalPower += power;
        this.power = power;
    }

    public PowerCell(float power) {
        addPower(power);
    }

    public PowerCell() {
        addPower(1f);
    }

    public float getPower() {
        return this.power;
    }
}

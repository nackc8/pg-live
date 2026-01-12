

public class PowerCell {
    static float totalPower = 0.0f;

    private float power = 0.0f;

    public PowerCell(float power) {
        this.power = power;
    }

    public PowerCell() {
        this.power = 0.f;
    }

    public static void main(String[] args) {
        PowerCell cell1 = new PowerCell();
        PowerCell cell2 = new PowerCell(0.5f);

        System.out.println(cell1.power);
        System.out.println(cell2.power);
        System.out.println(PowerCell.totalPower);
    }
}

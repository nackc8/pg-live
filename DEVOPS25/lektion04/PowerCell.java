

public class PowerCell {
    static float totalPower = 0.0f;

    float power = 0.0f;

    public 

    public static void main(String[] args) {
        PowerCell cell1 = new PowerCell();
        cell1.power = 0.3f;
        PowerCell cell2 = new PowerCell();
        cell2.power = 0.5f;

        System.out.println(cell1.power);
        System.out.println(cell2.power);
        System.out.println(PowerCell.totalPower);
    }
}



public class PowerCellMain {
    public static void main(String[] args) {
        PowerCell cell1 = new PowerCell(0.7f);
        PowerCell cell2 = new PowerCell(0.2f);
        System.out.printf("cell1.power = %f",cell1.getPower());
        System.out.println(PowerCell.totalPower);
    }
}

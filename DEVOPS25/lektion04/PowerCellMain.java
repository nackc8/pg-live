

public class PowerCellMain {
    public static void main(String[] args) {
        PowerCell cell1 = new PowerCell(0.7f);
        PowerCell cell2 = new PowerCell(0.2f);
        PowerCell cell3 = new PowerCell();
        System.out.printf("cell1.power = %f\n",cell1.getPower());
        System.out.printf("cell2.power = %f\n",cell2.getPower());
        System.out.printf("cell3.power = %f\n",cell3.getPower());
        System.out.println(PowerCell.totalPower);
    }
}

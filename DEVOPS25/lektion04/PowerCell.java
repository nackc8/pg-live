

public class PowerCell {
    static float totalPower = 0.0f;

    private float power = 0.0f;

    static final float PI = 3.141592f;
    static int foo;

    static {
        foo = 1;
        for (int i = 0; i < 10; i++) {
            foo *= 3;
        }
    }

    public PowerCell(float power) {
        PowerCell.totalPower += power;
        this.power = power;
    }

    public PowerCell() {
        this(1f);
    }

    public float getPIPower() {
// Bad: Konstant!
//        this.PI = 3f;
        return this.PI * this.power;
    }

    public float getPower() {
        return this.power;
    }
}

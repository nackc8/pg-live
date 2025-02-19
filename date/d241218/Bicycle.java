package d241218;

class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    public static void main(String... args) {
        Bicycle cycle = new Bicycle();
        System.out.println("Före");
        cycle.printStates();
        cycle.speedUp(10);
        System.out.println("Efter");
        cycle.printStates();
    }
}

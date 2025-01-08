package d241218;

public class MountainBike extends Bicycle {
    public static void main(String... args) {
        MountainBike cycle = new MountainBike();
        cycle.speedUp(5);
        cycle.printStates();
        MountainBike cycle2 = new MountainBike();
        cycle2.printStates();
    }
}

package d250110;

public class PacMain {
    public static void main(String[] args) {
        var g = new Ghost();
        var p = new Pacman();

        PacAnimal[] levelObjects = {g, p};

        for (PacAnimal i : levelObjects) {
            System.out.println(i);
        }
    }
}

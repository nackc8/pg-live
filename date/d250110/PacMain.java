package d250110;

public class PacMain {
    public static void main(String[] args) {
        Ghost g = new Ghost();
        Pacman p = new Pacman();

        PacAnimal[] levelObjects = {g,p};

    for (PacAnimal i : levelObjects) {
        System.out.println(i);
    }

    }
}

package d250110;

public class Ghost implements PacAnimal, PacAI {

    @Override
    public void moveLeft() {
        System.out.println("Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Right");
    }

    @Override
    public void moveUp() {
        System.out.println("Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Down");
    }

    @Override
    public void decideDirection() {
        System.out.println("Go left");
    }
}

package d250110;

// Ett interface implementerar man..

public class Pacman implements PacAnimal {

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
}

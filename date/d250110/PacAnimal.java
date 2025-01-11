package d250110;

// Ett interface används ofta för beteenden. I standardbiblioteket
// så är List ett exempel på ett interface för klasser som man kan
// behandla som en lista.
//
// Sedan finns det många olika listor som ArrayList och liknande. De
// olika sorternas listor är så pass olika att man inte tjänar på att
// ha en gemensam basklass som innehåller kod.

// Vårt exempel nedan är ett interface för avatarer som kan gå på
// en spelplan. Det kunde användas för både Pacman och spöken, men det
// skulle behöva utökas mycket.

public interface PacAnimal {
    public void moveLeft();
    public void moveRight();
    public void moveUp();
    public void moveDown();
}

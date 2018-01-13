package chap8;

public class SpaceShipControls {
    public void up(int velocity) {
    }

    public void down(int velocity) {
    }

    public void left(int velocity) {
    }

    public void right(int velocity) {
    }

    public void forward(int velocity) {
    }

    public void back(int velocity) {
    }

    public void turboBoost() {
    }
}

class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpacheShip [name=" + name + "]";
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip("Konoha");
        ship.forward(100);

    }
}
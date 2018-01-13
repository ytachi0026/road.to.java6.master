package chap8;

public class Frog extends Amphibian {

    @Override
    protected void printName() {
        System.out.println("Soy un Froggy");
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        ((Amphibian) f).printName();
        f.printName();
    }
}

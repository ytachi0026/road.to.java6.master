package chap8;

import java.util.Random;

public class FinalTest {

    public static void main(String[] args) {
        Clase testClase = new Clase();
        Clase testClase1 = new Clase();
        System.out.println(testClase);
        System.out.println(testClase1);
    }
}

class Clase {
    static final int number = new Random().nextInt();
    final int number2 = new Random().nextInt();

    @Override
    public String toString() {
        return "Clase [number2=" + number2 + "number=" + number + "]";
    }

}

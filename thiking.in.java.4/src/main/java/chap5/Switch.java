package chap5;

public class Switch {
    //Switch support only integral-selector, is an expression that produces an integral value
    //Switch works also with enums!

    public static void main(String[] args) {
        int key = 50;

        for (; key <= 90; key += 10) {
            switch (key) {
                case 50:
                    System.out.println((char) 50);
                    break;
                case 60:
                    System.out.println((char) 60);
                    break;
                case 70:
                    System.out.println(70);
                    break;
                case 80:
                    System.out.println(80);
                    break;
                case 90:
                    System.out.println(90);
                    break;
                default:
                    System.out.println("Default");
                    break;//break doesn't affect the loop!
            }
        }
        System.out.println("FIbonnachi! =D");
//		fibonnachi(100);
    }

    public static void fibonnachi(int numbers) {
        if (numbers <= 0) return;
        int cont = 3;

        int primero = 1;
        System.out.println(primero);
        if (numbers == 1) return;

        int segundo = 1;
        System.out.println(segundo);
        if (numbers == 2) return;

        for (; cont <= numbers; cont++) {
            int tercero = primero + segundo;
            System.out.println(tercero);
            primero = segundo;
            segundo = tercero;
        }

    }


    public static void vampireNumber() {
        //even number of digits means that is greater than 10
        long vampierNumber = 10;
        //first of all i have to get the digits

    }

}

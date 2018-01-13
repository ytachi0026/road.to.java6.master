package chap4;

public class ShortCircuit {

    public static void main(String[] args) {
        System.out.println(test1(0) && test2(2) && test3(2));
        //You notice the test3 is not invoked in your console, because with the operator AND,
        //on the second method you will get false, so the entire expression will be false!
    }


    static boolean test1(int val) {
        System.out.println("test1 val=" + val);
        System.out.println("result =" + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2 val=" + val);
        System.out.println("result =" + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test3 val=" + val);
        System.out.println("result =" + (val < 3));
        return val < 3;
    }

}

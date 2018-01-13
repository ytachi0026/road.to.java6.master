package chap6;

public class InitializationStaticOccurs {

    static String name = " I love practising with static";

    static {
        name = "Pokemon Yo To";
    }

    void printStatics() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        InitializationStaticOccurs i = new InitializationStaticOccurs();
        i.printStatics();

        System.out.println("MAIN");
//		Cups.cup1.f(1);
//		Cups cups1 = new Cups();
//		Cups cups2 = new Cups();
    }
}


class Cup {
    public Cup(int marker) {
        System.out.println("Cup ( " + marker + " ) ");
    }

    void f(int marker) {
        System.out.println("f( " + marker + " ) ");
    }
}

class Cups {
    static Cup cup1 = new Cup(1);
    static Cup cup2 = new Cup(2);

    static {
        Cup cup2 = new Cup(4);
    }

    public Cups() {
        System.out.println("Cups()");
    }

}

package chap7;

public class ProtectedExample3Companion {
    ProtectedExample protectedExample;

    public ProtectedExample3Companion() {
        super();
        protectedExample = new ProtectedExample();
    }

    public static void main(String[] args) {
        ProtectedExample3Companion protectedExample3Companion = new ProtectedExample3Companion();
        System.out.println(protectedExample3Companion.protectedExample.age);
    }
}

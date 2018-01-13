package chap7.help;


import chap7.ProtectedExample;

public class ProtectedExample2 {
    ProtectedExample protectedExample;

    public ProtectedExample2() {
        protectedExample = new ProtectedExample();
    }

    public static void main(String[] args) {
        ProtectedExample p = new ProtectedExample();

        ProtectedExample2 protectedExample2 = new ProtectedExample2();
        System.out.println(protectedExample2.protectedExample.name);
    }
}

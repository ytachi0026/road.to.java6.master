package chap8;

public class A {

    public A() {
        System.out.println("A");
    }

}


class Dog extends Animal {
    public Dog(int age) {
        super(age);
        System.out.println("Dog age: " + age);
    }

    public Dog() {
        super(11);
    }
}

class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }
}

class Root {
    Component1 componente1;
    Component2 componente2;
    Component3 componente3;

    public Root() {
        System.out.println("Root");
        componente1 = new Component1();
        componente2 = new Component2();
        componente3 = new Component3();
    }

}

class Stem extends Root {
    Component1 componente11;
    Component2 componente22;
    Component3 componente33;

    public Stem() {
        super();
        System.out.println("Stem");
        componente11 = new Component1();
        componente22 = new Component2();
        componente33 = new Component3();
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}

class Component1 {
    public Component1() {
        super();
        System.out.println("Componente 1");
    }
}

class Component2 {
    public Component2() {
        super();
        System.out.println("Componente 2");
    }
}

class Component3 {
    public Component3() {
        super();
        System.out.println("Componente 3");
    }
}
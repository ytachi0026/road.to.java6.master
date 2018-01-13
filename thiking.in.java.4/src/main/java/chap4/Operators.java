package chap4;

public class Operators {
    public static void main(String[] args) {
        int operand = 40;
        //Autoincrement, decrement
        System.out.println(operand++);
        System.out.println(operand);
        System.out.println(++operand);
        System.out.println(operand);
        //Relational operators

        Integer numberOne = new Integer(40);
        Integer numberTwo = new Integer(40);
        System.out.println(numberOne == numberTwo);
        System.out.println(numberOne != numberTwo);
        System.out.println(numberOne.equals(numberTwo));

        Dog dogOne = new Dog();
        dogOne.name = "spot";
        dogOne.says = "Ruff";
        Dog dogTwo = new Dog();
        dogTwo.name = "scruffy";
        dogTwo.says = "Wruf";
        Dog dogThree = dogOne;

        System.out.println(dogOne);
        System.out.println(dogTwo);
        System.out.println(dogOne.equals(dogThree));//It is true because it is comparing the references!

        //Logical operators

    }

}

class Dog {
    String name;
    String says;

    @Override
    public String toString() {
        return "Dog [name=" + name + ", says=" + says + "]";
    }


}

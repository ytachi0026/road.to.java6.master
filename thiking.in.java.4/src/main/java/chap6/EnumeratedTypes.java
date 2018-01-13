package chap6;

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}
//I WROTE THE ELEMENTS OF THIS ENUM IN CAPITAL LETERS, BY THE JAVA CONVENTIONS OF CONSTANTS

public class EnumeratedTypes {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + " , ordinal: " + s.ordinal());
        }

        //Working with burrito
        Burrtito plain = new Burrtito(Spiciness.NOT),
                hot = new Burrtito(Spiciness.FLAMING);
        plain.describe();
        hot.describe();
    }
}

class Burrtito {
    Spiciness degree;

    public Burrtito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.println("The burrito is: ");
        switch (degree) {//in swithc you cant repetea two integral selector
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot");
                break;
        }
    }
}
package chap6;

enum Animals {

    DOG("woof"), CAT("meow"), FISH("burble");
    //the declaration of the objects must be the first thing you must do
    String sound;

    Animals(String s) {
        sound = s;
    }

}

public class QuestionNumberFour {
    static Animals a;
    static String ytalo;
    static Ytalomon ytalito;

    public static void main(String[] args) {
        System.out.println(ytalo);
        System.out.println(Animals.DOG.sound);
        System.out.println(a.DOG.sound);
        //OBS when you have this kind of declaration, it is no necessary to initializate the enum, but if it is a class
        //you must
        System.out.println(ytalito.name);
    }
}

class Ytalomon {
    String name = "Ytalo";
}

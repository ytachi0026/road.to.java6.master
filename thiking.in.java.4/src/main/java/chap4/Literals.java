package chap4;

/**
 * The porpuse of this class is to be aware ofthe use of literals, but you may wonder what the heck
 * literals are.!
 *
 * @author ytachi0026
 */
public class Literals {

    public static void main(String[] args) {
        //Hexadecimal, 0x in lower case
        int i1 = 0x2f;
        System.out.println("i1=" + i1);
        System.out.println("i1=" + Integer.toBinaryString(i1));
        //Hexadecimal, 0x in upper case
        int i2 = 0X2f;
        System.out.println("i2=" + i2);
        System.out.println("i2=" + Integer.toBinaryString(i2));

        //Octal , leading by 0
        int i3 = 0071;
        System.out.println("i3=" + i3);
        System.out.println("i3=" + Integer.toBinaryString(i3));

        // max char hex value
        char c = 0xffff;
        System.out.println("c=" + c);
        System.out.println("c=" + Integer.toBinaryString(c));

        byte b = 0x7F;
        System.out.println("b=" + b);
        System.out.println("b=" + Integer.toBinaryString(b));

        short s = 0x7ffF;
        System.out.println("s=" + s);
        System.out.println("s=" + Integer.toBinaryString(s));


        //Suffix for double d D, float f F, long l(can be confusing as it looks like one 1) L

        long l1 = 0xFFFFFFF;
        System.out.println("l1=" + l1);
        System.out.println("l1=" + Long.toBinaryString(l1));


        //Now, do you remember this simbol e, neperiano (spanish xD), its value is 2.718
        float expFloat = 1.39e-43f;


    }
}

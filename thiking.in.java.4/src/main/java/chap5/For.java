package chap5;

public class For {
    public static void main(String[] args) {
        /***
         *
         * for(initialization ; boolean expression ; step )
         * statement
         * any of initialization boolean expression and step can be empty
         */

        for (int i = 50; i < 40; ) System.out.println("Do you hate me?");
        System.out.println("Remember boolean expression evaluates before an iteration");

        for (char c = 0; c < 128; c++) {
            //char has 16 bits!
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int) c + " character: " + c);
            }

        }

        for (int c = 0; c < 101; c++) System.out.println(c);

        int previous = 0;
        int next = 0;
        for (int i = 0; i < 25; i++) {
            next = (int) (Math.random() * 100);

            if (i > 0) {
                System.out.println("Previous: " + previous);
                System.out.println("Next: " + next);
                if (next > previous)
                    System.out.println("Greater than");
                else if (next < previous)
                    System.out.println("Less than");
                else
                    System.out.println("Equals");
            }
            previous = next;
            //primitive copy the value and keep in the stack
        }


//		int i=0;
//		for(; ;){
//			System.out.println(i);
//			next = (int)(Math.random()*100);
//			
//			if(i>0){
//				System.out.println("Previous: " + previous);
//				System.out.println("Next: " + next);
//				if(next>previous) 
//					System.out.println("Greater than");
//				else if (next < previous) 
//					System.out.println("Less than");
//				else 
//					System.out.println("Equals");
//			}
//			i++;
//			previous = next;
//			//primitive copy the value and keep in the stack 
//		}
        //If there a infinite code before this, only for with empty initialization boolean expression and step are empty, exist a compile time error, which is unreachable code

        //Playing with hexadecimal
        int numberOne = 0x0;
        int numberTwo = 0xF;
        int numberBand = 10;
        int numberThree = numberBand > 4 ? numberOne | numberTwo : numberOne & numberTwo;
        int numberFour = numberBand < 4 ? numberOne | numberTwo : numberOne & numberTwo;

        System.out.println(numberThree);
        System.out.println(numberFour);

        //The operator comma for only FOR, ajjajajaj xD
        //It works only in the step and initialization block of the for statement

        for (int i = 40, j = i, z = 10; i < 50; i++, j++, j++, z--) {//int create a variable per each comma.
            System.out.println("i= " + i);
            System.out.println("j= " + j);
            System.out.println("z= " + z);
        }


//		int workOne = 50;
//		
//		for(String pimpollo = "Pimpollo"+workOne;pimpollo.length()<50;){//int create a variable per each comma.
//			System.out.println("Im a fucking genius");
//		}

        String stringOne = "Life is a bitch";
        for (char c : stringOne.toCharArray()) {
            System.out.println(c);
        }


        //use of break and ocntinue
        //break, quits the loops without executing the rest of the statements in the loop
        //continue, continue stops the execution of the current iteration and goes back to the beginning of the loop to begin the next iteration

        for (int i = 0; i < 100; i++, i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                continue;
            }

        }


    }


}

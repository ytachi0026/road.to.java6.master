package com.devytachi.ocpjp6.objective1;

public class QuestionOneExamOne {

}


enum Operator
{
	PLUSONE{
		@Override
		int operate(int x) {
			// TODO Auto-generated method stub
			return 0;
		}  },
	MINUSONE{
		@Override
		int operate(int x) {
			// TODO Auto-generated method stub
			return 0;
		}  },
	ABS{
		@Override
		int operate(int x) {
			// TODO Auto-generated method stub
			return 0;
		} };
	abstract int operate(int x);
}	

class EnumTest1{
	public static void main(String[] args){
		int x = -10;
		for (Operator o :  Operator.values())
		{
			System.out.println(o + "of" + x + " = " + o.operate(x));
}
}
}

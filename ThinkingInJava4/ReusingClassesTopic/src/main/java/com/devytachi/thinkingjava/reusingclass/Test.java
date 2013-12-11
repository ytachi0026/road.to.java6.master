package com.devytachi.thinkingjava.reusingclass;


public class Test {
	public static void main(String[] args) {
		ReusingClassHelp help = new ReusingClassHelp();
		ReusingClassHelp2 help2 = new ReusingClassHelp2();
		help2.printName2();
	}
}

class ReusingClassHelp2 extends ReusingClassHelp{
	void printName2(){
		super.printName();
	}
}

class God{
	public void sayWhat(){
		System.out.println("Anakin I am your father");
	}
}
class Ytalo extends God{
	@Override
	public void sayWhat() {
		System.out.println("Anakin I am your father");
	}
	/**
	 * when you use a inheritance it is called it is a
	 * when you use a composition it is called it has a
	 * 
	 */
	
}
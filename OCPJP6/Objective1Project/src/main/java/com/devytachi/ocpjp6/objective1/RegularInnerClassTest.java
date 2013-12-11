package com.devytachi.ocpjp6.objective1;

public class RegularInnerClassTest {
	String name;
	
	
	
	class MyInnerClass{
		String name;
//		static String lastname;OBS you can't create any static inside inner class
		public void showText(){
			System.out.println("Jaffaldi");
		}
		public void seeOuterThis(){
			System.out.println("This: " + this);
			System.out.println("Outer: " + RegularInnerClassTest.this);
		}
	}
	public void showJaffaldi(){
		MyInnerClass test = new MyInnerClass();
		test.showText();
		System.out.println("Jorge Ernesto Ricaldi Pesantes");
	}
	
	public static void main(String[] args) {
		RegularInnerClassTest test = new RegularInnerClassTest();
		test.showJaffaldi();
		//OBS this is are the kind of declaration that you can do so as to have operating inner class
		RegularInnerClassTest.MyInnerClass testInner = test.new MyInnerClass();
		testInner.showText();
		RegularInnerClassTest.MyInnerClass testInnerTwo = new RegularInnerClassTest().new MyInnerClass();
		testInnerTwo.showText();
		testInnerTwo.seeOuterThis();
		
	}
}

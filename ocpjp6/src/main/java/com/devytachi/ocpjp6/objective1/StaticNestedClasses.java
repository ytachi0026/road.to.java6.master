package com.devytachi.ocpjp6.objective1;

public class StaticNestedClasses {

	static class ClassTest{
		String name = "Ytalo";
		static String lastname = " Borja";
		
		public void showText(){
			System.out.println(name + lastname);
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClasses.ClassTest test = new StaticNestedClasses.ClassTest();
		test.showText();
	}
}

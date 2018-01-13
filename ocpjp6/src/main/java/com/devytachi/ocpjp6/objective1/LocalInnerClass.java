package com.devytachi.ocpjp6.objective1;

public class LocalInnerClass {

	static String lastname = "Static Variable from Class";
	int age = 25;
	static String building = "IBM";
	
	
	public static void methodLocalInnerClassStatic(){
		class Inner{
			String name;
			
			public void showText(){
				System.out.println("Test inside static method: " + building);//you cant refer non static member inside this
			}
		}
	}
	
	
	public void methodToLocalInnerClass(final String name){
		
		abstract class MethodLocalInnerClassAbstract{
			abstract void pimpollo();
		}
		final class MethodLocalInnerClass{
//			static String name;OBS you cant create this kind of static in Local Inner Class
			private void showText(){
				System.out.println("Interesting: " + lastname + "/" + age);
				System.out.println("Interesting: " + name);
			}
		}
		
		final MethodLocalInnerClass test= new MethodLocalInnerClass();
		test.showText();
		
		
	}
	
	public static void main(String[] args) {
		LocalInnerClass test= new LocalInnerClass();
		test.methodToLocalInnerClass("Ytalo");
	}
}

package com.devytachi.ocpjp6.access.modifiers;

public class FatherClass {
	final void printMyName(String name){
		System.out.println("Your name is: " + name);
	}
	private void pokemon(){
		System.out.println("pokemon");
	}
	//abstract void printMyLastName();//remember an abstract method can be only decalred in a abstract class!
}

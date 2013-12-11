package com.devytachi.thinkingjava.initcleanup;

public class Constructors {
	public static void main(String[] args) {
		Flower  f = new Flower();
		f.printFlower();
	}
}
class Flower{
	int petalCount = 0;
	String s = "Initial value";
	
	public Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor with int arg only, petalCount = " + petalCount);
	}
	public Flower(String ss){
		System.out.println("Constructor with String arg only, s= " + ss);
		s = ss;
	}
	
	public Flower(String s ,  int petals){
		this(petals);
//		this(s);you can invoke only one other constructor apart from this, because the constructor invocation 
		// only appear once at the first line after the method declaration
		this.s = s;
		System.out.println("String and int args");
	}
	
	public Flower(){
		this("hi",20);
		System.out.println("Default constructor (no args)");
	}
	
	public void printFlower(){
//		this();! you cant do that because it is only allowed to use when is invoked by another constructor
		System.out.println("Petal= "+ petalCount + " S=" + s);
	}
}

package com.devytachi.ocpjp6.objective1.covariant;

public class TestCovariant {
	public A getObject() {
		System.out.println("returning A object");
		return new A();
	}

	public static void main(String[] args) {
		Father f = new Son();
		Father f1 = new  Father();
		Son g = new Son();
		
		System.out.println(f.name);
		System.out.println(f.getMyObject());
		
		System.out.println("----");
		
		System.out.println(f1.name);
		System.out.println(f1.getMyObject());

		System.out.println("----");
		
		System.out.println(g.name);
		System.out.println(g.getMyObject());
		//OBS other tricky test
		
		TestCovariant c1 = new SubCovariantTest();
		System.out.println(c1.getObject());

		
	}

}
class Father {
	String name = "I am your father";
	Object getMyObject(){
		return new Object();
	}

}
class Son extends Father{
	String name = "I am your son";
	String getMyObject(){
		return new String("Sasuke");
	}
}

	
class A {
	int x = 5;
}

class B extends A {
	int x = 6;
}

class SubCovariantTest extends TestCovariant {
	public B getObject() {
		System.out.println("returning B object");
		return new B();
	}
}

package com.devytachi.thinkingjava.initcleanup;

public class MemberInitialization {
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		System.out.println(iv);
		
		House h1 = new House();
	}
}
class InitialValues{
	boolean t;
	byte b;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	@Override
	public String toString() {
		return "InitialValues [t=" + t + ", b=" + b + ", i=" + i
				+ ", l=" + l + ", f=" + f + ", d=" + d + ", reference="
				+ reference + "]";
	}
}

class Window{
	public Window(int marker){
		System.out.println("Window ( "+ marker + " ) ");
	}
}

class House{
	Window w1 = new Window(1);
	public House() {
		System.out.println("house()");
		w3 = new Window(4);
	}
	Window w3 = new Window(3);
	Window w2 = new Window(2);
	
}
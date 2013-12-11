package com.devytachi.thinkingjava.initcleanup;

public class OverloadingVarargs {
	//be very careful with overloading varargs, you can only use ONE!
	public static void main(String[] args) {
//		f(); ambiguous
		p(1,'a');
//		p('a','b'); compile time error, the method p float Character is ambiguous, this problems will be fixed if you redefine the
		//methods, adding other parameter before the varargs
	}
	static void f(String...strings){
	}
	static void f(Integer...integers){
	}
	static void p(float f, Character...characters){
		System.out.println("first");
	}
	static void p(Character...characters){
		System.out.println("second");
	}
}

package com.devytachi.ocpjp6.objective1.help;

import com.devytachi.ocpjp6.objective1.Foo;

public class Baz {
	public static void main(String[] args) {
		Foo f = new Foo(); 
		System.out.println(f.c);
		f.ytalomon();
	}

}

interface InterfaceOne extends InterfaceTwo, InterfaceThree{
	
}

interface InterfaceTwo extends InterfaceThree {
	
}

interface InterfaceThree {
	
}

abstract interface DefinitionOfInterface{
	//this is the true definition of an interface, well there is missing the public word (i dont write it as It is already other class file)
}
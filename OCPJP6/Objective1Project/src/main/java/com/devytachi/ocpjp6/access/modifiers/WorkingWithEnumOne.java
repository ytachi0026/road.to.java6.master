package com.devytachi.ocpjp6.access.modifiers;

enum CoffeeSize {BIG, HUGE, OVERWHELMING};
public class WorkingWithEnumOne {
	
	enum Pokemon {CHARMANDER, PIKACHU}
	Pokemon ash;
	
	CoffeeSize size;
	public static void main(String[] args) {
		CoffeeSize cs = CoffeeSize.BIG;
		
		WorkingWithEnumOne object = new WorkingWithEnumOne();
		object.size = CoffeeSize.BIG;
		
		//a enum can be declared as their own separate class, or as a class member, however they mus not be declared within
		// a method.
	}
}

class TestEnumWithinClass{
	
	public static void main(String[] args) {
		WorkingWithEnumOne test = new WorkingWithEnumOne();
		test.ash = WorkingWithEnumOne.Pokemon.CHARMANDER;//enclosing class, name required
	}
}
package com.devytachi.thinkingjava.initcleanup;

public class ThisKeyWord {
	public static void main(String[] args) {
		Leaf leaf= new Leaf();
		
		leaf.increment().increment().increment().print();
		
		
		new Person().eat(new Apple());//this show how important is to know about the keyword THIS!, very amusing this example
		new Exercise8Page157().firstMethod();
	}
}

class Leaf{
	int i = 0;
	public Leaf increment() {
		i++;
		return this;
	}
	
	void print(){
		System.out.println("i= "+i);
	}
	
}


class Person{
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}
class Peeler{
	static Apple peel(Apple apple){
		return apple;
	}
}
class Apple{
	Apple getPeeled(){
		return Peeler.peel(this);
	}
}



class Exercise8Page157{
	void firstMethod(){
		///this two types of invocations works equally 
		secondMethod();
		this.secondMethod();
	}
	void secondMethod(){
		System.out.println("I am sexy and I know it");
	}
	
	
}


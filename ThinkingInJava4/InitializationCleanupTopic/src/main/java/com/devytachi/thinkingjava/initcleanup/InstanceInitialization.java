package com.devytachi.thinkingjava.initcleanup;

public class InstanceInitialization {
	public static void main(String[] args) {
		System.out.println("Starting the main");
		new Mugs();
		System.out.println("new Mugs() completed");
		new Mugs(1);
		System.out.println("new Mugs(1) completed");
		new YtaloMonSexy();
	}
}
class Mug{
	public Mug(int marker) {
		System.out.println("Mug ( "+ marker +" )");
	}
	public void f(int marker) {
		System.out.println("f( "+ marker +" )");
	}
}

class Mugs{
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug 2 initialized");
	}
	
	public Mugs() {
		System.out.println("Mugs()");
	}
	public Mugs(int i) {
		System.out.println("Mugs(int)");
	}
}

class YtaloMonSexy{
	String ytalo;
	{
		ytalo = "Smart";
	}
	public YtaloMonSexy() {
		System.out.println(ytalo);
	}
}
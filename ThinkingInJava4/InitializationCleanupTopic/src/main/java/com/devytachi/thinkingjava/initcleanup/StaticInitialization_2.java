package com.devytachi.thinkingjava.initcleanup;

public class StaticInitialization_2 {
	static String stringFirst = "ytalo";
	static String stringSecond;
	static {
		stringSecond = "Carlos";
	}
	
	public static void main(String[] args) {
		StaticInitialization_2.printAttributes();
		System.out.println(StaticInitialization_2.stringFirst);
	}
	static void printAttributes(){
		System.out.println("First: " + stringFirst);
		System.out.println("Second: " + stringSecond);
	}
	
}

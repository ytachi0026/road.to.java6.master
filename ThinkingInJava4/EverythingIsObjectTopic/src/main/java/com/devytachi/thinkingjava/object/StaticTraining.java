package com.devytachi.thinkingjava.object;

import java.util.Date;

public class StaticTraining {
	public static void main(String[] args) {
		Ytalo ytalomon1 = new Ytalo();
		Ytalo ytalomon2 = new Ytalo();
		
		System.out.println(ytalomon1.age);
		System.out.println(ytalomon2.age);
		ytalomon1.age++;
		ytalomon2.age++;
		Ytalo.age++;
		System.out.println(ytalomon1.age);
		System.out.println(ytalomon2.age);
		
		System.out.println(Ytalo.getNameYtalo());
		System.out.println("This is not my first java program, although ill make up my mind to belive that xD");
		System.out.println(new Date());
		
		/**
		 * All java program imports the library java.lang, not forget it!
		 * .out is a class (PrintStream, which belongs to System)
		 * 
		 */
		
		// this is a test about linking two classes which have static attributes and methods
		System.out.println(Genius.ytalo.name);
		System.out.println(Genius.ytalo.age);
//		System.out.println(Genius.ytalo.test);//In this part, exists NullPointerException as I didnt initialize the object Genius
		// You never can initialize the object Ytalo in Genius as it is an static object! REMEMBER
		
		System.out.println(System.getProperties());System.getProperties().list(System.out);
	}
}


class Genius{
	static Ytalo ytalo;
}
class Ytalo{
	
	String test = "do you see me?";
	static String name = "Awesome";
	static int age = 24;
	
	public static String getNameYtalo(){
		return name;
	}
}
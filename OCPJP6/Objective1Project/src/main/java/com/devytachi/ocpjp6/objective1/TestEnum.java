package com.devytachi.ocpjp6.objective1;

public class TestEnum {
	public static void main(String[] args) 
	{
		Fish f=Fish.valueOf("GUPPY");
		if(f==Fish.GUPPY)
			System.out.println("Are equal");
		if (f.equals(Fish.GUPPY)) 
			System.out.println("Are equal");
	}
}


enum Fish
{
	GOLDFISH,ANGELFISH,GUPPY;
}

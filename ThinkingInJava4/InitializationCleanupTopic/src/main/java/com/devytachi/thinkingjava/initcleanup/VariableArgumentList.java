package com.devytachi.thinkingjava.initcleanup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableArgumentList {
	public static void main(String[] args) {
		printArray(new Integer(5));
		printArray(new Integer(5),new Double(11.5));
		printArray(new Integer(5),new Double(11.5),"Yty");
		printArray((Object[]) new Integer[]{1,2,3,4});//if you define the size, you can't define the elements
		printArray(new Integer[]{1,4,});//if you define the size, you can't define the elements
		
		
		List<Integer> lstInteger = new ArrayList<Integer>();
		lstInteger.add(1);
		lstInteger.add(2);
		lstInteger.add(3);
		lstInteger.add(4);
		lstInteger.add(5);
		printArray(lstInteger);
		printArray(lstInteger,lstInteger);
		printArray();
		//invoking the method f
		f(1);
		f(2,"sexy");
		f(3,"sexy","ytalo");
	}
	
	
	public static void f(int required, String...args ){//varargs must be the last parameter
		System.out.println("required: " + required);
		for(String str : args){
			System.out.print(str+"  ");
		}
		System.out.println();
		System.out.println(Arrays.toString(args));
	}
	public static void printArray(Object... args){
		for(Object obj: args){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public void testSyntax(String... ytalo){
		
	}
	
}

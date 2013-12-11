package com.devytachi.thinkingjava.initcleanup;

import java.util.Arrays;
import java.util.Random;

public class ArrayInitialization {
	//the compiler doesn't allow you to set the size of the array!!
	//you only have the reference to the array
	public ArrayInitialization() {
	}
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6};
		int a2[];
		a2 = a1;
		for(int i =0;i<a2.length;i++){
			a2[i] = a2[i] + 1;
		}
		for(int i =0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		int[] a3 = new int[50];
		System.out.println("longitud de a3: " + a3.length );
		System.out.println(Arrays.toString(a3));
		
		//Defining no, initialization yes, you set a number ;)
		Integer[] a = new Integer[50];
		System.out.println(Arrays.toString(a));
		Random r = new Random();
		for(int i = 0;i<a.length;i++){
			a[i] = r.nextInt(9999);
		}
		System.out.println(Arrays.toString(a));
		//You can set an no-primitive array, with curly braces
		Integer[] b = {new Integer(1), new Integer(2),3,};//at last there is an autoboxing
		System.out.println(Arrays.toString(b));
		
		
	}
	
}
class Exercise16{
	public Exercise16(String string) {
		System.out.println(string);
	}
	public static void main(String[] args) {
		Exercise16 e16 []= new Exercise16[5];
		for(int i =0; i<e16.length;i++){
			e16[i] = new Exercise16("yty");
		}
		System.out.println(Arrays.toString(e16));
	}
}


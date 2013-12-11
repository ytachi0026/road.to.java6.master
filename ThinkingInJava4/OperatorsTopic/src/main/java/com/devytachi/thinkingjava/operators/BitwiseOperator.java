package com.devytachi.thinkingjava.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int numberOne = 0xF;
		int numberTwo = 0xF0;
		
		System.out.println(Integer.toBinaryString(~numberOne));
		System.out.println(Integer.toBinaryString(numberOne));
		System.out.println(Integer.toBinaryString(~numberTwo));
		System.out.println(Integer.toBinaryString(numberTwo));
//		Integer.toBinaryString(numberOne);
		
		System.out.println("Bitwise");
		System.out.println(Integer.toBinaryString(numberOne&numberTwo));
		System.out.println(Integer.toBinaryString(numberOne|numberTwo));
		System.out.println(Integer.toBinaryString(numberOne^numberTwo));
		
		//you can use bitwise operators with boolean, but it doesnt have shot circuit, it means all the entire expressions will be definitely evaluate
		
	}
}

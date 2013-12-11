package com.devytachi.ocpjp6.objective1;

public class QuestionTwoExamOne {

	public static void main(String[] args) {
		String s1 = new String("123");
		StringBuffer s2 = new StringBuffer("456");
		Integer i = add(s1, s2);
		System.out.println(i);
	}
	private static int add(Object... values) {
		int i = 0;
		for (Object s : values) {
			i += Integer.parseInt(s.toString());
		}
		return i;
	}
}
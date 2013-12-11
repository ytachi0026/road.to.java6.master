package com.devytachi.ocpjp6.objective1;

public class ArrayDeclaration {
	
	int testScores[] = new int[]{2,3,4,5};
	int testScoresAnonymous [] = new int[6];
	
	
	int[][] myArray = new int[3][];
	int[][] myArray2 = new int[9][];
	
	
	static String[][][] arr = {{{},null}, 
			{{"1","2"},
			{"1",null, "3"}},
			{},{{"1",null}}
			};
	public static void main(String[] args) {
		ArrayDeclaration test= new ArrayDeclaration();
		test.myArray[0] = new int[4];
		test.myArray[0][0] = 2;
		test.myArray[0][1] = 2;
		test.myArray[0][2] = 2;
		test.myArray[0][3] = 2;
		//OBS remember this is a good game to rack your brain as arrays are more flexible than ever
		//OBS the brackets marks the territory to the depth about arrays!
		System.out.println(arr[1][1].length);
		System.out.println(arr[1][1][0]);
		test.countElements(new int[]{1,2,3,4});
//		test.countElements(new int[2][]{null,{1,2,3,4}});//OBS it seems that varags only recieve one dimension array


	}
	
	private void countElements(int... var){
		
	}

}

package com.devytachi.thinkingjava.controllingexecution;

public class InfamoursGoTo {

	public static void main(String[] args) {
//		int i= 0 ;
//		for(; i<10;i++){
//			if(i==5) break;
//			//so break quit completely the loop and execute the step
//		}
//		System.out.println(i);
		
//		int k = 0 ;
//		test:
//		for(; k<7;k++){
//			System.out.println("K="+k);
//			if(k==5) continue test;
//		}
//		System.out.println(k);
//		
		//continue with or without label always execute step
		//break never execute step with or without label
		
		int i = 0;
		outer://colon is the dos puntos, yes im peruvian and I speak spanish... viva!
		for(;true;System.out.println("Ytalo")){
			inner:
			for(;i<10;i++){
				System.out.println("i=" + i);
				if(i==2){
					System.out.println("continue");
					continue;
				}
				if(i==3){
					System.out.println("break");
					i++;
					break;
				}
				if(i==7){
					System.out.println("continue outer");
					i++;
					continue outer;//continue execute the step for the forward loop!! REMEMBER BITCH!
				}
				if(i==8){
					System.out.println("break outer");
					break outer;
				}
				for(int k = 0 ;k<5;k++){
					if(k==3){
						System.out.println("continue inner");
						continue inner;
					}
				}
			}
		}
			
	}
}

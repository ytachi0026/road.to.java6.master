package com.devytachi.ocpjp6.objective1;

public class AnonymousInnerClasses {

	Car car = new Car(){
		public void acelerar(){
			System.out.println("Acelerar with anonymous");
		}
		
		public void fullFuel(){
			System.out.println("Full the tank");
		}
	};
	
	public void testAnonymousClassFirstFlavour(){
		//car.fullFuel();//
	}
	public static void main(String[] args) {
		AnonymousInnerClasses testAnonymous =new AnonymousInnerClasses();
		testAnonymous.car.acelerar();
		
		Engine testInterface = new Engine() {
			@Override
			public void showType() {
				System.out.println("Test about Engine, when is about interface");
			}
		};
		
		testInterface.showType();
	}
}

class Car{
	
	public void acelerar(){
		System.out.println("Acelerar");
	}
}

interface Engine{
	
	public abstract void showType();
}
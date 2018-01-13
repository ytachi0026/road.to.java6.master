package com.devytachi.ocpjp6.access.modifiers;

public class ChildClass extends FatherClass {

    //	void printMyName(String name){//be careful, even if you write the same name (method), the compiler will not allow you to continue
//		System.out.println("Your name is: " + name);
//	}
    private void pokemon() {//you can do this because the child dont know about the methods in the father
        System.out.println("pokemon");
    }

}

package com.devytachi.ocpjp6.access.modifiers;

public class TestProtectedLelvelInsidePackage {
public static void main(String[] args) {
	OtherClass oc = new OtherClass();
	System.out.println("Other level: " + oc.name);//a protected member or attribute can be access in the package level only
	//when a subclass inherits a protecte member from his father, it becomes a private member!
}
}

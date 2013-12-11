package com.devytachi.ocpjp6.access.modifiers.help;

import com.devytachi.ocpjp6.access.modifiers.OtherClass;

public class AccessClass {
	public static void main(String[] args) {
		OtherClass oc = new OtherClass();
		//you cant invoke the method testIt() as it belongs to another package, remember that this method is default access
		
	}
}

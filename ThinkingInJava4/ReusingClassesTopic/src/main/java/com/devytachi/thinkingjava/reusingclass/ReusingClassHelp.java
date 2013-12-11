package com.devytachi.thinkingjava.reusingclass;

public class ReusingClassHelp {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ReusingClassHelp() {
		super();
	}
	
	protected void printName(){
		System.out.println("Name");
	}
}

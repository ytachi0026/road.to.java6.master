package com.devytachi.thinkingjava.reusingclass;

public class Detergent extends Cleanser{

	@Override
	public void scrub() {
		append(" Detergente.srub()");
		super.scrub();
	}
	public void foam(){
		append(" foam()");
	}
	public static void main(String[] args) {
		Detergent detergente = new Detergent();
		detergente.dilute();
		detergente.apply();
		detergente.scrub();
		detergente.foam();
		System.out.println(detergente);
		System.out.println(" Testing base Class");
		Cleanser.main(args);
	}
}
class Cleanser{
	String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute(){
		append(" dilute()");
	}
	public void apply(){
		append(" apply()");
	}
	public void scrub(){
		append(" scrub()");
	}
	@Override
	public String toString() {
		return "Cleanser [s=" + s + "]";
	}
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		System.out.println(x);
	}
}
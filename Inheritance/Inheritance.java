package Inheritance;

import Encapsulation.Encapsulation;

public class Inheritance extends Encapsulation {
	
	public String CM(String name) {
		name1();
		System.out.println("Hi I'm CM");
		return name;
	}
	
	public void sample() {
		System.out.println("Hi Hello");
	}
	
	

	public static void main(String[] args) {
		State state=(State) new State();
		System.out.println(state.CM("M.K.Staline"));
		System.out.println(state.Public("Tamilnadu"));
		state.sample();
		
		
	
	System.out.println();
	System.out.println();
		State state2=new State();
		System.out.println(state2.CM("Pinarayi Vijayan"));
		System.out.println(state2.Public("Kerala"));

		
		
	}

}

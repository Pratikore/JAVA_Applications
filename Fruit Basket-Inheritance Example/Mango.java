package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
	}

	public String toString() {
		return  super.toString();
	}
	
	static String taste() {
		return "sweet";
	}
	
	static void pulp() {
		System.out.println(" Creating yellow pulp!");
	}
}

package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
	}

	public String toString() {
		return super.toString();
	}
	
	static String taste() {
		return "sweet and sour";
	}
	
	static public void jam() {
		System.out.println(" makiing jam!");
	}
	
}

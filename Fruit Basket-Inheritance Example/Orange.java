package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
	}

	public String toString() {
		return super.toString();
	}
	
	static String taste() {
		return "sour";
	}
	
	static public void juice() {
		System.out.println(" Extracting juice!");
	}
}

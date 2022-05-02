package com.app.fruits;

public class Fruit {
		String color ;
		double weight ;
		String name ; 
		boolean fresh ;
		
		public Fruit(String color, double weight, String name) {
			this.color = color;
			this.weight = weight;
			this.name = name;
			this.fresh = true;
		}

		@Override
		public String toString() {
			return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", fresh=" + fresh + "]";
		}
		
		static String taste() {
			return "No specific teste";
		}

		public boolean isFresh() {
			return fresh;
		}

		public void setFresh(boolean fresh) {
			this.fresh = fresh;
		}

}

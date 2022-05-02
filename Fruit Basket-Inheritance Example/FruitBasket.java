package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How may fruits you want to store in the Fruit-Basket?");
		Fruit array[] = new Fruit[scan.nextInt()];

		int choice = 0, count = 0;
		do {
			System.out.println(
					"1.Add Mango \n" + "2.Add Orange \n" + "3.Add Apple \n" + "4.Exit\n" + "Enter your choice!");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Mango details as color, weight, name : ");
				array[count] = new Mango(scan.next(), scan.nextDouble(), scan.next());
				count++;
				break;

			case 2:
				System.out.println("Enter Orange details as color, weight, name : ");
				array[count] = new Mango(scan.next(), scan.nextDouble(), scan.next());
				count++;
				break;
			case 3:
				System.out.println("Enter Apple details as color, weight, name : ");
				array[count] = new Mango(scan.next(), scan.nextDouble(), scan.next());
				count++;
				break;
			case 4:
				System.out.println("Thankl you!");
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
		} while (choice != 4 && count != array.length);

		for (Fruit element : array) {
			System.out.println(element.name);
		}

		System.out.println(" ");

		for (Fruit element : array) {

			System.out.println(element.toString());
			if (element.name.equals("Apple") || element.name.equals("apple"))
				System.out.println(Apple.taste());
			if (element.name.equals("Mango") || element.name.equals("mango"))
				System.out.println(Mango.taste());
			if (element.name.equals("Orange") || element.name.equals("orange"))
				System.out.println(Orange.taste());

			boolean result = element.isFresh();
			if (result)
				System.out.println(element.name + " is fresh");
			else
				System.out.println(element.name + " is stale");
		}

		System.out.println("Enter the index of the fruit to be marked as stale");
		int temp = scan.nextInt();
		if (temp > array.length)
			System.out.println("Error : Out of range!");
		else {
			array[temp].setFresh(false);
			System.out.println("Marked Successfull ");
		}

		// mark all sour fruits
		for (Fruit element : array) {
			if (element.taste().equals("sour")) {
				element.setFresh(false);
				System.out.println("Marked Successfull ");

			}
		}

		System.out.println("Enter the index of the fruit");
		temp = scan.nextInt();
		if (temp > array.length)
			System.out.println("Error : Out of range!");

		else {
			if (array[temp].name.equals("Apple") || array[temp].name.equals("apple"))
				Apple.jam();
			if (array[temp].name.equals("Mango") || array[temp].name.equals("mango"))
				Mango.pulp();
			if (array[temp].name.equals("Orange") || array[temp].name.equals("orange"))
				Orange.juice();
		}

	}

}

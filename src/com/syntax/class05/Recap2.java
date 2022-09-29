package com.syntax.class05;

public class Recap2 {

	public static void main(String[] args) {
		

		boolean allergy = true;
		String allergyType = "peanut";

		if (allergy) {
			System.out.println("Do you have any allergy?");
			if (allergyType.equals("Dairy")) {
				System.out.println("Do not consume dairy!");
			} else if (allergyType.equalsIgnoreCase("Peanut")) {
				System.out.println("Do not eat this cake, it has peanuts!");
			} else {
				System.out.println("We need to do some tests.");
			}
		} else {
			System.out.println("Great you are lucky!");
		}

	}
}

package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the
		 * price of that item. Every time user enters money, accumulate the amount and
		 * tell the user how much is left to pay off. If user give more money program
		 * should return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!"
		 */

		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("What item you want to buy?"); String item=input.next();
		 * int price=10; int user;
		 * 
		 * do { System.out.println("Its 10$"); int user=input.nextInt();
		 * 
		 * if(user<price) { System.out.println("You need another $"+(price-user)); } if
		 * (user>price) { System.out.println("Here is your change $"+(user-price)); } }
		 * while (user != price); { System.out.println("Thank you for shopping"); break;
		 * }
		 */

		System.out.println("What do you want to buy from TJ Max");
		String item = input.nextLine();

		System.out.println("What is the price of the item");
		double price = input.nextDouble();
		
		double money;
		double total = 0;

		System.out.println("Please pay for the item:");

		do {
			money = input.nextDouble();
			total += money;
			double need;
			double change;

			if (total < price) {
				need=price-total;
				System.out.println("You need another $" + need);

			} else if (total > price) {
				change=total-price;
				System.out.println("Here is your change $" + change);
				break;
			}

		} while (total != price);{		
			System.out.println("Thank you for shopping");
		}

		
		
		
		
	}

}

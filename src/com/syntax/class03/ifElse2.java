package com.syntax.class03;

public class ifElse2 {

	public static void main(String[] args) {

		boolean isHungry = true;

		if (isHungry) {
			System.out.println("Lets eat something good");
		} else {
			System.out.println("Lets watch a good movie");
		}

		if (3 > 2) {
			System.out.println("If a true statement inside the brackets and it will print");
		}
		if (2 > 3) {
			System.out.println("If there is a false statement inside the brackets it won't print anything");
		}

		double myBankBalance = 2000;
		double amountToWithdraw = 2500;
		if (myBankBalance > amountToWithdraw) {
			System.out.println("I will be able to withdraw the money succesfully");
		}

		else {
			System.out.println("Not enough balance to execute transaction");
		}

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class InputFromTheKeyboard {

	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);
		System.out.println("Please enter your comment:");
		String sentence=keyboard.nextLine();
		System.out.println(sentence);
	}

}

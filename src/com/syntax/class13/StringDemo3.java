package com.syntax.class13;

public class StringDemo3 {
	
	public static void main(String[] args) {
		
		String str="sdasdDGfuckAzwyZDGD12412419AF%$^$#$%#&";
		System.out.println(str.replaceAll("[0-8]", "#")); //replaceAll replaces group of characters with another character
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[u]", "*"));
		System.out.println(str.replaceAll("[a-k]", ""));
		System.out.println(str.replaceAll("[A-z]", "")); //its a range that works with ASCII table
		System.out.println(str.replaceAll("[^A-Z]", "")); //replace everything but ^
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
	}

}

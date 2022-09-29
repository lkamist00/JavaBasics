package com.syntax.class12.StringClass;

public class StringDemo3 {

	public static void main(String[] args) {
		String str=" i love java ";
		System.out.println(str);
		System.out.println(str.trim());// removes empty spaces before and after the String but not between words
		
		System.out.println("-------------");
		String str2="Java is very easy";
		System.out.println(str2.startsWith("Java"));//boolean checks with which word or character the String starts
		System.out.println(str2.endsWith("Java"));	//boolean checks with which word or character the String ends
		System.out.println(str2.contains("java"));	//boolean checks which word or character the String has/contains
		System.out.println(str2.toLowerCase().contains("java"));
		
	}

}

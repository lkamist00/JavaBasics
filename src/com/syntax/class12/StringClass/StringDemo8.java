package com.syntax.class12.StringClass;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="I am writing SPX options";
		System.out.println(str.replace("writing", "selling")); //replaces one String with another in a String);
		
		String str2="@#$@#$ ASDASD sdas da $#@#$!7^&*32342";
		System.out.println(str2.replaceAll("[a-z]","#")); //replaceAll it takes a pattern and replace all char that follow that patern
		
		
	}

}

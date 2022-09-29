package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode3 {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		if the average score >=90 → grade=A
		if the average score >= 70 and <90 → grade=B
		if the average score>=50 and <70 → grade=C
		if the average score<50 → grade=F
		*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("What did you score on the exam?");
		String grade;
		int score=input.nextInt();
		
		if(score>=90) {
			grade="A";
		}else if(score>=70 && score<90) {
			grade="B";
		}else if(score>=50 && score<70) {
			grade="C";
		}else if(score<50 && score>=0) {
			grade="F";
		}else {
			System.out.println("Please enter valid score");
			grade="None";
		}
		System.out.println("Your grade is "+grade);
		
		

	}

}

package homework;

import java.util.Scanner;

public class StringClass3 {

	
		public static void main(String[] args) {
			
			/*
			Write a program that reads two people's first
			names and if they expecting boy or girl? 
			Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL*/
				

			Scanner input=new Scanner(System.in);
			System.out.println("Please enter Mom's name");
			String motherName=input.next();
			System.out.println("Please enter Dad's name");
			String fatherName=input.next();
			
			System.out.println("Is the baby boy or a girl");
			String gender=input.next();
			
			
			if(gender.equals("girl")) {
				System.out.println(motherName.substring(0,motherName.length()/2)+fatherName.substring(fatherName.length()/2));
			}else if(gender.equals("boy")) {
				System.out.println(fatherName.substring(0,fatherName.length()/2)+motherName.substring(motherName.length()/2));
			}else {
				System.out.println("Error 02:11");
			}
			
			
			
			
			
			
		}
}

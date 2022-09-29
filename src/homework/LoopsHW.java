package homework;

import java.util.Scanner;

public class LoopsHW {
	
	public static void main(String[] args) {
		
		//1. Print numbers from 1 to 100 in 1 line with space
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("--------------");
		
		//2. Print numbers from 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}

		System.out.println("--------------");
		//3. Print even numbers from 20 to 1 (2 ways)
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		
		System.out.println("--------------");
		//3. Print even numbers from 20 to 1 (2 ways)
		int i=20;
		while(i>=1) {
			if(i%2 == 0) {
				System.out.print(i+" ");		
			}
			i--;
		}
	
		System.out.println("--------------");
		//4. Print odd numbers between 20 and 50 (2 ways)
		for(int a=20; a<=50; a+=2) {
			System.out.print(a+" ");
		}
		
		System.out.println("--------------");
		int a=20;
		while(a<=50) {
			if(a%2 ==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println("--------------");

		//5. Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner scan=new Scanner(System.in);
		String name;
		
		
		for(int b=1; b<=3; b++) {
			System.out.println("What's your name?");
			name=scan.nextLine();
			System.out.println("Good afternoon "+name);
		}		

		System.out.println("--------------");
		
		
		
	}

}

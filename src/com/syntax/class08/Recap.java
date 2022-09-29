package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		//from range of 1 to 50 find the sum of all even and all odd numbers
				/*int oddSum=0;				
				for(int i=1; i<=50; i+=2) {
					oddSum+=i;
				}
				System.out.println(oddSum);
				
				
				int evenSum=0;
				for(int a=0; a<=50; a+=2) {
					evenSum+=a;
				}
				System.out.println(evenSum);*/
				int evenSum=0;
				int oddSum=0;
				
				for(int i=0; i<=50; i++) {
					if(i%2==0) {	
						evenSum+=i;
					}else {
						oddSum+=i;
					}
				}
				
				System.out.println(evenSum);
				System.out.println(oddSum);
				
				
		//create a secret number and let user guess the secret number
		//once user guesed your secret number, program says you won
				
				Scanner input= new Scanner(System.in);
				int secretNumber=7;
				int user;
				
				do {
					System.out.println("Guess the secret number");
					user=input.nextInt();
										
				}while(user!=secretNumber); {
					System.out.println("You won");
				}
					
					
				
				
				

	}

}

package homework;

import java.util.Scanner;

public class ScannerHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have a credit card? True/False");
		boolean result=scan.nextBoolean();
		
		if(result) {
			System.out.println("What is the balance on your credit card?");
			int balance=scan.nextInt();
			if(balance>1000) {
				System.out.println("You need to pay that off first.");
			}else{
					System.out.println("You can spend more.");
				
				}
		}else {
			System.out.println("We have a new offer for you!");
		}
		
		
		
		
		
		
		
	}

}

package reviewclass4;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysDemo5 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many dresses you want to buy?");
		int count=input.nextInt();
		
		double[] prices=new double[count];
		
		for(int i=0; i<count; i++) {
			System.out.println("Please enter the size of dress no "+(i+1));
			prices[i]=input.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		
		double sum=0;
		for(double price:prices) {		
			sum+=price;
		}
		System.out.println("Total price of all dresses is "+sum);
		

	}

}

package com.syntax.class07;

public class WhileLoopDemo2 {
	
	public static void main(String[] args) {
		
		//print all numbers from 1 to 10
		
		int i=1;
		
		while(i<=10) {
			System.out.print(i+" ");
			i++; //starting from 1 it will print +1 until num<=10 is true, after that 11<=10 is false and will stop printing
		}
		
		System.out.println("------------------------------------");
		//print all numbers from 10 to 25
		int a=10;
		while(a<=25) { // print if number is less than 25
			System.out.print(a+" ");
			a++; // print if number -1 is less than 25, until it reaches 10
		}
		System.out.println("---------------------");
		//print from 10 to 1
		int b=10;
		while(b>=1) {//print if number is equal or more than 1
			System.out.print(b+" ");
			b--;//print if number -1 is equal or more than 1, until it reaches 1
		}
		
		System.out.println("---------------------");
		
		//print all numbers from 50 to 20
		int c=50;
		while(c>=20) {
			System.out.print(c+" ");
			c--;
		}
		
		System.out.println("---------------------");
		
		int e=1;
		while(e<=20) {
			System.out.print(e+" ");
			e+=2;
		}
		System.out.println("---------------------");
		
		//print all even numbers from 1 to 20
		
		int d=1;
		while(d<=20) {
			if(d%2 == 0) {
				System.out.print(d+" ");					
			}
			d++;				
		}
		
		
		
	}

}

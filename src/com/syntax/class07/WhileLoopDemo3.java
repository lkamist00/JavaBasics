package com.syntax.class07;

public class WhileLoopDemo3 {

	public static void main(String[] args) {
		//Print numbers from 100 to 1
		int a=1;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println("----");
		//Print even numbers from 20 to 100 
		int b=20;
		while(b<=100) {
			System.out.print(b+" ");
			b+=2;
		}
		
		System.out.println("------------------------------");
		//Print only odd numbers from 100 to 1
		int c=99;
		while(c>=1) {
			System.out.print(c+" ");
			c-=2;
		}
		
		System.out.println("-------------------------------");
		//Print only odd numbers from 100 to 1
		int d=100;
		while(d>=1) {
			if(d%2 !=0) {
				System.out.print(d+" ");	
			}
			d--;
		}
		
		

	}

}

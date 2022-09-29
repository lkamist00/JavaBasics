package com.syntax.class09.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		//We use arrays to store multiple values inside one variable int [] i={1,2,3,4};
		//its always fixes in size
		
	
		
		/* 	int[]b
			10		20		30		40		//elements
			b[0]	b[1]	b[2]	b[3]    //values are stored in indexes, starts with 0
			
			*/
		
		int[] a=new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		//accesing elements from the array
		
		System.out.println(a[2]); //30
		
		System.out.println(a[1]+a[2]); //20+30 50
	
		
		//lets create an array and store your classmates
	
		String[] names=new String[5];
		
		names[0]="John";
		names[1]="Mike";
		names[2]="Tashak";
		names[3]="Zumbula";
		names[4]="Temno";
		
		System.out.println("Hello "+names[3]);
		
		
		
		
		
		
	}

}

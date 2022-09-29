package com.syntax.class10arrays2;

public class Arrays2dDemo {

	public static void main(String[] args) {
		
		int[][] arr= {
				{10,20,30,40},		//1 array
				{100,200,300,400},	//2 array
				{1,2,3,4}			//3 array
			};

		System.out.println(arr[0][1]);
		
		/*Create a 2D array (longer way)where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Trump.
		After storing values print following String:
		Mrs Smith, Mr Trump, Ms Jackson, Miss Jordan.

		
		*/
		
		String[][] names= new String[4][4];
		
		names[0][0]="Mr";
		names[0][1]="Mrs";
		names[0][2]="Ms";
		names[0][3]="Miss";
		
		names[1][0]="Smith";
		names[1][1]="Jordan";
		names[1][2]="Jackson";
		names[1][3]="Trump";
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		System.out.println("-------------------------");
//		/Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades. 
		//Then your program should print name of the students that has A and B grade
		
		String[][] array= {
				{"John","Mark","Tom","Steve"},
				{"A","B","C"}
		};
		
		System.out.println(array[0][0]+" has a grade "+array[1][0]);
		System.out.println("-------------------------");
		
		
		
		
		for(String[] singleArr:array) {		//loops over 1d or single array
			for(String el:singleArr) {		//loops ofer each element of every array
				System.out.print(el+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		
		
		
		
		
	}

}

package com.syntax.class10arrays2;

public class Arrays2d {

	public static void main(String[] args) {
		
		//types of arrays - one dimensional arrays, 2d,3d
		//						[rows][columns]		
		int[][] bigArray= new int [3][4]; 
		//row 1
		bigArray[0][0]=10;
		bigArray[0][1]=20;
		bigArray[0][2]=30;
		bigArray[0][3]=40;
		//row 2
		bigArray[1][0]=100;
		bigArray[1][1]=200;
		bigArray[1][2]=300;
		bigArray[1][3]=400;
		//ror 3
		bigArray[2][0]=1;
		bigArray[2][1]=2;
		bigArray[2][2]=3;
		bigArray[2][3]=4;
		
		//how to access elements from 2d array
		System.out.println(bigArray[1][2]);
		
		int[][] arr= {
				{10,20,30,40},
				{100,200,300,400},
				{1,2,3,4}
			};
		
	
		
		
		
	}

}

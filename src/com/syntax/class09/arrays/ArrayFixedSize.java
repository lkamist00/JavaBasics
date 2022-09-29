package com.syntax.class09.arrays;

public class ArrayFixedSize {

	public static void main(String[] args) {
		
		int[] nums=new int[3];
		
		//
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[0]);
		
		
		String[] colors=new String[3];
		
		colors[0]="red";
		colors[1]="green";
		colors[2]="black";
		//colors[3]="gold"; //ArrayIndexOutOfBoundsException: Index 3 
		
		System.out.println(colors[2]);
		
		
		

	}

}

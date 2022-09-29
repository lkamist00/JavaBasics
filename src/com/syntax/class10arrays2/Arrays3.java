package com.syntax.class10arrays2;

public class Arrays3 {

	public static void main(String[] args) {
		
		String[][] countries= {
				{"USA","Canada",},
				{"Brasil","Peru","Argentina"},
				{"France","Spain","Sweden","Macedonia","Italy"},
				{"Egypt","Sudan","Etiopia"},
				{"China","Japan","Mongolia"}
		};
		
		System.out.println(countries.length);
		
		int elOf01Arr=countries[0].length;
		System.out.println("Number of elements from 1 array is "+elOf01Arr);
		
		int elOf02Arr=countries[1].length;
		System.out.println("Number of elements from 2 array is "+elOf02Arr);
		
		//getting all the vallues from 2d array
		
		for(int r=0; r<countries.length; r++) { //loops over rows
			for(int c=0; c<countries[r].length; c++ ) {
				System.out.print(countries[r][c]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}

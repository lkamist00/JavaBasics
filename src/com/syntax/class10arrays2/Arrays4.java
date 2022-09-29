package com.syntax.class10arrays2;

public class Arrays4 {

	public static void main(String[] args) {
	
		String[][] countries= {
				{"USA","Canada",},
				{"Brasil","Peru","Argentina"},
				{"France","Spain","Sweden","Macedonia","Italy"},
				{"Egypt","Sudan","Etiopia"},
				{"China","Japan","Mongolia"}
		};
		
		for(String[] country:countries) {
			for(String c:country) {
				if(c.equals("Macedonia")) {
					System.out.println(c+" is my home country");
				}else {
				System.out.print(c+" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
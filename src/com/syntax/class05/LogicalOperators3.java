package com.syntax.class05;

public class LogicalOperators3 {

	public static void main(String[] args) {
		
		double savings=200000;
		boolean freeTime=true;
		String season="Summer";
		
		if(savings>100000 && freeTime && season.equals("Summer")) {
			System.out.println("I can take vacation");
		}else {
			System.out.println("I need time and money");
		}
		
		
		

	}

}

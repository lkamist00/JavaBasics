package com.syntax.class09.arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		String[] week= {"monday","tuesday","thursday","sunday","friday"};
		
		//if day is sunday -->it is a funday, otherwise is boring day
		for(String day:week) {
			if(day.equals("sunday")) {
				System.out.println("its a funday");
				
			}else if(day.equals("friday")) {
				System.out.println("its expiration day");
				
			}else {
			System.out.println("its a boring day");
			}
		}
		
		for(int i=0; i<week.length; i++) {
			System.out.println(week[i]);
		}
		
	}

}

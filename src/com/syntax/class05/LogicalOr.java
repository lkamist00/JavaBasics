package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* Logical:	&&(and),||(or),!(not)
		 * true || true 	--> TRUE
		 * true || false	--> TRUE
		 * false|| true		--> TRUE
		 * false|| false	--> FALSE
		*/
		
		String day="saturday";
		if(day.equals("saturday") || day.equals("sunday")) {
			System.out.println("I have Java class at Syntax - using logical Or ||");
		}
		System.out.println("----------------------------------");		
		if(day.equals("saturday") && day.equals("sunday")) {
			System.out.println("I have Java class at Syntax - using logical And &&");
		}
		System.out.println("----------------------------------");
		
		double money=80000;
		String title="Automation tester";
		
		if(title.equals("Automation tester") || money==120000) {
			System.out.println("Happy");
		}
		else {
			System.out.println("Sad");
		}
		
		

		
		
		
		
	}

}

package com.syntax.class03;

public class ifElse5 {

	public static void main(String[] args) {
		
		/*if (boolean condition){             					/works only with boolean, gives us only 1 or 0 outcomes
			is true, execute code A;
		 *	}else{
		 *			execute code B;
		 *}
		 */
		boolean weekend=false;
		
		if(weekend) {
			System.out.println("I have Java class");
		}else {
			System.out.println("I don't have Java class");
		}
		
		
		String day="Saturday";
		if(day.equals("Saturday")) {
			System.out.println("I have 5 hours course");
		}else {
			System.out.println("I have 3 hours course");
		}
		
		//---------------------------------------------------
		int date=3;
		if(date==3);
		System.out.println("Today is the third");
		
		//-----------------------------------------------------
		
		String name="Tupan";
		if(name.equals("Pampur")) {
			System.out.println("I love Mondays");
		}
		else {
			System.out.println("I love Weekends");
		}
		//------------------------------------------------------
		/*if(boolean condition){
		 * code A;
		 * }else if(boolean condition){
		 * code B;
		 * }else if(boolean condition){
		 * code C;
		 * }
		 */
		
		
	 
		
		
		
		
	}

}

package homework;

import java.util.Arrays;

public class StringClass2 {

	public static void main(String[] args) {
		/*Create a String and print it in reverse order (Sunday → yadnuS).*/
		
		
		String day=new String("Sunday");
		System.out.println(day);
		
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		
		System.out.println();
		char[] charArr=day.toCharArray();
		
		for(int i=charArr.length-1; i>=0; i--) {
			System.out.print(charArr[i]);
		}
	
		
		
		
		
	}

}

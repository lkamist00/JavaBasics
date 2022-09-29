package InterviewQuestions;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		

		String str="I love options writing";
		
		char[] charArray=str.toCharArray(); //converts String to an Array of chars
		
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[7]);
		
		int counter=0;
		
		for(char c:charArray) {
			if(c=='a') {
				counter++;
			}
		}
		System.out.println("letter a has appeared "+counter+" times");
		
		
	}

}

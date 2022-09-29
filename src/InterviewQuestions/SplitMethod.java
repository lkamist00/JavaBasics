package InterviewQuestions;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		
		String str="I like writing options spreads"; //split string words into index
		
		String [] arr=str.split(" ");				//use the " " empty space to separate the words into separate indexes
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		
		String str2="Today is Tuesday, I sold call spread, for 500$";
		String [] arr2=str2.split("[,]");
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[2]);

	}

}

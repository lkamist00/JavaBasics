package homework;

public class StringClass {

	public static void main(String[] args) {

		/*Create a String and if the String is not empty perform the following: 
		if the String has an odd number of characters and has 3 or more characters, 
		print the character in the middle of the String.*/
		
		String str="Options";
		int num=str.length();
		int middle=num/2;
		
		if(!str.isEmpty() && str.length()%2!=0 && str.length()>=3) {		
			System.out.println(str.charAt(middle));
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

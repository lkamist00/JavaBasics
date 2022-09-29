package homework;

public class TemperatureCheck {

		public static void main(String[] args) {
			
			/*Create a Java program and name it Temperature Check. Create variable to store temperature. 
			Your program should check if temperature is below 32 then it should print “Water will freeze with temperature ”, 
			otherwise “Water will NOT freeze with temperature ”.
			[3:27 PM]*/
			
			double temperature=32;
			
			if(temperature<32) {
				System.out.println("Water will freeze with temperature"+temperature);
			}
			else {
				System.out.println("Water will NOT freeze with temperature "+temperature);
			}
			
			
			//Write a program to check whether number is positive or negative.
			
			double num=-8;
			
			if(num<0) {
				System.out.println(num+" is negative");
			}
			else if(num>0) {
					System.out.println(num+" is positive");
				}
			else {
				System.out.println("Number is neither positive nor negative");
			}
			
			
			
			
			
			
			
			
		}
		
}

package homework;

public class DoubleComparison {

	public static void main(String[] args) {
			
		/*Create a Java program and name it Double Comparison. 
		  Declare 2 double values and if value of first variable is higher then the second, print “Double value  is larger than  .” Otherwise print...*/
		
		double num1=1961;
		double num2=532;
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}
		else {
			System.out.println(num1+" is not larger than "+num2);
		}
		
		
		/*Create a Java program and declare int variable that will hold a month.
		 *  Based on the value of the variable your program should print the name of the month.
		 */
		
		int month=8;
		
		if(month==1) {
			System.out.println("January");
		}
		else if(month==2) {
			System.out.println("February");
			}
		else if(month==3) {
			System.out.println("March");
			}
		else if(month==4) {
			System.out.println("April");
			}
		else if(month==5) {
			System.out.println("May");
			}
		else if(month==6) {
			System.out.println("June");
			}
		else if(month==7) {
			System.out.println("July");
			}
		else if(month==8) {
			System.out.println("August");
			}
		else if(month==9) {
			System.out.println("September");
			}
		else if(month==10) {
			System.out.println("October");
			}
		else if(month==11) {
			System.out.println("November");
			}
		else if(month==12) {
			System.out.println("December");
			}
		else	{
			System.out.println("Please enter value 1-12");
		}
		
		
		
		
	}

}

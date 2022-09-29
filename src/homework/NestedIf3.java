package homework;

import java.util.Scanner;

public class NestedIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        char gender=input.next().charAt(0);

        System.out.println("Please enter your age");
        int age=input.nextInt();

        if(age>=25){
          if(gender=='M'){
            System.out.println("Man");
          }if(gender=='F'){
           System.out.println("Woman"); 
          }
        }else if (age<25){
          if(gender=='M'){
            System.out.println("Boy");
          }
          if(gender=='F'){
            System.out.println("Girl");
          }        
        
     }

		
	}

}

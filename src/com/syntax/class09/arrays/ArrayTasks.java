package com.syntax.class09.arrays;

public class ArrayTasks {

	public static void main(String[] args) {
		
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * then print a grade B (use 2 different ways of creating an array).
		 */
		
		char[] grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		System.out.println("-------------------------");
		
		char[] grade1= {'A','B','C','D','E','F'};
		
		System.out.println(grade1[1]);
		
		System.out.println("-------------------------");

/*Create an array of names and store all names of your group. Then print your name from that array. 
 * (use 2 different ways of creating an array).  
 */
		
		String[] names=new String[3];
		names[0]="Oliveira";
		names[1]="Kamachev";
		names[2]="Gamrot";
		
		System.out.println(names[2]);
		
		System.out.println("-------------------------");
		
		String[] firstName= {"Charles","Islam","Polak"};
		
		System.out.println(firstName[0]);
		System.out.println("-------------------------");
		
/*Create an array of words: Java, Saturday, day, coding, is. 
 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
 */
		
		
		String[] words=new String[5];
		
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		System.out.println("-------------------------");
		
		String[] words1= {"Java","Saturday","day","coding","is"};
		
		System.out.println(words1[1]+" "+words1[4]+" "+words1[0]+" "+words1[3]+" "+words1[2]);
		
		

	}

}

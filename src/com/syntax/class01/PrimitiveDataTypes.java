package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		// storing and representig whole numeric values
		byte box1 = 127; // up to 127
		short box2 = 32767; // up to 32767
		int box3 = 1254255888; // popular
		long box4 = 54684548454665465l; // credit cards, transaction id...

		// storing decimal values
		float variable1 = 1.99F;
		double variable2 = 99.99;// popular

		// storing single characters
		char container = 'A';
		char percentage = '%';

		// storing yes/no values
		boolean hot = true;
		boolean tired = false;

		System.out.println(variable2);// printing the value
		System.out.println("variable2");// printing text

		System.out.println(tired);
		System.out.println(hot);

		// HW 1: Please print value of every variable we created in class
		// PrimitiveDataTypes

		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(variable1);
		System.out.println(variable2);
		System.out.println(container);
		System.out.println(percentage);
		System.out.println(tired);
		System.out.println(hot);

	}

}

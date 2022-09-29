package homework;

public class HomeworkNonprimitive {

	public static void main(String[] args) {
		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say. “The __ of 2 numbers __ and is equal to __”
		 */

		double a = 10.99;
		double b = 2.55;

		System.out.println("The addition of 2 numbers, " + a + " and " + b + " is equal to " + (a + b));
		System.out.println("The substraction of 2 numbers, " + a + " and " + b + " is equal to " + (a - b));
		System.out.println("The multiplication of 2 numbers, " + a + " and " + b + " is equal to " + (a * b));
		System.out.println("The division of 2 numbers, " + a + " and " + b + " is equal to " + (a / b));
		System.out.println("------------------------");

		/*
		 * Write a program to find the square of the number 3.9. You program should say
		 * “The square of the is “
		 */

		double square1 = 3.9;
		System.out.println("The square of " + square1 + " is " + (square1 * square1));
		System.out.println("------------------------");

		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say. “The perimeter of a rectangle with
		 * width and height __ is equal to __ and the area is __”
		 */

		int width1 = 5;
		int height1 = 8;

		System.out.println("The perimeter of a rectangle with a width " + width1 + " and height " + height1 + " is "
				+ 2 * (width1 + height1) + " and the area is " + (width1 * height1));

	}

}

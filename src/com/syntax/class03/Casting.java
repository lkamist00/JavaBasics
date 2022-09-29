package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting => type = data type casting = converting converting one data
		 * type to another
		 * 
		 * when we want to convert a data type into a smaller data type Java does it
		 * automatically, int box1=box2; if we want to convert the data type into a
		 * bigger data type we use type casting int box1=(int)box2;
		 * 
		 * converting from small to larger data type it's called implicit or widening or
		 * automatic converting from larger to smaller data type it's called explicit or
		 * narrowing or manual
		 * 
		 * we use type casting so we can use code written by someone else or when
		 * working in teams
		 */

		byte box1 = 127; // smallest box, 8 bits
		short box2 = 3333; // slightly large box 16 bits
		int box3 = 343453434; // large box 32 bits
		long box4 = 551543544654l;// slightly larger box 64 bits
		float box5 = 12423423; // larger 32 bits
		double box6 = 342342344; // largest

		int number = (int) 15.2; // we can't store decimal number in a box of type int
		System.out.println(number);

		long smallerBox = (long) box2;
		System.out.println(smallerBox);

		short biggerBox = box1;

		long box7 = box1; // we can do this because box7 is larger than box1
		float box8 = (float) box6; // float box8=box6; error, with (float) we know java can't change it, but we
									// force it anyway

		char a = (char) 67;
		System.out.println(a);

		int box9 = (int) box4;
		System.out.println(box9);

	}

}

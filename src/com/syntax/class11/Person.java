package com.syntax.class11;

public class Person {


	String name;
	String id;
	String department;
	double salary;
	String shift;
	int age;
	double weight;
	double height;
	boolean isFunny;
	boolean losingHair;
	
	void study() {
		if(name.equals("Vna")) {
			System.out.println("Ja sam Icho Vnata");
		}else if(name.equals("Scratch")) {
			System.out.println("I will have a big nose and I will be scratching my nose");
		}else {
			System.out.println("I will make a lot of money");
		}
	}
	
	public static void main(String[] args) {
		
		Person person1= new Person();
		
		person1.name="Scratch";
		person1.age=39;
		person1.losingHair=true;
		person1.isFunny=false;
		person1.study();
		
		Person person2=new Person();
		person2.name="Lkamist";
		person2.age=30;
		person2.losingHair=false;
		person2.isFunny=true;
		person2.study();
	}
	
	
}

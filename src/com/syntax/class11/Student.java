package com.syntax.class11;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMsg() {
		System.out.println("Student is deleting messages");
	}
	
	void eat() {
		System.out.println("Eating tomahawk");
	}
	
	public static void main(String[] args) {
		
		Student student1= new Student();
		
		student1.name="Donki";
		student1.age=37;
		student1.id="12354";
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		student1.eat();
		student1.eat();
		
		System.out.println("------------------------");
		Student student2=new Student();
		student2.name="Bobija";
		student2.age=80;
		student2.weight=300;
		student2.gender='M';
		System.out.println(student2.name);
		student2.eat();
		student2.study();
		
	}
	
	
}

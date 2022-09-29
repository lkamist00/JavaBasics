package com.syntax.class11;

public class Employee {
	
	String name;
	String id;
	String department;
	double salary;
	String shift;
	
	void work() {
		System.out.println(name+" is working on shift "+shift);
	}
	
	void takeLeaves() {
		System.out.println(name+" is going on leaves");
	}
	
	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		emp1.name="Shina";
		emp1.id="54234";
		emp1.department="Farbara";
		emp1.salary=1000000;
		emp1.shift="Morning";	
		emp1.work();
		
		Employee emp2=new Employee();
		emp2.name="Al Capone";
		emp2.department="Mafia";
		emp2.shift="Evening";
		emp2.id="1435";
		emp2.work();
		
		
		
		
	}
	
	

}

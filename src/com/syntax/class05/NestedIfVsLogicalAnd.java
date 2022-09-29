package com.syntax.class05;

public class NestedIfVsLogicalAnd {

	public static void main(String[] args) {
		
		boolean programmer = true;
		boolean manualTester = true;
		boolean knowFramework=false;
		
		if(programmer) {
			System.out.println("You are a programmer let's see about manual testing");
			if(manualTester) {
				if(knowFramework) {
					System.out.println("You can be an automation engineer");
				}else {
					System.out.println("You need to know a framework as well");
				}
			}else {
					System.out.println("You need to know manual testing as well");
				}
				}
		
		else {
			System.out.println("You need to be programmer as well");
			}
		

	
	}
}

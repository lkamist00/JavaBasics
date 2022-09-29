package com.syntax.class12.StringClass;

public class PhoneTester {
	/*if class whos object we are creating is present
	 * inside the same package, we dont need to import it
	 */
	public static void main(String[] args) {
		

		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="14 pro max";
		iphone.year=2022;
		iphone.storage=128;
		iphone.makeCall();
		
		//new Phone(); to crete new object
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 ultra";
		samsung.year=2022;
		samsung.storage=256;
		samsung.takingPic();
		
	}
	
}

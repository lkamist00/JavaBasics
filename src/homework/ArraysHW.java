package homework;

public class ArraysHW {

	public static void main(String[] args) {
		//HW. 1. Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars=new String[6];
		
		cars[0]="Urus";
		cars[1]="BMW";
		cars[2]="Audi";
		cars[3]="Rolls";
		cars[4]="Honda";
		cars[5]="Nissan";
		
		for(int i=0;i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("-----------------");
		
		String[] autos= {"Urus","BMW","Audi","Rolls","Honda","Nissan"};
		for(String auto:autos) {
			System.out.println(auto);
		}
		System.out.println("-----------------");		

		//2. Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array.

		String[] animals= {"Lion","Tiger","Wolf","Dog","Elephant"};
		
		for(int a=0; a<animals.length; a++) {
			System.out.println(animals[a]);
		}
		System.out.println("-----------------");	
		
		for(String zivotno:animals) {
		System.out.println(zivotno);
		}
		System.out.println("-----------------");			
		
		//3. Create an array on integers and calculate the sum of all elements in an array
		
		int[] nums= {1,55,876,12};	
		int sum=0;
		
		for(int b=0; b<nums.length; b++) {
			sum+=nums[b];
		}
		System.out.println(sum);
		
		sum=0;	
		for(int num:nums) {
			sum+=num;
		}
		System.out.println(sum);
		
		System.out.println("-----------------");
		
	
		}
	}


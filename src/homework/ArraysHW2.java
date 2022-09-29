package homework;

public class ArraysHW2 {

	public static void main(String[] args) {
	//4. From an array of integer elements find the largest number.
		
	int[] num= {14,125,-2412,48,-1,9778,6189,64,6359,1,385};
	int largest=num[0];
	
	for(int i=0; i<num.length; i++) {
		if(num[i]>largest) {
			largest=num[i];
		}
	}
	System.out.println(largest);	
	System.out.println("------------------------");
	
	largest=num[0];
	
	for(int n:num) {
		if(n>largest) {
			largest=n;
		}
	}
	System.out.println(largest);
	
	
	
	//5. Create an array to store char values and then print those in reverse order
	
	char[] grades= {'A','B','C','D','E'};
	
	for(int a=0; a<grades.length; a++) {
		System.out.print(grades[a]+" ");
	}
	System.out.println("------------------------");
	
	for(int a=grades.length-1; a>=0; a--) {
		System.out.print(grades[a]+" ");
	}
	
	

	}

}

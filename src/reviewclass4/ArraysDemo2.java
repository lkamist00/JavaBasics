package reviewclass4;

public class ArraysDemo2 {

	public static void main(String[] args) {

		int[] arr=new int[] {10,20,30};
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Print all elements "+arr[i]);
		}
		
		for(int ar:arr) {
			System.out.println(ar);
		}
		
		//prints all elements of array without a loop
		//System.out.println(Arrays.toString(arr));
		

	}

}

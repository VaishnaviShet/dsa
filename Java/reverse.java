package dsaPractice;

//Reverse the array using 2 pointers.
public class reverse {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("Before:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int start =0, end = arr.length-1;
		
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		
		System.out.print("\nAfter\n");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}


/* Output
 * 
Before:
1 2 3 4 5 6 
After
6 5 4 3 2 1 
 * 
 */

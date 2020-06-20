package Arrays;

public class ValueEqualtoitsIndex {

	public static void main(String[] args) {
		
		
		int arr[] = {-4,-2,2,4,6,9};
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]== i) {
				
				System.out.println("Print the index : " + arr[i]);
				
			}
		}

	}

}

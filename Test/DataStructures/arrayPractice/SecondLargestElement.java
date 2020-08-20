package arrayPractice;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		int arr[]  = {12, 3, 4, 8, 1};
		int largest= arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i< arr.length; i++) {
			
			if(largest < arr[i]) {
				
				largest = arr[i];
			} if(arr[i] > secondLargest && largest < arr[i]){
				
				secondLargest = arr[i];
				
			}
			
		}
		System.out.println(largest);
		System.out.println(secondLargest);

	}

}

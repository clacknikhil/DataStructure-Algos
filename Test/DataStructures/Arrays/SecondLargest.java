package Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {12, 19, 10, 3, 9, 8 };
		//output =7
		int n = arr.length;
		int largest = arr[0];
		int secondLargest=arr[0];
		
		for(int i =0; i< n; i++) {
			
			if(largest < arr[i]) {
				largest = arr[i];
			}
			if(arr[i] > secondLargest && largest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println(secondLargest);
		System.out.println(largest);
	}

}

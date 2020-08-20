package SlidingWindowsAlgos;

public class SubarraysumisK {

	// https://www.youtube.com/watch?v=kh-RHRd4KZ4
	// Function to print sub-array having given sum using
		// sliding window technique

	static void subArraysum(int arr[], int sum) {
		
		int windowSum =0;
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
		
			
			while(windowSum < sum && j< arr.length) {
				
				windowSum += arr[j];
				j++;
				
			}
			if(windowSum == sum) {
				
				System.out.println(i + "to"+ (j-1));
			}
			
			windowSum -= arr[i];
		}
		 

	}

	public static void main(String[] args) {

		int arr[] = { 1,2,1,1,4,2,5,6,2,1,1,4 };
		int sum =9;
		SubarraysumisK.subArraysum(arr, sum);
		
	
		
		

	}

}

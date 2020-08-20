package SlidingWindowsAlgos;

public class LargestSumofkWindow {
	
	//find the sum of sub array of size of size 'k' in an given array
	
	static void largestSum(int arr[], int k) {
		
		int sum = 0;
		
		for(int i=0; i<k; i++) 
			
			sum += arr[i];
		
		System.out.print(sum+ " "); 
    	
		for(int i=k; i<arr.length; i++) {
			
			sum = (sum-arr[i-k]) +arr[i];
			System.out.print(sum+ " "); 
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int k = 3;
		LargestSumofkWindow.largestSum(arr, k);
		
		
		

	}

}

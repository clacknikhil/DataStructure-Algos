package Arrays;

public class LongestSubArraySum {
	
	//Kadane's Algorithm
	
	public static int Kadane(int arr[]) {
		
		int max_so_far = 0;
		int max_end_here = 0;
		
		for(int i : arr) {
			
			max_end_here = max_end_here + i;
			
			max_end_here = Integer.max(max_end_here,0);
			max_so_far = Integer.max(max_so_far, max_end_here);

		}
		
		return max_so_far;
		
	}

	public static void main(String[] args) {
		
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println("The sum of contiguous sub-array with the " +
							"largest sum is " + Kadane(A));
	

	}

}

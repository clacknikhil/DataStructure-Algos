package Arrays;

import java.util.Arrays;

public class PairsAddingtoGivenSum2 {

	public static void main(String[] args) {
		
// Time Complexity of this solution is O(nlogn).
		//This is better method exist which gives time complexity of O(nLogn).
		int arr[] = {1,4,5,3,9,7,6,8,14,2};
		int sum = 9;
		
		Arrays.sort(arr);
		
		int i =0;
		
		int j = arr.length-1;
		
		while(i< j) {
			
			if(arr[i]+arr[j]==  sum) {
				
				System.out.println("("+arr[i]+ "," + arr[j]+")" +","+ sum);
				i++;
				j--;
			}
			else if(arr[i] +arr[j] < sum){
				i++;
			}
		     else if (arr[i]+ arr[j] > sum) {
		    	 
		    	 j--;
		     }
			
			
			
		}
		
	}
		
}

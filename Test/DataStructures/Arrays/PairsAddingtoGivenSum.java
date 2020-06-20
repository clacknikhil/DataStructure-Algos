package Arrays;

public class PairsAddingtoGivenSum {

	public static void main(String[] args) {
		
// Time Complexity of this solution is O(n^2). So, this is not the recommended solution for large arrays. There is better method exist which gives time complexity of O(nLogn).
		int arr[] = {1,4,5,3,9,7,6,8,14,2};
		int sum = 9;
		
		for(int i=0; i< arr.length; i++){
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] + arr[j] == sum) {
					
					System.out.println("("+arr[i]+ "," + arr[j]+")" +","+ sum);
					
				}
			}
			
			
			
		}

	}

}

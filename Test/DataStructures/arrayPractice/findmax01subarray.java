package arrayPractice;

public class findmax01subarray {
	
	
	static int maxSubArray(int arr[],  int n) {
		
		int sum=0;
		int maxSize = -1;
		int startIndex =0;
		int endIndex = 0;
		
		
		for(int i=0; i<n-1; i++) {
			
			if(arr[i] == 0)
				sum = -1;
			else
				sum = 1;
			
			
			for(int j= i+1; j< n; j++) {
				
				if(arr[j] == 0)
					sum = sum -1;
				else
					sum = sum +1;
				
				
				if(sum ==0 && maxSize < j -i +1) {
					
					maxSize = j - i -1;
					startIndex = i;
					
				}
				
			}
			
		}
		
		endIndex = startIndex + maxSize -1;
		
		if(maxSize == -1) {
			
			System.out.println( "No Such Sub Array");
		}else {
			
			System.out.println(startIndex + "to" +  endIndex);
		}
		
		return maxSize;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 0, 1, 1, 1, 0, 0};
		int n = arr.length;
		
		maxSubArray(arr, n);

	}

}

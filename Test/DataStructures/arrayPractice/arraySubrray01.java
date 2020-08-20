package arrayPractice;

import java.util.HashMap;

public class arraySubrray01 {
	
	static int maxLen(int arr[]) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int sum=0;
		int maxLen =0;
		int n = arr.length;
		int startIndex =0;
		int endIndex =0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i]== 0) {
				arr[i] =-1;
			}else {
				arr[i] = 1;
			}
			
		}
		
		for(int i=0;i<n; i++) {
			
			sum = sum + arr[i];
			
			if(sum == 0) {
				
				maxLen = i+ 1;
				endIndex =i;
			}
			
			if(map.containsKey(sum)) {
				
				if(maxLen < i - map.get(sum)) {
					
					maxLen = i - map.get(sum);
					endIndex = i;
				}
			}else {
				
				map.put(sum, i);
			}
			
		}
		
		startIndex = endIndex - maxLen +1;
		System.out.println(startIndex + "to" + endIndex);
		return maxLen;
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };

		System.out.println(maxLen(arr));
	}

}

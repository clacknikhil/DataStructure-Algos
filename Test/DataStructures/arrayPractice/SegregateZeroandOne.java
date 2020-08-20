package arrayPractice;

import java.util.Arrays;

public class SegregateZeroandOne {
	
	static void segregate(int arr[], int n) {
		
		int left =0;
		int right = n-1;
		
		while(left < right) {
			
			while(arr[left] ==0 && left < right)
				left++;
			
			while(arr[right]==1 && left < right)
				right--;
			
			if(left < right) {
				
				arr[left] =0;
				arr[right] = 1;
				left++;
				right--;
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {0,0,1,0,1,1,0,1};
		int n = arr.length -1;
		SegregateZeroandOne.segregate(arr, n);
		System.out.println(Arrays.toString(arr));

	}

}

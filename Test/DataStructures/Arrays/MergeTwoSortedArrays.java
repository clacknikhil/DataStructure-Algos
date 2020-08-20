package Arrays;

public class MergeTwoSortedArrays {
	
	

	public static void main(String[] args) {
		
		int arr1[] = {1,2,5,6,9};
		int arr2[] = {3,4,7,8,10};
		
		int n = arr1.length;
		int m = arr2.length;
		
		int result[] = new int[ m + n];
		int i=0;
		int j=0;
		int k=0;
		
		while(i < n && j < m) {
			
			if(arr1[i] < arr2[j]) {
				
				result[k++] = arr1[i++];
			}else {
				
				result[k++] = arr2[j++];
			}
			
			
		}
		
//		System.arraycopy(arr1, i, result, k, m-i);
//		System.arraycopy(arr2, j, result, k, n-j);
		for(int p : result) {	
		System.out.print(p + " ");
		
		}
	}

}

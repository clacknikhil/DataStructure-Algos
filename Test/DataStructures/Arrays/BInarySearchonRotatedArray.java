package Arrays;

public class BInarySearchonRotatedArray {
	
	
	static int searchIndex(int arr[],  int start, int end, int key) {
		
		if(start > end)
			return -1;
		
		
		int mid = (start + end)/2;
		
		if(arr[mid] == key)
			return mid;
		
		if(arr[start]<= arr[mid]) {
			
			if(key >= arr[start] && key <= arr[mid])
				return searchIndex(arr, start, mid-1, key);
			
			return searchIndex(arr, mid+1, end, key);
			
		}
		
		if(key >= arr[mid] && key <= arr[end])
			return searchIndex(arr, mid+1, end, key);
		
		return searchIndex(arr, start, mid-1, key);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {9,12,14,16,17,3,4,5};
		int n = arr.length;
		int key = 4;
		
		int i =searchIndex(arr, 0, n-1, key);
		
		if(i != -1)
			
			System.out.println("Elemen is at index :" + i);
		else 
			
			System.out.println("Element not present");
		
		

	}

}

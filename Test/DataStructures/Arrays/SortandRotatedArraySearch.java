package Arrays;

public class SortandRotatedArraySearch {
	
	static int search(int arr[], int left, int right, int key) {
		
		if(left > right) 
			return -1;
		
		int mid= (left+ right)/2;
		
		if(arr[mid] > arr[left]) {
			
			if(arr[left] <= key && key <= arr[mid] ) {
				return search(arr, left, mid-1, key);
			}else {
				
				
				return search(arr, mid+1, right, key);
			}
			
			
		}else {
			if(key >= arr[left] && key <= arr[right]) {
				return search(arr, mid+1, right, key);
			}else {
				
				return search(arr, left, mid-1,key);
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		int arr[] = { 12, 13, 14, 15, 16, 10 };
		int left =0;
		int right = arr.length-1;
		int key =10;
		int search = search(arr, left, right, key);
		if(search == -1) {
			
			System.out.println("not found");
		}else {
			System.out.println("found at index" + search);
		}

	}

}

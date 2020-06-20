package SortingAlgorithms;

public class HeapSort {
	
	void heapify(int arr[],int n,int i) {
		
		int largest = i;
		int l = 2*i +1 ;
		int r = 2*i + 2;
		
		if(l< n && arr[l]> arr[largest])
			largest = l;
		if (r<n && arr[r]> arr[largest])
			largest =r;
		if(largest != i) {
			int swap = arr[i];
			arr[i]= arr[largest];
			arr[largest]= swap;
			
			heapify(arr, n, largest); //recursively calling
		}
	}
	
	public void sort(int arr[]) {
		
		int n = arr.length;
		
		for(int i= n/2-1; i>=0; i--) 
			
			heapify(arr, n ,1);
		
		for(int i = n-1; i>0 ; i--) {
			
			int temp = arr[0];
			arr[0]= arr[i];
			arr[i]= temp;
			
			heapify(arr,i ,0);
		}
		
	}
	
	//print array
	
	void printArray(int arr[]) {
		
		int n = arr.length;
		
		for(int i=0; i<n ; i++) {
			
			System.out.print(arr[i]+ ",");
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {20,13,1,7,10};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
		
		

	}

}

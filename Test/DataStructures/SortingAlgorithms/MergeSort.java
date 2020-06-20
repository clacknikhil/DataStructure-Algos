package SortingAlgorithms;

public class MergeSort {

	
	void mergeSort(int arr[], int lb, int ub) {
		
		if(lb < ub) {
			
			int mid = (lb+ub)/2;
			
			mergeSort(arr, lb, mid);
			mergeSort(arr, mid+1, ub);
			merge(arr, lb, mid, ub);
			
			
		}
		
		
	}
	
	void merge(int arr[], int lb, int mid, int ub) {
		
		int i = lb;
		int j = mid+1;
		int k = lb;
		
		// divided into 2 arrays and their index start from i and j
		
		while(i<=mid && j<= ub) {
			
			if(arr[i]<= arr[j]) {
				
				arr[k]= arr[i];
				k++;
				i++;
				
			}else {
				
				arr[k]= arr[j];
				k++;
				j++;
			}
			
		}
		
		if(i> mid) {
			
			while(j<=ub) {
				
				arr[k]= arr[j];
				j++;
				k++;
			}
		}else {
			
			while(i<=mid) {
				
				
				arr[k]= arr[i];
				i++;
				k++;
			}
		}
		
	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.mergeSort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 

	}

}

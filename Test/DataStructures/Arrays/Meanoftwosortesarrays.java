package Arrays;

public class Meanoftwosortesarrays {

	public static void main(String[] args) {
		
		int arr1[]= {1,4,5,7,9};
		int arr2[] = {2,3,6,8,10,11,12,13};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
	// merge sort algo is used
		int merge[] = new int[n1+ n2];
		int i=0, j=0,k=0, x;
		
		
		while(i<n1 && j<n2) {
			
			if(arr1[i]< arr2[j]) {
				
				merge[k]= arr1[i];
				i++;
				k++;
				
			}
			else {
				
				merge[k] = arr2[j];
				j++;
				k++;
			} 
			
		}
		while(i < n1) 
			merge[k++] = arr1[i++];
		while(j< n2)
			merge[k++] = arr2[j++];
		for(x=0; x< n1+ n2; x++)
			System.out.print(" " +merge[x]);

	}

}

package Arrays;

public class ReversalofNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 23, 7, 2, 9, 5 };

		int n = arr.length;
		int i = 0;
		int j = n - 1;

		while (i < j) {

			swap(arr[i], arr[j]);
			i = i+1;
			n = n-1;
			
			for(int k=0; k<n; k++) {
				
				System.out.print(arr[k]);
			}

		}
		
		

	}
	
	static void swap(int i, int j) {
		
		int temp= i;
		i =j;
		j= temp;
		
		
	}

}

package Arrays;

public class DuplicatesInArrayinOofN {
	
	static void printDuplicates(int arr[], int n){
		
		int flag=0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[arr[i] % n] >= n) {
				
				if(arr[arr[i] %n] < 2*n) {
					
					System.out.print(arr[i]% n + " ");
					flag =1;
				}
			}
			
			arr[arr[i] % n] += n;
			
		}
		
		if(!(flag >0))
			System.out.println("-1");
			
	}

	public static void main(String[] args) {
		int arr[] = {1,2,4,2,4,5};
		int n = arr.length;
		printDuplicates(arr, n);
	
	}

}

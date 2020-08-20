package arrayPractice;
public class DuplicatesInArray {
	
	static void Duplicates(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.print(arr[i] + " ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,-1, 2,-1, 2};
		Duplicates(arr);
	
	}

}

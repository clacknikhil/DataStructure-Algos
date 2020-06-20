package Arrays;

import java.util.HashSet;

public class Findalltripletswithzerosum {

	
	//wrong needs to check
	public static void main(String[] args) {
		
		int arr[] = {0, -1, 2, -3, 1};
		
		int sum =0;
		
		for(int i=0; i<arr.length-1; i++) {
			
			boolean found = false;
			HashSet<Integer> set = new HashSet<>();
			
			for(int j=i+1 ;j<arr.length; j++) {
				
				int x = -(arr[i]+ arr[j]);
				
				if(set.contains(x)) {
					
					System.out.printf("%d %d %d\n", x, arr[i], arr[j]); 
					found= true;
				}
			}
			if(found==false) {	
				
				System.out.println("No found");
			}
		}

	}

}

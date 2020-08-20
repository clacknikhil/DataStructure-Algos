package Arrays;

import java.util.HashMap;


public class FindNumberComingOddTimes {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int n = arr.length;
		
		HashMap<Integer,Integer> hmap = new HashMap<>(); 
		
		for(int i =0 ; i< n; i++) {
			
			if(hmap.containsKey(arr[i])) {
				
				hmap.put(arr[i], hmap.get(arr[i])+1);
				
			}else {
				
				hmap.put(arr[i], 1);
			}
			
		}
		System.out.print(hmap);
		System.out.println();
		
		for(Integer a:hmap.keySet() ) {
			
			if(hmap.get(a)%2 != 0) {
				
				System.out.println("Odd number occurence : " + a);
			}		
			
		}

	}

}

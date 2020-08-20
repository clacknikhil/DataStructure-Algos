package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicatesUsingHashing {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(Integer i: arr) {
			
			if(map.containsKey(i)) {
				
				map.put(i, map.get(i)+1);
			}else {
				
				map.put(i, 1);
			}
			
		}
		
		System.out.print(map);
		
		//o(n) better solution
		HashSet<Integer> set = new HashSet<>();
		
		for(int x:arr) {
			
			if(!set.add(x)) {
				System.out.println(x);
			}
			
		}

	}

}

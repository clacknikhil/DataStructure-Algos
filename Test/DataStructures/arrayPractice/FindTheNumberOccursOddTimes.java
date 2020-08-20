package arrayPractice;

import java.util.HashMap;

public class FindTheNumberOccursOddTimes {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(Integer x: arr) {
			
			if(map.containsKey(x)) {
				
				map.put(x, map.get(x)+1);
			}else {
				
				map.put(x, 1);
			}
			
		}
		
		for(Integer a: map.keySet()) {
			if(map.get(a) %2 != 0) {
				
				System.out.println(a);
			}
		}

	}

}

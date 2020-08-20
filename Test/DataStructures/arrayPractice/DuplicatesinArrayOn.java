package arrayPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesinArrayOn {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,4,1,2};
		System.out.println(arr.length);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int x: arr) {
			
			if(map.containsKey(x)) {
				map.put(x, map.get(1)+1);
			}else {
				
				map.put(x, 1);
			}
			
		}
		System.out.println(map);
		Set<Map.Entry<Integer, Integer>> es = map.entrySet();
		for(Map.Entry<Integer, Integer> me : es) {
			
			if(me.getValue() > 1) {
				
				System.out.println(me.getKey());
			}
			
		}
	}

}

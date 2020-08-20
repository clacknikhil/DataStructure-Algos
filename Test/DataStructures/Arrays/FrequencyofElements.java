package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofElements {
	
	static void CountFrequency(int arr[]) {
		
		int n = arr.length;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i: arr) {
			
			if(map.containsKey(i)) {
				
				map.put(i, map.get(i)+ 1);
			}else {
				
				map.put(i, 1);
			}
			
		}
		System.out.println(map);
		
		for(Map.Entry mapElement : map.entrySet()) {
			
			System.out.println(mapElement.getKey() + " occurs " + mapElement.getValue() + "times");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {1,3,2,1,4,7,2};
		CountFrequency(arr);

	}

}

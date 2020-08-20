package StringPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccurenceinaString {

	public static void main(String[] args) {
		String str="ppppppxzzzabcabcabcdabceabcabc";
		
		char[] ch = str.toCharArray();
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(Character c : ch) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> l : map.entrySet()) {
			
			int m = l.getValue();
			
			if(m>=1) {
				System.out.print(l.getKey());
				
			}
			
		}

	}

}

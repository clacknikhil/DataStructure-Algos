package Strings;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Nonrepeating {

	public static void main(String[] args) {
		
		String str = "nikhiltuli";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		char[] arr = str.toCharArray();
		
		for(Character ch : arr ) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+ 1);
			}
			else {
				
				map.put(ch, 1);
			}
		}
		System.out.print(map);
		Set s = map.keySet();
		
		{
		
	}
	
	}

}

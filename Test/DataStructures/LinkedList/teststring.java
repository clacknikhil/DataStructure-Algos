package LinkedList;

import java.util.HashMap;

public class teststring {

	public static void main(String[] args) {
		
		String str = "nikhil";
		
	
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		
		for(Character ch : arr) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+ 1);
			}
			else {
				map.put(ch, 1);
				
			}
			
			System.out.print(map);
		}
		
	}

}

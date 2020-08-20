package Arrays;

import java.util.HashMap;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		String s = "AAARWWRWRRA";
		

		HashMap<Character, Integer> map = new HashMap<>();
		char ch[] = s.toCharArray();

		for (Character i : ch) {

			if (map.containsKey(i)) {

				map.put(i, map.get(i) + 1);
			} else {

				map.put(i, 1);
			}

			System.out.print(map);

		}
	}

//		Iterator<Character> itr = map.keySet().iterator();
//		while(itr.hasNext()) {
//			
//			Character value = itr.next();
//			
//			System.out.println(map.get(value));
//			
//		}
//	}

}

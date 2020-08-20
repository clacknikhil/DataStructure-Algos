package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfOccinSortedArray {

	static void countOccurences(int arr[]) {

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int i : arr) {

			if (map.containsKey(i)) {

				map.put(i, map.get(i) + 1);
			} else {

				map.put(i, 1);
			}

		}

		System.out.println(map);

		for (Map.Entry mapElement : map.entrySet()) {

			System.out.println(mapElement.getKey() + " occurs " + mapElement.getValue() + "times");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
		countOccurences(arr);

	}

}

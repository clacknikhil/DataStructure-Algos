package arrayPractice;

import java.util.HashMap;

public class Array01subarray {

	static int maxlen(int arr[]) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		int sum = 0;
		int maxLen = 0;
		int n = arr.length;
		// int startIndex = 0;
		// int maxIndex = -1;

		for (int i = 0; i < n; i++) {

			if (arr[i] == 0) { // arr[i] = arr[i == 0] ? -1 :1;
				arr[i] = -1;
			} else {
				arr[i] = 1;
			}
		}

		for (int i = 0; i < n; i++) {

			sum = sum + arr[i];

			if (sum == 0) {

				maxLen = i + 1;
			}

			if (hm.containsKey(sum)) {

				if (maxLen < i - hm.get(sum)) {

					maxLen = i - hm.get(sum);

				}
			} else {

				hm.put(sum, i);
			}

		}
		return maxLen;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 1, 0 };

		System.out.println(maxlen(arr));

	}

}

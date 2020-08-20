package Arrays;

public class maxSubArraySum {

	static void maxSubArraySum(int arr[], int size) {

		int max_so_far = Integer.MIN_VALUE;
		int current_max = 0;
		int start = 0;
		int end = 0;
		int s = 0;

		for (int i = 0; i < size; i++) {

			current_max += arr[i];

			if (current_max < 0) {
				current_max = 0;
				s = i + 1;

			}

			if (max_so_far < current_max) {

				max_so_far = current_max;
				start = s;
				end = i;

			}
		}
		
		System.out.println("Max sum" + max_so_far);
		System.out.println("Starting index" + start);
		System.out.println("Ending" +  end);

	}

	public static void main(String[] args) {
		
		int arr[] = {1,4,2,-1,-6,4,7};
		int size = arr.length;
		maxSubArraySum(arr, size);


	}

}

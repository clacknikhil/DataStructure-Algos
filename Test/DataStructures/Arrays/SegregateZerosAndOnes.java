package Arrays;

public class SegregateZerosAndOnes {

	static void segregate0and1(int arr[], int n) {

		int left = 0;
		int right = n - 1;

		while (left < right) {

			while (arr[left] == 0 && left < right)
				left++;

			while (arr[right] == 1 && left < right)
				right--;

			if (left < right) {

				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;

			}
		}

	}

	public static void main(String[] args) {
		
		SegregateZerosAndOnes seg = new SegregateZerosAndOnes();

		int arr[] = { 0, 1, 1, 0, 0, 1, 1, 0 };
		int n = arr.length;

		seg.segregate0and1(arr, n);
		
		for(int a : arr){ 
			System.out.print(a+" "); 
		}

	}

}

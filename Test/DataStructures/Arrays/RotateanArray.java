package Arrays;

public class RotateanArray {
	
	static void leftRotate(int arr[], int n, int k) {

		int mod = k % n;

		for (int i = 0; i < n; i++)
			System.out.print(arr[(i + mod) % n] + " ");

		System.out.println();
	}
	
	static void RightRotate(int arr[], int n, int k) {

		int mod = k % n;
		// System.out.println(k);

		for (int i = 0; i < n; i++)
			System.out.print(arr[(i + mod) % n] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
		RotateanArray rotate = new RotateanArray();
		int arr[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int n = arr.length;

		rotate.RightRotate(arr, n, 2);

		rotate.leftRotate(arr, n, 2);

	}

}

package SortingAlgorithms;

public class SelectionSort {

	public void selectionSort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min = i;

			for (int j = i + 1; j < n; j++) 

				if (arr[j] < arr[min]) 

					min = j;
				

				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
		}




	}

	public static void main(String[] args) {

		int arr[] = { 12, 3, 5, 2, 7, 11 };
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + ",");
		}

	}

}

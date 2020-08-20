package arrayPractice;

import java.util.Set;
import java.util.TreeSet;

public class ArrayIntersection {
	
	public static void intersection(int a[], int b[]) {
		
		Set<Integer> set1 = new TreeSet<Integer>();
		for(int i: a) {
			
			set1.add(i);
			
		}
		
		Set<Integer> set2 = new TreeSet<Integer>();
		for(int i: b) {
			
			set2.add(i);
		}
		
		System.out.println(set2);
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3};
		int arr2[] = { 3, 4, 5, 6, 7};
		intersection(arr1, arr2);
	

	}

}

package Practice;

import java.util.Set;
import java.util.TreeSet;

public class IntesectionArray {
	
	static void IntersectArray(int arr1[], int arr2[]) {
		
		Set<Integer> set1 = new TreeSet<>();
		for(int i: arr1) {
			
			if(set1.contains(i)) {
				
				set1.add(i);
			}
			
		}
		
		Set<Integer> set2 = new TreeSet<>();
		
		for(int i : arr2) {
			if(set1.contains(i)) {
				set2.add(i);
			}
		}
		
		System.out.println(set2);
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {7,8,9};
		
		IntersectArray(arr1, arr2);

	}

}

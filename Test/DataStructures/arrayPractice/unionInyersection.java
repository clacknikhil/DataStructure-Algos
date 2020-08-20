package arrayPractice;

import java.util.HashSet;

public class unionInyersection {
	
	static void printUnion(int arr1[], int arr2[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i< arr1.length; i++) 
			set.add(arr1[i]);
		
		for(int i=0;i < arr2.length; i++)
			set.add(arr2[i]);
		
		System.out.println(set);
	}
	
	static void printIntersection(int arr1[], int arr2[]) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++) 
			set1.add(arr1[i]);
		
		for(int i=0; i< arr2.length; i++)
			if(set1.contains(arr2[i]))
				set2.add(arr2[i]);
		
		System.out.println(set2);
	}
	

	public static void main(String[] args) {
		int arr1[] = {4,6,3,2, -1};
		int arr2[] = {5,6, -1, 4};
		
		//printUnion(arr1, arr2);
		printIntersection(arr1, arr2);
		

	}

}

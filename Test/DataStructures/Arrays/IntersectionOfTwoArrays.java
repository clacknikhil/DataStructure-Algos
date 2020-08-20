package Arrays;

import java.util.*;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {

	static void IntersectArray(int a[], int b[]) {

		 Set<Integer> set1 = new TreeSet<Integer>();
		    for(int i: a){
		        set1.add(i);
		    }
		    
		    
		 
		    Set<Integer> set2 = new TreeSet<Integer>();
		    for(int i: b){
		        if(set1.contains(i)){
		            set2.add(i);
		        }
		    }
		    System.out.println(set2);
		 
		  
	}
		

	public static void main(String[] args) {

		int arr1[] = { 1, 1, 2, 1, 2, 3};
		int arr2[] = { 4, 5, 0, 5, 7, 2, 7, 3,3 };

		IntersectArray(arr1, arr2);
		
	}

}

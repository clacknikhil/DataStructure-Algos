package Arrays;

public class IntersectionoftwoSortedArrays {
	
	static void printIntersection(int a[],int b[], int n, int m ) {
		
		int i=0;
		int j=0;
		
		while( i < n &&  j < m) {
			
			if(a[i] < b[j]) {
				i++;
			}
			else if( b[j] > a[i]) {
				j++;
			}else {
				
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
	}

}

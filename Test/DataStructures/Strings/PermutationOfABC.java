package Strings;

public class PermutationOfABC {
	
	public String swap(String str, int i, int j) {
		
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		
		return String.valueOf(ch);
		
	}
	
	
	private void permute(String str, int l, int r) {
		
		if(l == r)
			System.out.println(str);
		else {
			
			for(int i= l; i< r; i++) {
				
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static void main(String[] args) {
		
	        String str = "ABC"; 
	        int n = str.length(); 
	        PermutationOfABC permutation = new PermutationOfABC(); 
	        permutation.permute(str, 0, n-1); 
	    

	}

}

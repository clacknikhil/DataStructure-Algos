package Strings;

public class Palindrome {

	static boolean isPalindrome(char []ch) {
		
		int len = ch.length;
		
		if(len == 0)
			return true;
		
		char ptr1 = ch[0];
		char ptr2 = ch[len-1];
		
		while(ptr2 > ptr1) {
			
			if( ptr1 !=ptr2)
				return false;
			
			ptr1++;
			ptr2--;
		}
		return true;
	}

	public static void main(String args[]) {
	    	
	    	String str = "abeba";
	    	char ch[] = str.toCharArray();
	    	if(Palindrome.isPalindrome(ch)) {
	    		
	    		System.out.println("String is Palindrome");
	    	}else {
	    		
	    		System.out.println("String is not a Palindrome");
	    	}
	    	

	}

}

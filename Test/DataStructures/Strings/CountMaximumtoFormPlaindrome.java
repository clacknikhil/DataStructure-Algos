package Strings;

public class CountMaximumtoFormPlaindrome {
	
	
	static boolean isPalindrome(char[] ch) {
		
		int len = ch.length;
		
		if(len == 0)
			return true;
		
		char ptr1 = ch[0];
		char ptr2 = ch[len-1];
		
		while(ptr2 > ptr1) {
			
			if(ptr1 != ptr2) 
				return false;
			
			ptr1++;
			ptr2--;
		}
		
		return true;
		
	}
	
	static int noOfAppends(String str) {
		
		if(isPalindrome(str.toCharArray()))
			return 0;
		
		str = str.substring(1);
		
		return 1 + noOfAppends(str);
	}

	public static void main(String[] args) {
		String str = "abede";
		int appends = CountMaximumtoFormPlaindrome.noOfAppends(str);
		System.out.println("Number of Appends: " + appends);

	}

}

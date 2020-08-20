package StringPractice;

public class PalindromePractice {

	public static void main(String[] args) {
		
		String str = "abcba";
		char [] ch = str.toCharArray();
		boolean isPalindrome = true;
		int j = ch.length-1;
		for(int i=0; i< ch.length; i++) {
			
			if(ch[i] != ch[j]) {
				isPalindrome = false;
			}
			j--;
		}
		
		if(isPalindrome) {
			
			System.out.println("String is Palindrome");
		}else {
			
			System.out.println("String is not a Palindrome");
		}

	}

}

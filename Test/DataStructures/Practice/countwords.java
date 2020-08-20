package Practice;

public class countwords {
	
	static String reverse(String str) {
		
		String [] s = str.split(" ");
		String reverse= "";
		for(int i=s.length-1; i>=0; i--) {
			
			reverse += s[i] + " ";
			
		}
		return reverse;
	}
	
	static boolean isPalindrome(String words) {
		
		char ch[] = words.toCharArray();
		int j= ch.length-1;
		
		for(int i=0; i< ch.length; i++) {
			
			if(ch[i] != ch[j]) {
				return false;
			}
			j--;
		}
		return true;
	}
	
	static int wordsCount(String str) {
		
		String[] wo = str.split(" ");
		int count =0;
		
		for(int i=0 ; i< wo.length; i++) {
			
			if(isPalindrome(wo[i])) {
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "my madam a seen noon";
		String reversedString = reverse(str);
		System.out.println(reversedString);
		System.out.println(wordsCount(reversedString));
		

	}

}

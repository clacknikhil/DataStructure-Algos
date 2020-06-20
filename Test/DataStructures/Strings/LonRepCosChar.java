package Strings;

public class LonRepCosChar {
	
	static char longestConsecChar(String str) {
		
		int n = str.length();
		int count = 0;
		char res = str.charAt(0);
		int curr_count = 1;
		
		for(int i= 0; i< n; i++) {
			
			if(i< n-1 && str.charAt(i) == str.charAt(i+1))
				curr_count ++;
			else {
				
				if(curr_count > count) {
					
					count = curr_count;
					res = str.charAt(i);
				}
				
				curr_count =1;
				
			}
		}
	
		
	return res;
		
		
	}
	

	public static void main(String[] args) {
		String str = "aaaaaeefffsssaa";
//		LonRepCosChar ch = new LonRepCosChar();
		char ch =longestConsecChar(str);
		System.out.println("Longest consecuitve character :" +  ch);

	}

}

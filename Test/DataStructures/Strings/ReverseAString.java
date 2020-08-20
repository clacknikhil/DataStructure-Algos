package Strings;

public class ReverseAString {
	
	static void reverse(String str) {
		
		String result = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			result +=  str.charAt(i);
			
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		String str = "my name is nikhil";
		reverse(str);
		
		

	}

}

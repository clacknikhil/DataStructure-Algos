package Strings;

public class reverseASentence {
	
	static void reverseSentence(String str) {
		
		String[] words = str.split(" ");
		
		String result= "";
		
		for(int i= words.length-1; i>=0; i--) {
			
			result +=  words[i]+ " ";
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		String str = "my name is nikhil";
		reverseSentence(str);


	}

}

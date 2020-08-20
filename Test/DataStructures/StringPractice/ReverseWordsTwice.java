package StringPractice;

public class ReverseWordsTwice {

	public static void main(String[] args) {
		
		String str = "my name is nikhil";
		String[] ch = str.split(" ");
		String reverseString = "";
		for(int i=0; i< ch.length; i++ ) {
			String word = ch[i];
			String reverse= "";
			for(int j=word.length()-1; j>=0;j--) {
				
				reverse = reverse + word.charAt(j);
			}
			
			reverseString += reverse + " ";
		}
		System.out.println(reverseString);

	}

}

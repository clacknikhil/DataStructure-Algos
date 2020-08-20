package StringPractice;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str =  "my name is Nikhil";
		String reverseString= "";
		
		String[] arr = str.split(" ");
		
		for(int i=0; i< arr.length; i++) {
			
			String word =  arr[i];
			String reverse = "";
			
			for(int j= word.length()-1; j>=0; j--) {
				
				reverse = reverse + word.charAt(j);
			}
			reverseString = reverseString + reverse + " ";
		}
		System.out.println(reverseString);

	}

}

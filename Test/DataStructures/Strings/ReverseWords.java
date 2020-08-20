package Strings;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str = "my name is nikhil";
		String reverseString = "";
		String[] arr = str.split(" ");
		
		for(int i=0; i< arr.length; i++) {
			String words = arr[i];
			String reverse="";
			
			for(int j= words.length()-1; j>=0; j--) {
				
				reverse = reverse + words.charAt(j);
			}
			
			reverseString += reverse + " ";
			
		}
		
		System.out.println(reverseString);
	

	}

}

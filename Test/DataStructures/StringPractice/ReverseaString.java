package StringPractice;

public class ReverseaString {

	public static void main(String[] args) {
		
		String str = "My name is Nikhil";
		
		String[] arr = str.split(" ");
		
		for(int i = arr.length-1 ; i>=0 ; i--) {
			
			System.out.print(arr[i]+ " ");
		}

	}

}

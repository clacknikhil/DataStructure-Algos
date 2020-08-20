package arrayPractice;

public class Paytm {

	public static void main(String[] args) {
	

		           String test = "12345";
		           int sum =0;
		           for(int i=0;  i< test.length(); i++) {
		        	   String str = "" + test.charAt(i);
		        	   System.out.print(str);
		        	   int x = Integer.parseInt(str);
		        	   sum = sum +x;
		  
		          
		           
		           }
		           
		           System.out.println(sum);
		         
		           }
}
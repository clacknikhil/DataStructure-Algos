package Strings;

public class Palindrome {

		
		
		boolean isPalidrome() 
	    { 
			String str= "ducud";
	    
	        int length = str.length(); 
	  
	        // Match characters from beginning and 
	        // end. 
	        for (int i=0; i<length/2; i++) 
	            if (str.charAt(i) != str.charAt(length-i-1)) 
	                return false; 
	  
	        return true; 

	}

}

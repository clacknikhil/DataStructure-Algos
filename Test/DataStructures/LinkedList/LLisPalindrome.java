package LinkedList;

class Node {
	
	String data;
	Node next;
	
	Node(String d){
		
		data=d;
		next = null;
		
	}
	
}

public class LLisPalindrome {
	
	Node head;

	
	boolean isPalindrome_Util(String str) {
		
		
		int length = str.length();
		
		for(int i=0; i<length/2; i++) 
			
			if(str.charAt(i)!= str.charAt(length-1-i))
				return false;
			return true;
		
		}
		
		boolean isPalindrome() {
		
		Node node = head;
		
		String str = "";
		
		while(node!= null) {
			
			str= str.concat(node.data);
			node = node.next;
			
			
		}
		
		return isPalindrome_Util(str);
		
	
	}
	public static void main(String[] args) {
		LLisPalindrome list = new LLisPalindrome(); 
        list.head = new Node("a"); 
        list.head.next = new Node("bc"); 
        list.head.next.next = new Node("d");  
        list.head.next.next.next = new Node("dcb"); 
        list.head.next.next.next.next = new Node("a"); 
  
        System.out.println(list.isPalindrome()); 

	}

}

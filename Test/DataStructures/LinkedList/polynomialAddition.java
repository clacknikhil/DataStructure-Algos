package LinkedList;

public class polynomialAddition {
	
	public class Node{
		int coef;
		int exp;
		Node next;
		
		Node(int c, int e){
			coef=c;
			exp=e; 
		}
		
		public void displayNode() {
			
			if(coef<0)
				System.out.print(coef+"x^"+exp);
			else
				System.out.print("+"+coef+"x^"+exp);
		
	    }
	
 	}
	class LinkedList{
		
		public Node first;
		public Node last;
		
		public LinkedList() {
			
			first = null;
			last = null;
			
		}
		public void insertLast(int c, int e) {
			
			Node newNode = new Node(c,e);
			if(isEmpty()) {
				first = newNode;
			}else 
				
				last.next=newNode;
				last= newNode;
			}
		public boolean isEmpty() {
		return (first==null);	
		}
		public void display() {
			
		}
	
	
	

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}
}

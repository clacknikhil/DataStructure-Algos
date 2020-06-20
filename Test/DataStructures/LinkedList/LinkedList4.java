package LinkedList;

public class LinkedList4 {
	
	Node head;
	
	class Node {
		
		int data;
		Node next;
		
		Node(int d){
			
			data =d;
			next = null;
			
		}
		
	}
	
	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
	public void printList() {
		
		Node temp = head;
		while(temp != null) {
			
			System.out.print(temp.data + " ");
			return;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

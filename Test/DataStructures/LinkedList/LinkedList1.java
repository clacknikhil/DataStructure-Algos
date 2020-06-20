package LinkedList;

public class LinkedList1 {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;
	
		}
		
	}
	
	//Insert a node
	
	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
			
			new_node.next = head;
			head = new_node;
		
	}
	
	//Print the Node
	
	public void printList() {
		
		Node tnode = head;
		
		while(tnode!= null) {
			
			System.out.print(tnode.data + " ");
			return;
		}
		
	}
	public void deleteNode(int key) {
		
		Node temp = head;
		Node prev = null;
		
		
		if(temp!= null && temp.data == key) {
			
			head = temp.next;
			return;
			
		}
		
		while(temp !=null && temp.data != key) {
			prev = temp;
			temp= temp.next;
			
			
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		LinkedList1 llit = new LinkedList1();
	}

}

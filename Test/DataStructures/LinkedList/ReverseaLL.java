package LinkedList;

public class ReverseaLL {

	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
	}
	//function to reverse the linked list
	Node reverse(Node node) {
		
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current!= null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		node= prev;
		return node;
		
	}
	void printList(Node node) {
		while(node!= null) {
			System.out.print(node.data + " ");;
			node = node.next;
		}
	
	}
	
	
	public static void main(String[] args) {
		ReverseaLL list = new ReverseaLL();
		list.head = new Node(32);
		list.head.next = new Node(12);
		list.head.next.next = new Node(65);
		list.head.next.next.next = new Node(2);
		
		System.out.println("Given Print List");
		list.printList(head);
		head = list.reverse(head);
		System.out.println();
		System.out.println(" Now list is after reversal");
		list.printList(head);

	}

}

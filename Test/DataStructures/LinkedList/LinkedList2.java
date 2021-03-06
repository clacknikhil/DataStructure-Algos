package LinkedList;

public class LinkedList2 {
	
	//find the count of linked list
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
	}
	//Insert the node on the linked list
	
	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;		
	}
	
	//print the list
	public void printList() {
		
		Node tnode = head;
		
		while(tnode != null) {
			
			System.out.print(tnode.data + " ");
			return;
		}
	
	}
	
	public int listCount(){
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			
			count ++;
			temp = temp.next;
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		
		LinkedList2 llist = new LinkedList2();
		
		llist.push(3);
		llist.push(6);
		llist.push(9);
		llist.push(12);
		//llist.printList();
		llist.listCount();

	}

}

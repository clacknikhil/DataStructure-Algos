package LinkedList;

public class LinkedList3 {
	
	//Search in node
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data = d;
			next = null;
			
		}
			
	}
	
	//Insert new node
	
	public void push(int new_data) {
		
		Node new_node = new Node(new_data);		
		new_node.next = head;
		head= new_node;
	}
	
	public boolean search(Node head, int x) 
    { 
        Node current = head;    //Initialize current 
        while (current != null) 
        { 
            if (current.data == x) 
                return true;    //data found 
            current = current.next; 
        } 
        return false;    //data not found 
    } 	

	public static void main(String[] args) {
		LinkedList3  llist = new LinkedList3();
		llist.push(2);
		llist.push(3);
		llist.push(12);
		if(llist.search(llist.head, 12)) {
			System.out.println("yes");
			
		}else {
			
			System.out.println("No");
		}

	}

}

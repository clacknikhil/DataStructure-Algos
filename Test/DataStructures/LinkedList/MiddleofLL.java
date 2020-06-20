package LinkedList;



public class MiddleofLL {
	
	Node head;
	
	class Node {
		
		
		int data;
		Node next;
		
		Node(int d){
			
			data= d;
			next= null;
		}
	}
	
	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
		new_node.next = head;
		head=new_node;
		
	}
	
	void printMiddle() {
		
		Node fast = head;
		Node slow = head;
		
		if(head != null) {
			
			while(fast !=null && fast.next !=null) {
				
				fast = fast.next.next;
				slow = slow.next;
				
			}
			
			System.out.println("Middle" + slow.data + " ");
		}
		
	}
	
	void printList() {
		
		Node tnode = head;
		
		while(tnode != null) {
			
			System.out.println(tnode.data + "\n");
			tnode = tnode.next;
		}
		 
	}
	

	public static void main(String[] args) {
		MiddleofLL llist = new MiddleofLL(); 
        for (int i=5; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 

	}

}

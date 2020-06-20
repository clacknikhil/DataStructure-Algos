package Trees;

public class BinaryTreetoDLL {
	
	public static class Node{
		
		int data;
		Node right;
		Node left;
		
	
		public Node(int data) {
			
			this.data = data;
			this.right = null;
			this.left = null;
			
		}		
		
	}
	
	public Node root;
	
	Node head, tail = null;
	
	
	public void convertBstToDLL(Node node) {
		
			if(node == null) 
				
				return;
				
			convertBstToDLL(node.left);	
		
			if(head== null) {
				
				head=tail=node;
				
			}else {
				
				tail.right= node;
				
				node.left = tail;
				
				tail= node;
				
				
			}
			convertBstToDLL(node.right);
		
	}
	
	public void display() {
		
		Node current = head;
		if(head==null) {
			
			System.out.println("List is empty");
			
			return;
			
		}
		
		System.out.println("Nodes of Linked list");
		
		while(current!= null) {
			
			System.out.print(current.data +"");
			
			current = current.right;
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		BinaryTreetoDLL Bt = new BinaryTreetoDLL();
		Bt.root = new Node(10);

	}

}
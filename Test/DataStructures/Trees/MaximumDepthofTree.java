package Trees;

public class MaximumDepthofTree {

	public static class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
		
	}
	
	//define root of binary tree
	public Node root;
	public MaximumDepthofTree() {
		root =null;
	}
	
	//find height of tree
	public int findHeight(Node temp) {
		
		
		//check whether tree is empty
		if(root==null) {
			
			System.out.println("Tree is Empty");
			return 0;
		}
		else {
			
			int leftHeight=0; int rightHeight=0;
		//Calculate height of left subtree
			if(temp.left !=null) 
				
				leftHeight = findHeight(temp.left);
			if(temp.right !=null) 
				
				rightHeight = findHeight(temp.right);
				
			int max = (leftHeight > rightHeight)? leftHeight: rightHeight;
			
			return (max+1);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		MaximumDepthofTree tree = new MaximumDepthofTree();
		tree.root = new Node(1);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(5);
		tree.root.right = new Node(6);
		tree.root.right.right = new Node(9);
		tree.root.left.left.left= new Node(13);
		tree.root.left.left.left.left= new Node(16);
		tree.root.left.left.left.left.left= new Node(22);
		tree.root.left.left.left.left.left.left= new Node(33);

		System.out.println("Max height" + tree.findHeight(tree.root));
		
	}

}

package BinarySerachTree;

// Lowest Common Ancestor in a Binary Search Tree.
//	class Node {
//		int data;
//		Node left, right;
//
//		Node(int item) {
//			data = item;
//			left = right = null;
//
//		}
//
//	}
	
	public class LCSofBST{
		
		Node root;
		
		Node lca(Node node, int n1, int n2){
			
			if(node == null)
				return null;
			
			if(node.data > n1 && node.data > n2)
				return lca(node.left, n1, n2);
			
			if(node.data < n1 && node.data <n2)
				return lca(node.right, n1, n2);
			
			return node;
		}
		

	public static void main(String[] args) {
		LCSofBST bt = new LCSofBST();
		bt.root = new Node(20);
		bt.root.left = new Node(8);
		bt.root.right = new Node(22);
		bt.root.left.left = new Node(4);
		
		int n1 = 8;
		int n2 = 22;
		
		Node t = bt.lca(bt.root, n1, n2);
		
		System.out.println(t.data);
		

	}

}

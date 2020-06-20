package Trees;

public class AddNodesofTree {
	
	static class Node {
	int value;
	Node left;
	Node right;
	}
	
	static Node newNode(int key) {
		
		Node node = new Node();
		node.value = key;
		node.left = node.right = null;
		return (node);
		
	}
	
	//function to find the addition
	static int addBt(Node root) {
			
		if(root ==null)
			return 0;
		return(root.value + addBt(root.left)+ addBt(root.right));
		
	}
	

	public static void main(String[] args) {
		
		Node root = newNode(1);
		root.left = newNode(4);
		root.right = newNode(2);
		
		int sum = addBt(root);
		
		System.out.println(sum);


	}

}

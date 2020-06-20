package Trees;

public class BinaryTree {

	static class Node {
		int key;
		Node left, right;

		Node(int item) {
			key = item;
			left = right = null;
		}
	}

// A Java program to introduce Binary Tree 
	static class BinaryTree1 {
		// Root of Binary Tree
		Node root;

		// Constructors
		BinaryTree1(int key) {
			root = new Node(key);
		}

		BinaryTree1() {
			root = null;
		}

		public static void main(String[] args) {
			BinaryTree1 tree = new BinaryTree1();

			/* create root */
			tree.root = new Node(1);
			tree.root.left = new Node(2);
			tree.root.right = new Node(3);

		}
	}
}
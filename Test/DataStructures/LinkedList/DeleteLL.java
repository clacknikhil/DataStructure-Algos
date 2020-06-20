package LinkedList;

class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int d) {

			data = d;
			next = null;

		}
	}

	void deleteNode(int key) {

		Node temp = head;
		Node prev = null;

		// delete the head node
		if (temp != null && temp.data == key) {

			head = temp.next;
			return;
		}
		// find the internal node
		while (temp != null && temp.data != key) {

			prev = temp;
			temp = temp.next;

		}

		if (temp == null)
			return;
		prev.next = temp.next;

	}

	// Insert a node at the front of the list
	public void push(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}

	// print the list
	public void printList() {
		Node tnode = head;

		while (tnode != null) {

			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}

	}
	
	public void deleteList() {
		
		head = null;
	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(12);
		llist.push(4);
		llist.push(18);
		llist.printList();
		llist.deleteNode(12);
		System.out.println();
		llist.printList();
		

	}

}

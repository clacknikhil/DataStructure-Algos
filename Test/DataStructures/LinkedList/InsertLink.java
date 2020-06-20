package LinkedList;

import java.util.*;
import java.util.LinkedList;

public class InsertLink {

	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d ;
			next = null;
		}
	}
	//Add a node in front
	public void push(int new_data) {
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
		
	}
	//Add a node at specific pointer
	
	//check first if it is not null
	
	public void insertAfter(Node prev_node, int new_data) {
		
		if(prev_node == null) {
			System.out.println("cannot add");
			return;
		}
		 Node new_node = new Node(new_data);
		 new_node.next = prev_node.next;
		 prev_node.next = new_node;
		
	}
	
	public void append(int new_data) {
		
		Node new_node = new Node(new_data);
		
		if(head == null) {
			
			head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		Node last = head;
		
		while(last.next != null) {
			last = last.next;
			
			last.next = new_node;
			return;
		}
		
		
	}


	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList(); 
		
	
		


	}

}

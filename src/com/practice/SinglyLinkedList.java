package com.practice;

public class SinglyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	public void printList() {
		
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printMiddle() {
		
		Node slow_ptr = head;
		Node fast_ptr = head;
		if(head!=null) {
			while(fast_ptr!=null && fast_ptr.next!=null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("Middle element is: "+slow_ptr.data);
		}
		
	}
	public static void main(StringTest[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.printMiddle();
		
	}

}

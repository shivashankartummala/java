package com.sstummala.codingproblems2.LinkedLists;

public class LinkedList {

	Node head;
	
	public LinkedList(int data){
		this.head = new Node(data);		
	}
	
	public LinkedList(int[] data) {
		this.head = new Node(data[0]);
		Node cur =head;
		for(int i=1;i<data.length;i++) {
			cur.next = new Node(data[i]);
			cur = cur.next;
		}
	}
	
	public void append(int data) {
		Node cur =this.head;
		
		while(cur.next!=null) {
			cur = cur.next;
		}
		cur.next = new Node(data);
		
	}
	
	public static void display(Node head) {
		Node cur =head;
		
		while(cur!=null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		
	}
	
}

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
	
}
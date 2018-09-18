package com.sstummala.codingproblems.datastructures.linkedlist;

public class LinkedList {
	Node head;
	public void append(int data){
		Node newnode = new Node(data);
		if(head==null){
			head = newnode;
			display("created new linkedlist : ");
			return;
		}
		Node current = head;
		while(current.next!=null){
			current = current.next;			
		}
		current.next=newnode;
		display("after appending : " + data + "=>");
	}
	
	public void display(String message){
		Node current = head;
		
		System.out.print(message + ":=>");
		
		
		while(current.next!=null){
			
			System.out.print(current.value + "->");		
			current = current.next;
		}
		System.out.print(current.value + "->");	
		System.out.println();
	}
	
	public void display(Node head, String message){
		Node current = head;

		System.out.print(message + ":=>");
		
		while(current!=null){
			
			System.out.print(current.value + "->");		
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	public void prepend(int data){
		Node temp = head;
		head = new Node(data);
		head.next = temp;
		display("after prepending :" + data + " =>");
		
	}
	
	public void deleteWithValue(int data){
		if(head==null) return;		
		if(head.value==data){
			head = head.next;
		}
		Node current = head;
		while(current.next != null){
			if(current.next.value==data){
				current.next=current.next.next;
				return;
			}
			current = current.next;
		}
		
		display("after deleting :" + data + " =>");
	}

}

class Node{
	int value;
	Node next;
	public Node(int data){
		this.value=data;
	}
}

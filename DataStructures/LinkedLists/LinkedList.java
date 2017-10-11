package com.sstummala.codingproblems.linkedlist;

public class LinkedList {
	Node head;
	public void append(int data){
		Node newnode = new Node(data);
		if(head==null){
			head = newnode;
			display();
			return;
		}
		Node current = head;
		while(current.next!=null){
			current = current.next;			
		}
		current.next=newnode;
		display();
	}
	
	public void display(){
		Node current = head;
		System.out.print(current.value + "->");
		
		while(current.next!=null){
			current = current.next;
			System.out.print(current.value + "->");			
		}
		
		System.out.println();
	}
	
	
	public void prepend(int data){
		Node temp = head;
		head = new Node(data);
		head.next = temp;
		display();
		
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
		
		display();
	}

}

class Node{
	int value;
	Node next;
	public Node(int data){
		this.value=data;
	}
}
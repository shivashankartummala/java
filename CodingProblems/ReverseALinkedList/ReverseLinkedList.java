package com.sstummala.codingproblems.datastructures.linkedlist;

public class ReverseLinkedList {
	
	public static void main(String[] args){
	
	LinkedList linkedlist = new LinkedList();
	
	linkedlist.append(2);
	linkedlist.append(3);
	linkedlist.append(4);
	linkedlist.append(5);
	linkedlist.prepend(1);
	
	linkedlist.display();
	reverseLinkedList(linkedlist);
	linkedlist.display();
	printreverseOfLinkedList(linkedlist);
	
	
	
	}
	
	//recursive menthod to just print the given linked list in reverse order , wihtout having to modify the original list
	//time complexity : O(n)
	/*
	 * time complexity : O(n)
	 * space complexity : 
	 * 
	 */
	public static void printreverseOfLinkedList(LinkedList input){
		
		
		printreverseOfLinkedList(input.head);
		
	}
	
	public static void printreverseOfLinkedList(Node head){
		if(head==null) return;
		printreverseOfLinkedList(head.next);
		System.out.println(head.value);
		
	}
	
	
	
	//
	/*method for reversing the pointter in the input linked list
	 *  time complexity : O(n)
	 *  space complexity : Inplace / O(1)
	 *  This is a iterative style algorithm and it uses 3 pointers / Nodes.
	 */
	
	public static void reverseLinkedList(LinkedList input){
		Node cur = input.head;
		Node prev = null;
		
		while(cur!=null){
			Node temp = cur.next;
			cur.next=prev;
			prev = cur;
			cur =temp;			
			
		}
		input.head = prev;
		
		
	}
	
	
	

}

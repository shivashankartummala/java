package com.sstummala.codingproblems.datastructures.linkedlist;



public class ReverseLinkedList {
	
	public static void main(String[] args){
	
	LinkedList linkedlist = new LinkedList();
	
	linkedlist.append(2);
	linkedlist.append(3);
	linkedlist.append(4);
	linkedlist.append(5);
	linkedlist.prepend(1);
	
	System.out.println("Test the reversal using iterative approach");
	linkedlist.display("Original LinkedList");
	
	reverseLinkedList(linkedlist);
	linkedlist.display("Reversed Linkedlist using iterative approach");
	
	System.out.println("print a given linkedlist in reverse order withou modifying the list");
	printreverseOfLinkedList(linkedlist);
	
	System.out.println("Test the reversal using recursive approach");
	
	linkedlist.display(linkedlist.head, "Orginal LinkedList");
	Node newhead = reverseLinkedListRecursive(linkedlist.head);
	linkedlist.display(newhead, "Reversed LinkedList using Recursion");
	
	
	}
	
	//recursive menthod to just print the given linked list in reverse order , wihtout having to modify the original list
	//time complexity : O(n)
	/*
	 * time complexity : O(n)
	 * space complexity : 
	 *  Note :  This is a iterative style algorithm and it uses 3 pointers / Node variables to track.
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
	
	// Recursive method for reversing a linkedlist
	// this uses 2 pointers only, but the recursion implicity used extra space for each call in the method stack.
	
	public static Node reverseLinkedListRecursive(Node head) {
		if(head == null) {
			return null;
		}
		Node p = head;
		Node q = p.next;
		
		if(q == null) return p;
		q = reverseLinkedListRecursive(q);
		
		p.next.next = p;
		p.next = null;
		
		return q;		
		
	}
	

}

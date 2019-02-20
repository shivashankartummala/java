package com.sstummala.codingproblems2.LinkedLists;

import java.util.Stack;

public class ReverseLinkedList {
	
	public static Node reverseIterative(Node head) {
				
		Node prev = null;
		Node cur = head;
		Node next = head.next;
		
		while( cur.next!=null){
			cur.next = prev; // flipping the next pointer to previous
			
			prev = cur;
			cur =next;
			next=next.next;
						
		}
		cur.next = prev;
		return cur;
		
	}
	
	public static Node reverseRecursive(Node head) {
		if(head==null | head.next==null) return head;		
		Node q = reverseRecursive(head.next);
		head.next.next=head;
		head.next = null;
		return q;
		
	}
	
	public static Node reverseIterativeWithStack(Node head) {
		Node cur =head;
		Stack<Node> buf = new Stack<Node>();
		while(cur.next!=null) {
			buf.push(cur);
			cur=cur.next;
		}
		
		head = cur;
		
		
		while(!buf.isEmpty()) {
			Node temp = buf.pop();
			temp.next=null;
		  cur.next = temp;
		  cur =cur.next;
		}
		
		return head;
	}
	

}

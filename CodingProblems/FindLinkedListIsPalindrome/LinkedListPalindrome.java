package com.sstummala.codingproblems.datastructures.linkedlist.palindrome;

import java.util.Stack;

public class LinkedListPalindrome {	
	
	public static void main(String[] args){
		Node first = new Node(1);  // 1->2->3->null
		first.next = new Node(2);
		first.next.next = new Node(3);
		
		Node second = new Node(1); // 1->2->1->null
		second.next = new Node(2);
		second.next.next = new Node(1);
		
		System.out.println("fisrt odd :" + isPalindrome(first));
		
		System.out.println("second odd :" + isPalindrome(second));
		
		first.next.next.next = new Node(1);
		second.next.next = new Node(2);
		second.next.next.next = new Node(1);
		
        System.out.println("fisrt even :" + isPalindrome(first)); // 1->2->3->1->null
		
		System.out.println("second even :" + isPalindrome(second)); //  1->2->2->1->null
		
		
	}
	
	public static boolean isPalindrome(Node n){
				
		Node p = n;
		Node q = n;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(q!=null && q.next!=null){
			stack.push(p.value);
			p = p.next;
			q = q.next.next;			
		}
		
		if(q!=null){
			p=p.next;
		}
		
		while(p!=null){
			//System.out.println(stack.peek() + " " + p.value);
			if(stack.pop().intValue()!=p.value) return false;
			p=p.next;
		}		
		
		return true;
	}

}


class Node{
	int value;
	Node next;
	public Node(int data){
		this.value=data;
	}
	public Node(int data, Node next){
		this.value=data;
		this.next = next;
	}
	
}

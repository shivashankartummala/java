package com.sstummala.codingproblems.datastructures.linkedlist.dedup;

import java.util.HashSet;

public class LinkedListRemoveDuplicates {

	public static void main(String[] args){
		
		Node first = new Node(1, new Node(2,new Node(3, new Node(2, new Node(1)))));  // 1->2->3->2->1->null
		Node second = new Node(1, new Node(2,new Node(3, new Node(2, new Node(1)))));  // 1->2->3->2->1->null
		
		display(first);
		dedup2(first);
		display(first);
		
		display(second);
		dedup(second);
		display(second);		
		
	}
	
	// without using extra space.
	// time complexity : O(n^2)
	// space complexity : O(1)
	public static void dedup2(Node n){
		while(n!=null){
			Node cur = n;
			while(cur.next!=null){
				if(cur.next.value==n.value){
					cur.next = cur.next.next;
				}else{
					cur = cur.next;
				}			
				
			}
			n=n.next;
		}
	}
	
	
	// using extra space
	// time complexity : O(n)
	// space complexity : O(n)
	public static void dedup(Node n){
		HashSet<Integer> cache = new HashSet<Integer>();
		Node cur = n;
		Node prev = null;
				
		while(cur!=null){
			if (cache.contains(cur.value)){
				prev.next = cur.next;
			}else{
				cache.add(cur.value);
				prev = cur;
			}
			
			cur = cur.next;
			
		}
		
	}
	
	public static void display(Node n){
		Node cur = n;
		while(cur!=null){
			System.out.print(cur.value + "->");
			cur=cur.next;
		}
		System.out.println();
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
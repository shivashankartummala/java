package com.sstummala.codingproblems.datastructures.stack;



public class SimpleStackReverse {
	private class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
		
	}
	
	private Node top;
	
	public void push(int data){
		
		Node node = new Node(data);
		node.next = top;
		top = node;
		display();
		
	}
	
	public boolean isEmpty(){
		if(top==null) return true;
		else return false;
	}
	
	public int peek(){
		 return top.data;
	}
	
	public int pop(){
		int val = top.data;
		top = top.next;
		return val;
			
	}
	
	public void display(){
		Node current = top;
		System.out.print(current.data + "->");
		
		while(current.next!=null){
			current = current.next;
			System.out.print(current.data + "->");			
		}
		System.out.print("Null");
		System.out.println("   [top:"+top.data+"]");
	}
	
	public void reverse(){
		Node cur, prev, tempNext;
		prev =null;
		cur = top;		
		tempNext = top.next;
		
		while(cur.next!=null){
			cur.next = prev;
			prev = cur;
			cur = tempNext;
			tempNext = cur.next;
		}
		cur.next =prev;
		top = cur;		
		
	}

}

package com.sstummala.codingproblems.datastructures.stack;



public class Stack {
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
		
		System.out.println("   [top:"+top.data+"]");
	}

}

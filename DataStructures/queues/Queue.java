package com.sstummala.codingproblems.datastructures.queue;



public class Queue {
	Node head;
	Node tail;
	
	public int deque() throws Exception{
		if(head==null) throw new Exception("queue is empty");
		Node cur = head;
		head = head.next;
		return cur.value;
		
	}
	
	public void enque(int value){
		if(tail==null){
			head= new Node(value);
			tail=head;
		}else{
			tail.next= new Node(value);
			tail=tail.next;
		}
		
		display();
		
	}
	
	public void display(){
		Node current = head;
		System.out.print(current.value + "->");
		
		while(current.next!=null){
			current = current.next;
			System.out.print(current.value + "->");			
		}
		
		System.out.println("   [head:"+head.value+" ,tail:"+current.value+"]");
	}
	
	public int peek(){
		return head.value;
	}
	
	
	private class Node{
		int value;
		Node next;
		public Node(int val){
			this.value=val;
		}
	}

}

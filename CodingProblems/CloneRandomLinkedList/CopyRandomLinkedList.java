package com.sstummala.codingproblems.randomlinkedlist;

public class CopyRandomLinkedList {
	
	/*
	 *  Cloning a LinkedList with Random Pointers
	 *  Approach Interleaved new cloned nodes
	 *  time complexity : O(n);
	 *  space complexity : O(1);
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = new Node("a");
		Node second = new Node("b");
		Node third = new Node("c");
		Node fourth = new Node("d");
		Node fifth = new Node("e");
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next=fifth;
		
		first.random = third;
		second.random=fourth;
		third.random=first;
		fourth.random=third;
		fifth.random=fifth;
		
		System.out.println("orginal Linked List");
		display(first);
		
		Node copy=copyRandomLinkedList(first);
		System.out.println("new clone Linked List");
		display(copy);
		System.out.println("Original Linked List is intact after the clone operation");
		display(first);
		
		
		

	}
	
	public static void display(Node head){
		Node cur = head;
		do{
			System.out.print(cur.value + "-next->" +cur.next.value +":");
			cur =cur.next;
		}while(cur.next!=null);
			
		System.out.print(cur.value + "-next->" +"null:");
		System.out.println();
		cur = head;
		while(cur.next!=null){	
			if(cur.random!=null)
			System.out.print(cur.value + "-random->"+cur.random.value+":");
			cur =cur.next;
		}
		if(cur.random!=null)
		System.out.print(cur.value + "-random->" +cur.random.value+":");
		System.out.println();
		System.out.println("###################");
		
	}
	
	public static Node copyRandomLinkedList(Node head){
		if(head==null) return head;
		Node copy;
		Node cur = head;
		System.out.println("adding the new cloned nodes as interleaved nodes into original list  ");
		do{
			Node temp= new Node(cur.value+"'");
			temp.next=cur.next;
			cur.next=temp;
			cur=temp.next;			
			
		}while(cur!=null);
		
		display(head);
		System.out.println("Done adding new nodes to the Linkedlist");
		cur = head;
		do{
			cur.next.random=cur.random.next;
			cur=cur.next.next;
		}while(cur!=null);
		display(head);
		System.out.println("Done setting up random for new Linkedlist");
		cur = head;	
		Node toreturn=cur.next;
		copy=cur.next;
		
		while( cur!=null ){
			cur.next=copy.next;	
			if(cur.next!=null)
			copy.next=cur.next.next;				
			copy=copy.next;
			cur=cur.next;		
			
		}
	
		
		System.out.println("Done unlinking old from new linked  list");
		
		return toreturn;
	}
	
	

}

class Node{
	String value;
	Node next;
	Node random;
	
	public Node(String a){
		this.value = a;
	}
	
}

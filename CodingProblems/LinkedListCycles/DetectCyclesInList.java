package com.sstummala.codingproblems.LinkedList;

public class DetectCyclesInList {
		
	
	public static boolean hasCycle(Node head) {
	    Node slow = head;
	    Node fast = head;
	   
	    if(head == null) return false;
	    
	    while(fast !=null && fast.next != null){
	        fast = fast.next.next;
	        slow = slow.next;    
	        if(fast == slow) return true;
	    }
	    return false;
	}
	
	public static void main(String Args[]){
		
		Node n1,n2,n3,n4;
		n3 = new Node(9,null);
		n2 = new Node (4, n3);
		n1 = new Node(3,n2);
		
		n4 = new Node(7,n2);
		n3.next=n4;
		
		Node head = new Node(2, n1);
		if (hasCycle(head))
		System.out.println("List contains Cycles");
		
		
		
	}

}

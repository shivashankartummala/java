package com.sstummala.codingproblems.linkedlist;

public class TestLinkedList {
	public static void main(String[] args){
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.append(2);
		linkedlist.append(3);
		linkedlist.append(4);
		linkedlist.append(5);
		linkedlist.prepend(6);
		linkedlist.prepend(1);
		linkedlist.deleteWithValue(3);
		linkedlist.deleteWithValue(5);
		linkedlist.deleteWithValue(1);
		
		

		
	}
	

}

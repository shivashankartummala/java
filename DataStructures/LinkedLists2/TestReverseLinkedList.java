package com.sstummala.codingproblems2.LinkedLists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class TestReverseLinkedList {
	
	LinkedList l1,l2;
	
	@Before
	public void setup() {
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {1,3,5,7,9};
		l1 = new LinkedList(a1);
		l2 = new LinkedList(a2);
	}

	@Test
	public void testReverseIterative() {
		System.out.println("#### Iterative #####");
		Node rev1 = ReverseLinkedList.reverseIterative(l1.head);
		l1.display(rev1);
		System.out.println("####");
		Node rev2 = ReverseLinkedList.reverseIterative(l2.head);
		l1.display(rev2);
		System.out.println("####  #####");
		
	}
	
	@Test
	public void testReverseRecursive() {
		System.out.println("#### Recursive #####");
		Node rev1 = ReverseLinkedList.reverseRecursive(l1.head);
		l1.display(rev1);
		System.out.println("####");
		Node rev2 = ReverseLinkedList.reverseRecursive(l2.head);
		l1.display(rev2);
		
		System.out.println("####  #####");
	}
	
	@Test
	public void testReverseIterativeWithStack() {
		System.out.println("#### With stack #####");
		Node rev1 = ReverseLinkedList.reverseIterativeWithStack(l1.head);
		l1.display(rev1);
		System.out.println("####");
		Node rev2 = ReverseLinkedList.reverseIterativeWithStack(l2.head);
		l1.display(rev2);
		
		System.out.println("####  #####");
	}
	
}

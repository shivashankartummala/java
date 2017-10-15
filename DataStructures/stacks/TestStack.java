package com.sstummala.codingproblems.datastructures.stack;

public class TestStack {
	
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("peek= " +stack.peek());
		stack.display();
		System.out.println("pop= " +stack.pop());
		stack.display();
		System.out.println("peek= " +stack.peek());
		stack.display();
		stack.push(9);
		System.out.println("peek= " +stack.peek());
		stack.display();
		System.out.println("pop= " +stack.pop());
		stack.display();
		System.out.println("peek= " +stack.peek());
		
		
	}

}

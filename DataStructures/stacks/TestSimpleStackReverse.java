package com.sstummala.codingproblems.datastructures.stack;

public class TestSimpleStackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleStackReverse stack = new SimpleStackReverse();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.reverse();
		stack.display();

	}

}

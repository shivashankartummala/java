package com.sstummala.codingproblems.datastructures.stack;

public class ReverseStack {
	public static void main(String[] args){
		
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack);
		stack.display();
		
	}
	
	public static Stack reverse(Stack input){
		if(input.isEmpty()) return input;
		int temp = input.pop();
		reverse(input);
		insertAtBottom(input,temp);
		return input;
		
	}
	
	public static void insertAtBottom(Stack a, int x){
		if(a.isEmpty()) {
		    a.push(x);
		    return;
		}
		int temp = a.pop();
		insertAtBottom(a,x);
		a.push(temp);
		
	}

}

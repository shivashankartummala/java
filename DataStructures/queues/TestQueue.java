package com.sstummala.codingproblems.datastructures.queue;

public class TestQueue {
	
	
	public static void main(String[] args) throws Exception{
		
		Queue queue = new Queue();
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		System.out.println(queue.deque());
		queue.display();
		System.out.println(queue.peek());
		queue.display();
		queue.enque(5);
		System.out.println(queue.deque());
		queue.display();
		System.out.println(queue.peek());
		queue.display();
		
		
		
		
		
		
	}

}

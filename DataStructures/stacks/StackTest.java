package com.sstummala.codingproblems.datastructures.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	Stack stack;

	@Before
	public void setUp() throws Exception {
		stack = new Stack();
	}
	
	@Test
	public void testIsEmpty() {
		assertEquals(true, stack.isEmpty());
	}

	@Test
	public void testPush() {
		stack.push(5);
		assertEquals(5, stack.peek());
	}

	@Test
	public void testIsEmpty2() {
		stack.push(5);
		assertEquals(false, stack.isEmpty());
	}

	@Test
	public void testPeek() {
		stack.push(5);
		stack.push(3);
		assertEquals(3, stack.peek());
	}

	@Test
	public void testPop() {
		stack.push(5);
		stack.push(3);
		assertEquals(3, stack.pop());
	}

}

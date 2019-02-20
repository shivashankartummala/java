package com.sstummala.codingproblems2.recursion;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import com.sstummala.codingproblems.graphs.Graph;

public class TestTowersOfHanoi {
	
Stack<Integer> source,temp,target;
	
	@Before
	public void setup() {
	
		source = new Stack<Integer>();
		source.push(4);
		source.push(3);
		source.push(2);
		source.push(1);
		
		temp = new Stack<Integer>();
		
		target = new Stack<Integer>();
	}
	
	@Test
	public void testDFS() {
		TowersofHanoi.transferDisks(source,temp,target,4);
		while(!target.isEmpty()) {
			System.out.println(target.pop());
		}
	}

}

package com.sstummala.codingproblems2.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestKnapSack {
	int[] weights1,weights2,values1,values2;
	int capacity1, capacity2;
		
		@Before
		public void setup() {
			weights1 = new int[] {1,2,2,3,5};
			values1 = new int[] {3,4,5,7,8};
			weights2 = new int[] {3,5,4,7,5,8};
			values2 = new int[] {5,6,5,9,6,9};
			capacity1 = 7;
			capacity2 = 15;
					
		}
		
		@Test
		public void testknapSackDP() {
			int exp1 = 16;
			int actual1 = KnapSack.knapSackDP(weights1,values1,capacity1);
			
			System.out.println("max value for knapsack of " +capacity1 + " with W{1,2,2,3,5}, V{3,4,5,7,8} is " + actual1);
			assertEquals(exp1,actual1);
			
			System.out.println("############");
			
			int exp2 = 20;
			int actual2 = KnapSack.knapSackDP(weights2,values2,capacity2);
			
			System.out.println("max value for knapsack of " +capacity2 + " with W{3,5,4,7,5,8}, V{5,6,5,9,6,9} is " + actual2);
			assertEquals(exp2,actual2);
			System.out.println("############");
			
			
		}

}

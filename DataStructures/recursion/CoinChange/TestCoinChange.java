package com.sstummala.codingproblems2.recursion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TestCoinChange {
	
int[] coins1,coins2;
int amount1, amount2;
	
	@Before
	public void setup() {
		coins1 = new int[] {1,2,5};
		coins2 = new int[] {1,5,10,25};
		amount1 = 7;
		amount2 = 31;
				
	}
	
	@Test
	public void testMinCoinsToMakeChangeDP() {
		int exp1 = 2;
		int actual1 = CoinChange.minCoinsToMakeChangeDP(coins1,amount1);
		
		System.out.println("min # coins to make " + amount1 + " change : " + actual1);
		assertEquals(exp1,actual1);
		
		System.out.println("############");
		
		int exp2 = 3;
		int actual2 = CoinChange.minCoinsToMakeChangeDP(coins2,amount2);
		
		System.out.println("min # coins to make " + amount2 +" change : " + actual2);
		assertEquals(exp2,actual2);
		System.out.println("############");
		
		
	}
	
	@Test
	public void testCoinChangeUniqueWaysDP() {
		int exp1 = 3;
		int actual1 = CoinChange.coinChangeUniqueWaysDP(coins1,amount1);
		
		System.out.println("number unique ways to make " + amount1 + " change using coin{1,2,5}: " + actual1);
		assertEquals(exp1,actual1);
		
		System.out.println("############");
		
		int exp2 = 4;
		int actual2 = CoinChange.coinChangeUniqueWaysDP(coins2,amount2);
		
		System.out.println("number of unique ways to make " + amount2 +" change using coins(1,5,10,25): " + actual2);
		assertEquals(exp2,actual2);
		System.out.println("############");
	
	}

}

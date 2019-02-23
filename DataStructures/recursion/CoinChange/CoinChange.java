package com.sstummala.codingproblems2.recursion;

import java.util.Arrays;

public class CoinChange {

	/*
	 * Minimum number of coins required (from a given set of coins) to make change for a given amount
	 * each coin can be picked multiple times.
	 * This uses dynamic programming
	 */
	public static int minCoinsToMakeChangeDP(int[] coins,int amount) {
				
		int[] minCoinCountCache = new int[amount+1];
		
		Arrays.fill(minCoinCountCache,Integer.MAX_VALUE);
		
		minCoinCountCache[0] = 0;
		
		for(int coin:coins) {
			for(int CurAmount=1; CurAmount<=amount; CurAmount++) {
				if(coin<=CurAmount) {
				int coinCount = CurAmount/coin;
				int remainder = CurAmount%coin;
				
				minCoinCountCache[CurAmount] = Math.min(minCoinCountCache[CurAmount], coinCount + minCoinCountCache[remainder]);
				}
				
			}			
			
		}
		/*
		System.out.print("[");
		for (int i =0;i<minCoinCountCache.length;i++) System.out.print(i+" ,");
		System.out.println("]");
		
		System.out.println(Arrays.toString(minCoinCountCache));
		*/
			
		return minCoinCountCache[amount];				
		
	}
	
	/*
	 * Number of Unique ways to make change for given amount using the given set of coins.
	 * each coin is allowed to taken multiple times.
	 * This uses dynamic programming
	 */
	public static int coinChangeUniqueWaysDP(int[] coins,int amount) {
		int[] cache = new int[amount+1];
		cache[0]=1;
		
		for(int coin:coins) {
			for(int curAmount=1;curAmount<=amount;curAmount++) {
				if(coin<=curAmount) {
					cache[curAmount] = 1 + cache[curAmount];
				}
			}
		}
		return cache[amount];
	}
	
}

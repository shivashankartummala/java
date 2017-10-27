package com.sstummala.codingproblems.recursion;

import java.util.Arrays;

public class MakeCoinChangeDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coins = new int[] {25,10,5,1};		
		
		System.out.println("make change for 49 using coins " + Arrays.toString(coins)+ " -> " + makeChange(49,coins));
		
		coins = new int[] {10,6,1};
		
		System.out.println("make change for 12 using coins " + Arrays.toString(coins)+ " -> " + makeChange(12,coins));		

	}
	
	/*
	 * Bottom up / iterative dynamic programming
	 * time complexity : O(c*n)  where n is number of coins, c is amount be made
	 * space complexity : O(c) 
	 * 
	 */
	public static int makeChange(int m, int[] coins){
		int[] cache = new int[m+1];
		
		for(int i=1;i<=m;i++){
			int mincoins = Integer.MAX_VALUE;
			
			for(int coin: coins){
				if(i-coin>=0){
					int curcoins = cache[i-coin]+1;
					if(curcoins<mincoins){
						mincoins = curcoins;
					}
				}				
			}			
			cache[i]=mincoins;			
		}		
		return cache[m];		
	}	

}

package com.sstummala.codingproblems;

public class MaxStockProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] day1 = new int[] {7, 10, 7, 5, 8,6, 11, 9};
		
		int[] day2 = new int[] {3, 8, 6, 8, 10, 9};
		
		System.out.println(findMaxProfit(day1));
		System.out.println(findMaxProfit(day2));

	}
	
	public static int findMaxProfit(int[] prices){
		
		int min=prices[0];
		int max=0;
		
		for(int i=1;i<prices.length;i++){
			if(prices[i]>prices[i-1]) max = prices[i];
			if(prices[i]<min){
				min = prices[i];
				max = prices[i];
			}
		}
		
		
		return max-min;
	}
	

}

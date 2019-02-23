package com.sstummala.codingproblems2.recursion;

public class KnapSack {

	public static int knapSackDP(int[] weights, int[] values, int capacity) {
		int [][] cache = new int[weights.length+1][capacity+1];
		int maxval = 0;
		
		for(int i=1;i<cache.length;i++) {
			int item = i-1;
			for(int j=1;j<cache[0].length;j++) {
				if(weights[item]<=j) {
					cache[i][j]=Math.max(cache[i-1][j], values[item]+ cache[i-1][j-weights[item]]);
				}else {
					cache[i][j]=cache[i-1][j];
				}
				if(cache[i][j]>maxval) maxval = cache[i][j];
			}
		}
		/*
	    for(int i =1; i<cache.length; i++) {
	    	System.out.print("{W:" + weights[i-1] + ",V:"+values[i-1] + "}");
	    	for (int j=1; j<cache[0].length;j++)
	    		System.out.print(cache[i][j] +",");
	    	System.out.println();
	    	
	    }
	    */
	    	
		
		return maxval;
	}
	
}

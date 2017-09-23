package com.sstummala.codingproblems.dp;

public class LongestCommonSubstring {
	
	public static void main(String args[]){
		
		System.out.println(longestCommonSubstring("cabab","babac"));
		
		
	}
	
	//Dynamic Programming Algorithm for Longest Common Substring
	
	
	public static String longestCommonSubstring(String a, String b){
		String out="";
		int max=0;
		int[][] cache= new int[a.length() +1 ][b.length() + 1];
		
		for(int i = 1; i<=a.length(); i++){
			for(int j=1; j<=b.length(); j++){
				if(a.charAt(i-1)==b.charAt(j-1)){
					cache[i][j]=cache[i-1][j-1]+1;
					if(max < cache[i][j]){
						max = cache[i][j];
					}
					if (cache[i][j]>out.length()){
						System.out.println("i:"+i+";j:"+j);
						//substring (curruentrownum - currentmax length, currentrownum)
						out = a.substring(i-cache[i][j], i);
					}
					
				}
			}
		}
		
		System.out.println("LongestCommonSubstring length:" + max);
		return out;
	}

}

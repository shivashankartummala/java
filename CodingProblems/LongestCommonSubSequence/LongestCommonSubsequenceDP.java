package com.sstummala.codingproblems.dp;

public class LongestCommonSubsequenceDP {
	
	public static void main(String arg[]){
		
		//"AGGTAB" "GXTXAYB"
		
		System.out.println(longestCommonSubseuence("AGGTAB","GXTXAYBA"));
		
	}
	
	
	//Dynamic Programming Algorithm for Longest Common Subsequence
	/*
	 * Brute force algorithm for LCS is of Time Complexity O(2^n)
	 * Time Complexity : O(n^2)
	 * 
	 */
	public static String longestCommonSubseuence(String a, String b){
		
		int max=0;
		int[][] cache = new int[a.length()+1][b.length()+1];
		
		for(int i=1;i<=a.length();i++){
			for (int j=1;j<=b.length();j++){
				if(a.charAt(i-1)==b.charAt(j-1)){
					cache[i][j]=cache[i-1][j-1]+1;										
									
				}else if(cache[i-1][j]>cache[i][j-1]){
					cache [i][j]= cache[i-1][j];					
				}else{
					cache [i][j]=cache[i][j-1];					
				}
				if(max < cache[i][j]){
					max = cache[i][j];
				}
				//System.out.print(cache[i][j] + ",");
				
			}
			System.out.println();
			
		}
		
		// Following code is used to print LCS
		int m =a.length();
		int n = b.length();
		int index = cache[m][n];
		
		// Create a character array to store the lcs string
		char[] lcs = new char[index+1];
		lcs[index] = '\0'; // Set the terminating character

		// Start from the right-most-bottom-most corner and
		// one by one store characters in lcs[]
		int i = m, j = n;
		while (i > 0 && j > 0)
		{
			// If current character in X[] and Y are same, then
			// current character is part of LCS
			if (a.charAt(i-1) == b.charAt(j-1))
			{
				// Put current character in result
				lcs[index-1] = a.charAt(i-1); 
				
				// reduce values of i, j and index
				i--; 
				j--; 
				index--;	 
			}

			// If not same, then find the larger of two and
			// go in the direction of larger value
			else if (cache[i-1][j] > cache[i][j-1])
				i--;
			else
				j--;
		}
		
		System.out.println("lcs :"+max);
		return new String(lcs);
		
	}

}

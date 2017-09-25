package com.sstummala.codingproblems.dp;


/**
 * Date 09/24/2017
 * @author SIVA SANKAR TUMMALA
 *
 * Given a string find longest palindromic subsequence in this string.
 *  NOTE: a subsequence is a sequence of chars that may not be contiguous[adjacent].
 *
 * Time complexity - O(n^2)
 * Space complexity - O(n^2)
 *
 * Youtube link - https://youtu.be/_nCsPn7_OgI
 *
 * References
 * http://www.geeksforgeeks.org/dynamic-programming-set-12-longest-palindromic-subsequence/
 */


public class LongestPalindromicSubsequence {
	
	 public static void main(String args[]){
	        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
	        String str = "agbdba";
	        int r1 = lps.calculateRecursive(str.toCharArray(), 0, str.length());
	        int r2 = lps.calculateDP(str.toCharArray());
	        System.out.println("LongestPalindromeSubsequence Using DP : " + r1);
	        System.out.println("LongestPalindromeSubsequence Using Recursve : " + r2);
	    }
	
	 public int calculateDP(char []str){
	        int cache[][] = new int[str.length][str.length];
	        for(int i=0; i < str.length; i++){
	            cache[i][i] = 1;
	        }
	        for(int l = 2; l <= str.length; l++){
	            for(int i = 0; i < str.length-l + 1; i++){
	                int j = i + l - 1;
	                if(l == 2 && str[i] == str[j]){
	                    cache[i][j] = 2;
	                }else if(str[i] == str[j]){
	                    cache[i][j] = cache[i + 1][j-1] + 2;
	                }else{
	                    cache[i][j] = Math.max(cache[i + 1][j], cache[i][j - 1]);
	                }
	                System.out.print(cache[i][j] + ",");
	            }
	            System.out.println();
	        }
	        return cache[0][str.length-1];
	    }


	    public int calculateRecursive(char str[],int start,int len){
	        if(len == 1){
	            return 1;
	        }
	        if(len ==0){
	            return 0;
	        }
	        if(str[start] == str[start+len-1]){
	            return 2 + calculateRecursive(str,start+1,len-2);
	        }else{
	            return Math.max(calculateRecursive(str, start+1, len-1), calculateRecursive(str, start, len-1));
	        }
	    }
	    
	   
	    

}

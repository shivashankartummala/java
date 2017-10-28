package com.sstummala.codingproblems;

public class LongestRepeatingChar {
	public static void main(String[] args){
		
		longestRepeatingchar("AABCDDBBBEADDDD");
		
	}
	
	public static void longestRepeatingchar(String s){
		char prev=' ',cur, max_char=' ';
		int count=0, max_count=0;
		char[] chars = s.toCharArray();		
		
		
		for(char c:chars){
			cur = c;
			if(cur==prev) count++;
			else count=1;
			if(count>=max_count){
				max_count = count;
				max_char = cur;
			}			
			
			prev=cur;
		}
		
		System.out.println("Max repeating consecutive char :"+ max_char + " of count "+ max_count);
	}

}

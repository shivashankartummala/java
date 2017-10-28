package com.sstummala.codingproblems;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("is ABABA palindrome :" + isPalindrome("ABABA"));
		System.out.println("is ABAB palindrome :" + isPalindrome("ABAB"));

	}
	
	public static boolean isPalindrome(String s){
		
		char[] c = s.toLowerCase().toCharArray();
		int l=c.length;
		boolean flag=false;
		
		for(int i=0,j=l-1;i<=l/2;i++,j--){
			if(c[i]==c[j]) flag = true;
			else flag= false;
		}
		return flag;
	}

}

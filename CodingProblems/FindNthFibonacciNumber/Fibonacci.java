package com.sstummala.codingproblems.recursion;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	  public static void main(String ars[]){
		  
		  Scanner scanner = new Scanner(System.in);
		//  int input = scanner.nextInt();
		 int input =7;
		 System.out.println("Brute force / Naive Recursive Approach : " + input + "th Fibonacci number is: " +getFibonacci(input));
		 System.out.println("Topdown/ Recursive Dynamic programming:" + input + "th Fibonacci number is: " +getFibonacciTopdownDP(input));
		  System.out.println("Bottomup/ Iterative Dynamic programming:" +input + "th Fibonacci number is: " +getFibonacciBottomupDP(input));
	  }
	  
	  /* In the Fibonacci sequence, the first two numbers are 0 and 1 and each number after that is the sum of the previous two numbers in the sequence.
	   * So, the sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21… and so on. The “0” in the sequence is considered to be the 0th element, 
	   * the first “1” is considered to be the 1st element, the 2 is the 3rd element, etc. And the problem specifically states that the function 
	   * or method needs to return the nth element in the Fibonacci sequence, where the input to that function or method is n.
	   * 
	   * 0, 1, 1, 2, 3,5,8,13,21, ...
	   */
	  
	/*
	* time complexity : O(2^n)
	* space complexity : O(1)
	*/
	  public static int getFibonacci(int n){
		  	  		  
		  if(n == 0) return 0;
		  if(n == 1) return 1;
		  return getFibonacci(n-1) + getFibonacci(n-2) ;
		  
	  }
	  
	  //Topdown dynamic programming approach is recursion + memoization data structure.
	/*
	* time complexity : O(n)
	* space complexity : O(n)
	*/
	  public static int getFibonacciTopdownDP(int n){
		  int[] cache = new int[n+1];
		  Arrays.fill(cache, -1);
		  cache[0]=0;
		  cache[1]=1;
		  
		  return  getFibonacciTopdownDP(n,cache);
	  }
	  
	  public static int getFibonacciTopdownDP(int n, int[] cache){
		  if(cache[n]>-1) return cache[n];
		  
		  cache[n] = getFibonacciTopdownDP(n-1, cache) + getFibonacciTopdownDP(n-2,cache);
		  
		  return cache[n];
		  
		  
	  }
	  
	  // Bottomup Dynamic programming approach is iterative and it starts calculation from 0 to n.
	  // Bottomup Dynamic programming approach is iterative + memoization data structure 
	/*
	* time complexity : O(n)
	* space complexity : O(n)
	*/
	  public static int getFibonacciBottomupDP(int n){
		  if(n==0) return 0;
		  int[] cache = new int[n+1];
		  Arrays.fill(cache, -1);
		  cache[0]=0;
		  cache[1]=1;
		  
		  for(int i=2;i<=n;i++){
			  cache[i]=cache[i-1]+cache[i-2];
		  }
		  
		  return cache[n];
	  }
	  
}

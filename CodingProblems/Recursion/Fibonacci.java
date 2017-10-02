package com.sstummala.codingproblems.recursion;

import java.io.BufferedReader;
import java.util.Scanner;

public class Fibonacci {

	  public static void main(String ars[]){
		  
		  Scanner scanner = new Scanner(System.in);
		  int input = scanner.nextInt();
		 // int input = 5;
		  System.out.println(input + "th Fibonacci number is: " +getFibonacci(input));
		  
	  }
	  
	  /* In the Fibonacci sequence, the first two numbers are 0 and 1 and each number after that is the sum of the previous two numbers in the sequence.
	   * So, the sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21… and so on. The “0” in the sequence is considered to be the 0th element, 
	   * the first “1” is considered to be the 1st element, the 2 is the 3rd element, etc. And the problem specifically states that the function 
	   * or method needs to return the nth element in the Fibonacci sequence, where the input to that function or method is n.
	   * 
	   * 0, 1, 1, 2, 3,5,8,13,21, ...
	   */
	  
	  public static int getFibonacci(int n){
		  	  		  
		  if(n == 0) return 0;
		  if(n == 1) return 1;
		  return getFibonacci(n-1) + getFibonacci(n-2) ;
		  
	  }
	  
	  
}

package com.sstummala.codingproblems.recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(input + " Factorial is : " +getFactorial(input));
		
	}
	
	/*
	 * In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. For example,
	 *  5! = 5*4*3*2*1 = 120.
	 */
	public static int getFactorial(int n){
		if (n<=1) return 1;
		return getFactorial(n-1) * n;
		
	}

}

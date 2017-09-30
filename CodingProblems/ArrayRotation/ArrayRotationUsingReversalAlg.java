package com.sstummala.codingproblems;

import java.util.Arrays;

public class ArrayRotationUsingReversalAlg {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int pivot=4;
	/*
	 * This is a inplace swapping/rotation algorithm to rotate an array with a pivot index.	
	 * 
	 * This is algorithm uses array reversal approach.
	 * 
	 * 	time complexity = O(n)
	 *  space complexity = O(1)
	 *  
	 *   array:  {1,2,3,4,5,6,7,8,9,10};
	 *   index :   0,1,2,3,4,5,6,7,8,9
	 *   pivot :   <head-->^<-----tail>         > 5 should the first element in the output as index 4 is the pivot.
	 *   
	 *   Rotate the head part of the array which before the pivot.{1,2}
	 *   output : {5,6,7,8,9,10,1,2,3,4}
	 *   
	 *   References : https://www.youtube.com/watch?v=EpP6YuqzHe8
	 */
	
	reverse(arr,0,pivot-1);
	System.out.println("step1[head Reverse]: " +Arrays.toString(arr));
	//  Rotate the head part of the array which before the pivot.{3,4,5,6,7,8,9}
	reverse(arr,pivot,arr.length-1);
	System.out.println("step2[tail Reverse]: " +Arrays.toString(arr));
	// Now Reverse the total array
	reverse(arr,0,arr.length-1);
	System.out.println("final output [Rotated]: " +Arrays.toString(arr));
	
	}
	// method that swaps the elements in the array between a begin index and end index.
	static void reverse(int [] nums,int begin,int end) {
		for(int i=begin;i<=(begin+end)/2;i++) {
			int temp=nums[i];
			nums[i]=nums[(begin+end)-i];
			nums[(begin+end)-i]=temp;
			
		}
	}
}

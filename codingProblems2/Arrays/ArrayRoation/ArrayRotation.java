package com.sstummala.codingproblems2.arrays;

public class ArrayRotation {
	
	public static void rotateArray(int[] input, int rotateby) {
		int lastIndex = input.length -1;
		reverseArray(input, 0, lastIndex -rotateby);
		reverseArray(input, lastIndex -rotateby + 1, lastIndex);
		reverseArray(input, 0, lastIndex);
		
		
	}
	
	public static void reverseArray(int[] input, int start, int end) {
		
		while(start < end) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
			
		}
			
		
	}
	
	
}

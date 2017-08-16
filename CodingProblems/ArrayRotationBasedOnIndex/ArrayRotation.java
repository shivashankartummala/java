package com.iitjobs;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int pivot=4;
	//
	// array:  {1,2,3,4,5,6,7,8,9,10};
	//index :   0,1,2,3,4,5,6,7,8,9
	//pivot :   <head-->^<-----tail>         > 5 should the first elemenet in the output
	// Rotate the head part of the array which before the pivot.{1,2}
	// output : {5,6,7,8,9,10,1,2,3,4}
	rotate(arr,0,pivot-1);
	//  Rotate the head part of the array which before the pivot.{3,4,5,6,7,8,9}
	rotate(arr,pivot,arr.length-1);
	// Rotate the total array
	rotate(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
	
	}
	// method that swaps the elements in the array between a begin index and end index.
	static void rotate(int [] nums,int begin,int end) {
		for(int i=begin;i<=(begin+end)/2;i++) {
			int temp=nums[i];
			nums[i]=nums[(begin+end)-i];
			nums[(begin+end)-i]=temp;
			
		}
	}
}

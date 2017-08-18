package com.iitjobs;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]){
		int[] inputArray={1,6,9,3,2,4,7,5,8,10};
		System.out.println("input array: " +Arrays.toString(inputArray));
		mergeSort(inputArray,0,inputArray.length-1);
		System.out.println("final output: " +Arrays.toString(inputArray));
	}
	
	//Merge Sort is a Divide and Conquer algorithm. 
	//It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
	// Time Complexity : O(nlogn) in all 3 cases (worst, average and best) as merge sort always divides the array in two halves and take linear time to merge two halves.
	// Space Complexity : O(n). Need n auxiliary space for swapping the elements during merge.
	//Algorithmic Paradigm: Divide and Conquer
	//Sorting In Place: No in a typical implementation
    //Stable: Yes
	
	static void mergeSort(int[] array, int startIndex, int endIndex){
		if(startIndex < endIndex){
			//find the middle index of the array
			int middle = (startIndex + endIndex) / 2;
			//recursively call mergesort on head subarray [start to middle]
			mergeSort(array, startIndex, middle);
			//recursively call mergesort on tail subarray [middle to end]
			mergeSort(array, middle+1, endIndex);
			//merge the two sorted subarrays into one sorted array. 
			merge(array, startIndex, middle, endIndex);
		}	
	}

	//merge method is to merge two sorted arrays into one sorted array.
	static void merge(int[] array, int low, int middle, int high){
		int[] helperArray = new int[array.length];
		for (int i = low; i <= high; i++) {
			helperArray[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle+1;
		int current = low;
		
		while (helperLeft <= middle && helperRight <=high) {
			if(helperArray[helperLeft] <= helperArray[helperRight]){
				array[current] = helperArray[helperLeft];
				helperLeft++;
				
			}else{
				array[current] = helperArray[helperRight];
				helperRight++;
			}
			current ++;		
		}
		
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current+i] = helperArray[helperLeft+ i];
		}
	}

}
//input array: [1, 6, 9, 3, 2, 4, 7, 5, 8, 10]
//final output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

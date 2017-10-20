package com.sstummala.codingproblems.sorting;

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
		
		int i = low; // leftArrayCursor
		int j = middle+1; //rightArrayCursor
		int k = low; //resultArrayCursor
		
		//since both the left array and right array are sorted, the next smallest element from one of the array is picked into the result array.		
		while (i <= middle && j <=high) {
			if(helperArray[i] <= helperArray[j]){
				array[k] = helperArray[i++];
				
				
			}else{
				array[k] = helperArray[j++];
				
			}
			k++;		
		}
		// Copy the rest of the left side of the array into the target array
		int remaining = middle - i;
		for (int l = 0; l <= remaining; l++) {
			array[k+l] = helperArray[i+l];
		}
		// Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
	}

}

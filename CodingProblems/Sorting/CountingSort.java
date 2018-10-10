package com.sstummala.codingproblems.sorting;

public class CountingSort {
	
	/* ################################################################
	 * 
	 * Counting sort is a very time-efficient (and somewhat space-inefficient) algorithm for sorting that avoids comparisons 
	 * and exploits the O(1)O(1) time insertions and lookups in an array.
	 * The idea is simple: if you're sorting  integers and you know they all fall in the range 1..1001..100, you can generate a sorted array this way:
	 * Allocate an array numCounts where the indices represent numbers from our input array and the values represent how many times the index number appears. 
	 * Start each value at 0. In one pass of the input array, update numCounts as you go, so that at the end the values in numCounts are correct.
	 * Allocate an array sortedArray where we'll store our sorted numbers. In one in-order pass of numCounts put each number, the correct number of times, into sortedArray.
	 * 
	 * Time Complexity : O(n)  
	 * Space Complexity : O(n+R) where R is the size of the Range, n is the size of the input.
	 * 
	 * When to Use : when the range of the input is known before hand.
	 * 
	 * ###############################################################
	 */

	  public int[] countingSort(int[] theArray, int maxValue) {

		    // array of 0's at indices 0...maxValue
		    int numCounts[] = new int[maxValue + 1];

		    // populate numCounts
		    for (int num : theArray) {
		        numCounts[num]++;
		    }

		    // populate the final sorted array
		    int[] sortedArray = new int[theArray.length];
		    int currentSortedIndex = 0;

		    // for each num in numCounts
		    for (int num = 0; num < numCounts.length; num++) {
		        int count = numCounts[num];

		        // for the number of times the item occurs
		        for (int i = 0; i < count; i++) {

		            // add it to the sorted array
		            sortedArray[currentSortedIndex] = num;
		            currentSortedIndex++;
		        }
		    }

		    return sortedArray;
		}
	
}

package com.sstummala.codingproblems;

import java.util.Arrays;

//Java program for implementation of QuickSort
class QuickSort
{
 /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
	/* Time Complexity : O(n^2) for Worst case
	 *                   O(nLogn) for Best Case and Avg case
	 * Worst Case: The worst case occurs when the partition process always picks greatest or smallest element as pivot. 
	 * If we consider above partition strategy where last element is always picked as pivot, the worst case would occur 
	 * when the array is already sorted in increasing or decreasing order. Following is recurrence for worst case.
	 * 
	 *Best Case : The best case occurs when the partition process always picks the middle element as pivot. 
	 *Following is recurrence for best case.
	 * 
	 */
 int partition(int arr[], int low, int high)
 {
     int pivot = arr[high]; 
     int i = (low-1); // index of smaller element
     for (int j=low; j<high; j++)
     {
         // If current element is smaller than or
         // equal to pivot
         if (arr[j] <= pivot)
         {
             i++;

             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // swap arr[i+1] and arr[high] (or pivot)
     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;

     return i+1;
 }


 /* The main function that implements QuickSort()
   arr[] --> Array to be sorted,
   low  --> Starting index,
   high  --> Ending index */
 void sort(int arr[], int low, int high)
 {
     if (low < high)
     {
         /* pi is partitioning index, arr[pi] is 
           now at right place */
         int pi = partition(arr, low, high);

         // Recursively sort elements before
         // partition and after partition
         sort(arr, low, pi-1);
         sort(arr, pi+1, high);
     }
 }


 // Driver program
 public static void main(String args[])
 {
     int arr[] = {10, 7, 8, 9, 1, 5};
     int n = arr.length;
     System.out.println("Input array: " +Arrays.toString(arr));
     QuickSort ob = new QuickSort();
     ob.sort(arr, 0, n-1);

     System.out.println("Sorted array: " +Arrays.toString(arr));
 }
}

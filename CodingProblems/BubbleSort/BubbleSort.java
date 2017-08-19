package com.iitjobs;

import java.util.Arrays;

//Java program for implementation of Bubble Sort
// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
/*
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * Auxiliary Space: O(1)
 * 
 * Sorting In Place: Yes
 * Stable: Yes
 * 
 * 
 */
class BubbleSort
{
 void bubbleSort(int arr[])
 {
     int n = arr.length;
     boolean swapped;
    
     for (int i = 0; i < n-1; i++){
    	 swapped = false;
         for (int j = 0; j < n-i-1; j++){
             if (arr[j] > arr[j+1])
             {
                 // swap temp and arr[i]
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                 swapped = true;
             }
          }
         if (swapped == false)
             break;
          
   }    
 }



 // Driver method to test above
 public static void main(String args[])
 {
     BubbleSort ob = new BubbleSort();
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     System.out.println("input array: " +Arrays.toString(arr));
     ob.bubbleSort(arr);
     System.out.println("sorted array: " +Arrays.toString(arr));
 }
}

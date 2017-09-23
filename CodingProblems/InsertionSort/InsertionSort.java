package com.sstummala.codingproblems;

public class InsertionSort {
	
	//  Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands
	// Insertion sort partitions the array into sorted portion and unsorted portion when initially the sorted portion is empty.
	// And Each element is inserted into the sorted portion where it fits. 
	// after each iteration the sorted portions keeps growing, but the elements are may not be in their final position.
	//  Sort an arr[] of size n
	//  insertionSort(arr, n)
	//   Loop from i = 1 to n-1.
	//        ……a) Pick element arr[i] and insert it into sorted sequence arr[0…i-1] 
	// 
	//Time Complexity: O(n*n)
	//Auxiliary Space: O(1)
	// Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
    // Algorithmic Paradigm: Incremental Approach
	// Sorting In Place: Yes
	// Stable: Yes
	// Online: Yes
	// Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
	//
	
	
	
	/*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {        
        int arr[] = {12, 11, 13, 5, 6};
 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
    }
}



package com.sstummala.codingproblems;

import java.util.Arrays;

public class SelectionSort {
	
	//
    /* Section Sort selects the smallest element of the array and it places it in its final position.
     * 
     * 
     * 
     */
	
	
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
 
        System.out.println("input array: " +Arrays.toString(arr1));
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("sorted array: " +Arrays.toString(arr1));
    }  

}

package com.sstummala.codingproblems.dp;

public class KnapSackDP {
	// solving 0/1 Knapsack problem with Dynamic programming
	// Time Complexity : O(n*c) where n = size of the input and c = capacity of the knapsack
	//Time complexity of Recursive/bruteforce : O(2^n)
	
	 // Driver program to test knapsack function
    public static void main(String args[])
    {
        int val[] = new int[]{6, 10, 12};
        int wt[] = new int[]{1, 2, 3};
        int  cap = 5;
        int n = val.length;
        System.out.println(knapSack(cap, wt, val, n));
        
        //  
        //   val W 0  1  2  3  4  5
        //  0[0]  {0  0  0  0  0  0}
        //  1[6]  {0  6  6  6  6  6}
        //  2[10] {0  6 10 16 16 16}
        //  3[12] {0  6 10 16 18 22}
    }
	
	  // A utility function that returns maximum of two integers
    static int max(int a, int b) { return (a > b)? a : b; }
      
   // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int capacity, int weights[], int vals[], int n)
    {
         int item, w;
     int cacheMatrix[][] = new int[n+1][capacity+1];
      
     // Build table cacheMatrix[][] in bottom up manner
     for (item = 0; item <= n; item++)
     {
         for (w = 0; w <= capacity; w++)
         {
             if (item==0 || w==0)
                  cacheMatrix[item][w] = 0;
             else if (weights[item-1] <= w)
                   cacheMatrix[item][w] = max(vals[item-1] + cacheMatrix[item-1][w-weights[item-1]],  cacheMatrix[item-1][w]);
             else
                   cacheMatrix[item][w] = cacheMatrix[item-1][w];
         }
      }
      
      return cacheMatrix[n][capacity];

    }
}

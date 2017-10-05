import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/ctci-bubble-sort

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        sort(a,n);
    }
    
    public static void sort(int[] input, int size){
        
        int totswaps=0;
        for(int i=0;i<size;i++){
            int swapcount =0;
            for(int j=0;j<size-1;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                    swapcount++;
                    totswaps++;
                }
            
            }
          
         if(swapcount==0)break; 
        }  
    
    System.out.println("Array is sorted in " + totswaps +" swaps.");
    System.out.println("First Element: "+ input[0]);
    System.out.println("Last Element: " + input[size-1]);
        
    }
    
   
}

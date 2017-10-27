import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
        reverse(a, 0,n-1);
        return a;
      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
    
       
    public static void reverse(int[] input, int start, int end){
        
        int temp;
        
        for(int i=start; i<= (end + start)/2; i++){
            temp = input[i];
            input[i]=input[(start + end) - i ];
            input [(start + end )- i] = temp;
        }
        
        
    }
    
}

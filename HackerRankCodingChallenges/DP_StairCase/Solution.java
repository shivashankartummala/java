import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.youtube.com/watch?v=CFQk7OQO_xM
//https://www.hackerrank.com/challenges/ctci-recursive-staircase

public class Solution {
    public static HashMap<Integer, Integer> cache= new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(climb(n));
        }
    }
    
    public static int climb(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(n==1) return 1;
        
        if(!cache.containsKey(n)){
            int ways = climb(n-1)+climb(n-2)+climb(n-3);
            cache.put(n,ways);            
        }
        
        return cache.get(n);
        
    }
}

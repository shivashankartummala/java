import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
* https://www.hackerrank.com/challenges/ctci-find-the-running-median
*/

public class Solution {
    static PriorityQueue<Integer> lower;
    static PriorityQueue<Integer> upper;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
       lower= new PriorityQueue<Integer>((x,y)->y-x);
       upper= new PriorityQueue<Integer>();
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            System.out.println(getMeadian(a[a_i]));
            
        }
        
       
    }
    
     public static float getMeadian(int i){
         float median ;
         
         lower.add(i);
         if(lower.size()-upper.size() >1) upper.add(lower.remove());     
                
        
         if(!upper.isEmpty() && lower.peek() > upper.peek()) upper.add(lower.remove()); 
          if(upper.size()-lower.size()>1) lower.add(upper.remove()); 
         
         
         //System.out.println("lower size:" + lower.size()+ ",max of lower:"+lower.peek());
         //System.out.println("upper size:" + upper.size()+ ",min of upper:"+upper.peek());
         
        
         if(lower.size() == upper.size()){
             median = (float)(lower.peek() + upper.peek())/2;            
          }else if(lower.size()>upper.size()){
             median = lower.peek();     
          }else{
             median = upper.peek();
       }
       
           return median; 
     }
}

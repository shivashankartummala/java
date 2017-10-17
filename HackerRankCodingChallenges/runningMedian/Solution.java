import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /* reference : https://www.youtube.com/watch?v=VmogG01IjYc&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=12
    *   reference : https://www.hackerrank.com/challenges/ctci-find-the-running-median
    *
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> lower = new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                   return -1 * a.compareTo(b);
            }
        }); // priority queue with a custom comparator to implement a max heap. In java the priority queue is a min heap by default.
        /* in Java 8, the the custom comparator can be given as a lamda expression as below for implementing a max heap.
        *  PriorityQueue<Integer> lower = new PriorityQueue<Integer>((x, y) -> y - x);
        */
         PriorityQueue<Integer> upper = new PriorityQueue<Integer>();
         
        
        
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            addItem(lower, upper, a[a_i]);
            rebalance(lower, upper);
            System.out.println(getMedian(lower, upper));
        }
    }
    
    public static void addItem(PriorityQueue<Integer> a, PriorityQueue<Integer> b, int x){
        if(a.size()==0 || x<a.peek()){
            a.add(x);            
        }else{            
            b.add(x);
        }        
    }
    public static void rebalance(PriorityQueue<Integer> a, PriorityQueue<Integer> b){
        PriorityQueue<Integer> bigger=a.size()>b.size()?a:b;
        PriorityQueue<Integer> smaller=a.size()<b.size()?a:b;
        
        if(bigger.size()-smaller.size()>=2){
            smaller.add(bigger.poll());
        }        
    }
    public static double getMedian(PriorityQueue<Integer> a, PriorityQueue<Integer> b){
        double median;
        PriorityQueue<Integer> bigger=a.size()>b.size()?a:b;
        PriorityQueue<Integer> smaller=a.size()<b.size()?a:b;
        
        if(a.size()==b.size()){
            median = (double) (a.peek()+b.peek())/2;
             
        }else{
             median = (double) bigger.peek();
            
        }
        return median;
        
    }
    
}

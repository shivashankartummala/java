import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem

public class Solution {
    
    public static boolean isBalanced(String expression) {
        
        Stack<Character> stack = new Stack<Character>();
        for(char c: expression.toCharArray()){
            switch (c){
                case '{': stack.push('}'); break;
                case '(': stack.push(')'); break;
                case '[': stack.push(']'); break;
                default :
                    if(stack.empty() || c!=stack.peek())
                       return false;
                     stack.pop();  
            }
                      
        }
         return stack.empty();   
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

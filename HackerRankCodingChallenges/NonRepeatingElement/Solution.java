import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Find the first non repeating char in a given string 
/*
*  input : abacb
*  output : c
*/

public class Solution {
    
    public static int lonelyInteger(int[] a) {
        int val = 0;
        for(int i : a){
            val ^=i;
        }
        return val;
        
    }
    
    public static char lonelyChar(char[] a) {
        int val = 0;
        for(char i : a){
            val ^=i;
        }
        return (char)val;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char a[] = new char[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.next().charAt(0);
        }
        System.out.println(lonelyChar(a));
    }
}

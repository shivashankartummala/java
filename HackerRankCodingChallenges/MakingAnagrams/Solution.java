import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] cache = new int[26];
        
        for (char c1 : first.toCharArray()) cache[c1 - 'a']++;
        for (char c2: second.toCharArray()) cache[c2 - 'a']--;
        
        int count=0;
        for (int i=0; i<26; i++){
            if(cache[i]!=0) count += Math.abs(cache[i]);
        }
        return count;
        
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

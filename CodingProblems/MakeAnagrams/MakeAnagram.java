package com.sstummala.codingproblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * Alice is taking a cryptography class and finding anagrams to be very useful. 
 * We consider two strings to be anagrams of each other if the first string's letters
 *  can be rearranged to form the second string. In other words, both strings must 
 *  contain the same exact letters in the same exact frequency For example, bacdc and
 *   dcbac are anagrams, but bacdc and dcbad are not.  Alice decides on an encryption scheme
 *    involving two large strings where encryption is dependent on the minimum number of characte
 *    r deletions required to make the two strings anagrams. Can you help her find this number?
* Given two strings, a and b, that may or may not be of the same length, determine the minimum 
* number of character deletions required to make a and  b anagrams. Any characters can be deleted from either of the strings.
* 
*   Constraints
*   1<=|a|,|b|<=10^4
 *  It is guaranteed that a and b consist of lowercase English alphabetic letters (i.e. a,z  through ). 
 */

public class MakeAnagram {
	
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

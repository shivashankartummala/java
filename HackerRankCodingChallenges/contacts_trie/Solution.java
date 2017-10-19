import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
* refer : https://www.youtube.com/watch?v=vlYZb68kAY0&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=15
* refer : https://www.hackerrank.com/challenges/ctci-contacts/problem
*/

public class Solution {

    public static void main(String[] args) {
        Node trie = new Node();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) trie.add(contact);
            else if(op.equals("find")) System.out.println(trie.find(contact,0));
            
        }
    }
    
    public static class Node {
       Node[] children = new Node[26];
       int size=0;
       
       public void add(String s){
           add(s,0);
       }
       private static int getCharIndex(char c){
           return c - 'a';
       }
       private Node getNode(char c){
           return children[getCharIndex(c)];
       }
       
       private void setNode(Node node,char c){
           children[getCharIndex(c)] = node;
           
       }
       
       private void add(String s, int i){
           this.size++;         
          
           if(i == s.length()) {
                return;
           }
           char cur = s.charAt(i);
            Node child = this.getNode(cur);
           // System.out.print("thisNode:"+this.toString()+";level:"+i+";size:"+size+";char:"+cur+";charindex:"+getCharIndex(cur));
          
           if(child == null){
               child = new Node();               
               this.setNode(child,cur);
              // System.out.println("; node added:"+cur+" ; child:"+child.toString());
           }else{
               //System.out.println("; node already exists:"+cur+" ; child:"+child.toString());
           }
           child.add(s,i+1);
                    
       }
       
       public int find(String s,int i){
           if(i == s.length()) return size;           
           Node child = getNode(s.charAt(i));
           if(child == null) return 0;
           return child.find(s,i+1);
           
       }
   }
}

package com.sstummala.codingproblems2.recursion;

import java.util.Stack;

public class TowersofHanoi {
	
	public static void transferDisks(Stack<Integer> source, Stack<Integer> temp,Stack<Integer> target, int size) {
		if(size==0) return;
		if(size==1) {
			target.push(source.pop());
		   // System.out.println(target.peek());
		    return;
		}
		transferDisks(source,target,temp,size-1);
		transferDisks(source,temp,target,1);
	    //System.out.println(target.peek());
	    transferDisks(temp,source,target,size-1);
		
		
	}

}

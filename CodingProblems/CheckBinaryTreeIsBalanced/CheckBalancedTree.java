package com.sstummala.codingproblems.tree;

public class CheckBalancedTree {
	
	public static boolean isBalancedTree(Node root) {
		
		return isBalanced(root)>0?true:false;
		
	}
	
	public static int isBalanced(Node root) {
		
		if(root==null) return 0;
		
		int lh = isBalanced(root.left);
		int rh = isBalanced(root.right);
		
		if(lh==-1 || rh ==-1) return -1;
		
		if(Math.abs(lh-rh)>1) return -1;
		return lh>rh?lh+1:rh+1;
		
	}

}

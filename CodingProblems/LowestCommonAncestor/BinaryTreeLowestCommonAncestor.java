package com.sstummala.codingproblems.tree;

public class BinaryTreeLowestCommonAncestor {

	public Node lca(Node root, int a, int b) {
		if (root == null) return null;
		if(root.value==a) return root;
		if(root.value==b) return root;
		Node left = lca(root.left,a,b);
		Node right = lca(root.right,a,b);
		
		if(left!=null && right!=null) return root;
		if(left==null && right==null) return null;
		
		return left!=null?left:right;
		
	}
	
}

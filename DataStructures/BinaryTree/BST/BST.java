package com.sstummala.codingproblems.tree;



public class BST {
	TreeNode root;
	
	public BST(int val){
		this.root = new TreeNode();
		root.value = val;
	}
	
	public BST(int[] array){
		this(array[0]);
		for(int i=1;i<array.length;i++){
			add(array[i]);
		}
		
	}
	
	public void add(int val){
		addNode(this.root, val);
	}
	
	private void addNode(TreeNode root,int val){
		if(root.value>val) {
			if(root.left!=null){
				addNode(root.left,val);
			}
			else{
				TreeNode lnode = new TreeNode();
				lnode.value = val;
				root.left = lnode;
			}
				
		}else{
			if(root.right!=null){
				addNode(root.right,val);
			}else{
				TreeNode rnode = new TreeNode();
				rnode.value = val;
				root.right = rnode;
			}
			
		}
		
		
	}

}

class Node {
	int value;
	Node left;
	Node right;
}

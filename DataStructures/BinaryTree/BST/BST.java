package com.sstummala.codingproblems.tree;



public class BST {
	Node root;
	
	public BST(int val){
		this.root = new Node();
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
	
	private void addNode(Node root2,int val){
		if(root2.value>val) {
			if(root2.left!=null){
				addNode(root2.left,val);
			}
			else{
				Node lnode = new Node();
				lnode.value = val;
				root2.left = lnode;
			}
				
		}else{
			if(root2.right!=null){
				addNode(root2.right,val);
			}else{
				Node rnode = new Node();
				rnode.value = val;
				root2.right = rnode;
			}
			
		}
		
		
	}

}

class Node {
	int value;
	Node left;
	Node right;
}

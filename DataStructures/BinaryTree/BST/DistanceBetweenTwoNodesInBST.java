package com.sstummala.codingproblems.tree;

public class DistanceBetweenTwoNodesInBST {
	
	public static void main(String[] args){
		
		int[] input = new int[] {5,6,3,1,2,4,8,7,9};
		
		System.out.println(bstDistance(input, input.length,2,4));
	}
	
	public static int bstDistance(int[] a, int size, int i,int j){
		int dist=0;
		TreeNode tree = new TreeNode();
		tree.value=a[0];
		for(int k=1;k<size;k++){
			addNode(tree,a[k]);
		}
		
		dist = distBST(tree,i,j);
		//dist = distFromRoot(tree,i);
		//dist = distFromRoot(tree,j);
		
		return dist;
	}
	
	public static int distBST(TreeNode root,int i, int j){
		
		if(root==null) return 0;
		if(root.value>i && root.value>j){
			return distBST(root.left,i,j);
			
		}else if(root.value<i && root.value<j){
			 return distBST(root.right,i,j);
		}else{
			return distFromRoot(root,i) + distFromRoot(root,j);
		}
		
		
		
	}
	
	public static int distFromRoot(TreeNode root,int i){
		
		if(root==null) return -1;
		if(root.value==i) return 0;
		int dist = -1;
		
		if(root.value>i && root.left!=null) {
			int curdist = distFromRoot(root.left,i);
			 dist =curdist!=-1?curdist+1:-1;
			return dist;
			 
		}
		if(root.value<i && root.right!=null) {
			int curdist = distFromRoot(root.right,i);
			dist = curdist!=-1?curdist+1:-1;
			return dist;
		}
			
		else return -1;
		
	}
	
	public static void addNode(TreeNode root,int val){
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

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
}
package com.sstummala.codingproblems;

public class DistanceBetweenTwoNodesInBST {
	
	public static void main(String[] args){
		
		int[] input = new int[] {5,6,3,1,2,4,8,7,9};
		
		System.out.println(bstDistance(input, input.length,1,6));
	}
	
	public static int bstDistance(int[] a, int size, int i,int j){
		int dist=0;
		Node tree = new Node();
		tree.value=a[0];
		for(int k=1;k<size;k++){
			addNode(tree,a[k]);
		}
		
		dist = distBST(tree,i,j);
		//dist = distFromRoot(tree,i);
		//dist = distFromRoot(tree,j);
		
		return dist;
	}
	
	public static int distBST(Node root,int i, int j){
		
		if(root==null) return 0;
		if(root.value>i && root.value>j){
			return distBST(root.left,i,j);
			
		}else if(root.value<i && root.value<j){
			 return distBST(root.right,i,j);
		}else{
			return distFromRoot(root,i) + distFromRoot(root,j);
		}
		
		
		
	}
	
	public static int distFromRoot(Node root,int i){
		
		if(root==null) return -1;
		if(root.value==i) return 0;
		int dist = -1;
		
		if(root.value>i && root.left!=null) {
			 dist =distFromRoot(root.left,i)!=-1?distFromRoot(root.left,i)+1:-1;
			return dist;
			 
		}
		if(root.value<i && root.right!=null) {
			dist = distFromRoot(root.right,i)!=-1?distFromRoot(root.right,i)+1:-1;
			return dist;
		}
			
		else return -1;
		
	}
	
	public static void addNode(Node root,int val){
		if(root.value>val) {
			if(root.left!=null){
				addNode(root.left,val);
			}
			else{
				Node lnode = new Node();
				lnode.value = val;
				root.left = lnode;
			}
				
		}else{
			if(root.right!=null){
				addNode(root.right,val);
			}else{
				Node rnode = new Node();
				rnode.value = val;
				root.right = rnode;
			}
			
		}
		
		
	}
	
	

}

class Node{
	int value;
	Node left;
	Node right;
}
package com.sstummala.codingproblems.tree;

public class DistanceBetweenTwoNodesInBST {
	
	public static void main(String[] args){
		
		int[] input = new int[] {5,6,3,1,2,4,8,7,9};
		
		System.out.println("Distance between nodes 2,4 : " + bstDistance(input, input.length,2,4));
		System.out.println("Distance between nodes 7,9 : " + bstDistance(input, input.length,7,9));
		System.out.println("Distance between nodes 7,2 : " + bstDistance(input, input.length,7,2));
		System.out.println("Distance between nodes 6,7 : " + bstDistance(input, input.length,6,7));
		System.out.println("Distance between nodes 3,8 : " + bstDistance(input, input.length,3,8));
		System.out.println("Distance between nodes 1,8 : " + bstDistance(input, input.length,1,8));
	}
	
	public static int bstDistance(int[] a, int size, int i,int j){
		int dist=0;
		BST bst = new BST(a);
		Node tree =bst.root;
				
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
	
	
}


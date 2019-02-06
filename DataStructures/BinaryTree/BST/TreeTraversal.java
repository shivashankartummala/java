package com.sstummala.codingproblems.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	
	public static void main(String[] args){
		int[] input = new int[] {5,7,3,1,2,4,8,6,9};
		//input = new int[] {4,7,2,6,1,3,8};
		BST bst = new BST(input);
		
		System.out.println("LevelOrder");
		traverseLevelOrder(bst);
		System.out.println("InOrder");
		traverseInOrder(bst);
		System.out.println("PreOrder");
		traversePreOrder(bst);
		System.out.println("PostOrder");
		traversePostOrder(bst);
		
	}
	
	public static void traverseInOrder(BST tree){
		traverseInOrder(tree.root);
	}
	
	public static void traverseInOrder(Node root){
		if(root==null)	return;		
		traverseInOrder(root.left);		
		System.out.println(root.value);
		traverseInOrder(root.right);		
		
	}
	
	public static void traversePreOrder(BST tree){
		traversePreOrder(tree.root);		
	}
	
    public static void traversePreOrder(Node root){
		if(root==null) return;
		System.out.println(root.value);
		traversePreOrder(root.left);
		traversePreOrder(root.right);
		
	}
	
	public static void traversePostOrder(BST tree){
		traversePostOrder(tree.root);
	}
	
	public static void traversePostOrder(Node root){
		if(root==null) return;
		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.println(root.value);
	}
	
	public static void traverseLevelOrder(BST tree){
		if(tree==null) return;
		Queue<Node> toVisit = new LinkedList<Node>();
		
		toVisit.add(tree.root);
		
		while(!toVisit.isEmpty()){
			Node cur = toVisit.poll();
			System.out.println(cur.value);
			if(cur.left!=null) toVisit.add(cur.left);
			if(cur.right!=null) toVisit.add(cur.right);
		}		
		
	}

}

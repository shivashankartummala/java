package com.sstummala.codingproblems.tree;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BinaryTreeCheckLCA {
	int[] data = {25,17,10,15,22,24,40,30,50};
	
	BST bst = new BST(data);
	
	LowestCommonAncestor lcaTest = new LowestCommonAncestor();
	
	@Test
	public void checkLCA() {
		TreeTraversal.traverseInOrder(bst.root);
		Node n = lcaTest.lca(bst.root,15,24);
		System.out.println("Lowest Common Ancestor for 15,24 is  " + n.value);
		assertEquals(17,n.value);
		n = lcaTest.lca(bst.root,15,30);
		System.out.println("Lowest Common Ancestor for 15,30 is  " + n.value);
		assertEquals(25,n.value);
		n = lcaTest.lca(bst.root,22,24);
		System.out.println("Lowest Common Ancestor for 22,24 is  " + n.value);
		assertEquals(22,n.value);
		n = lcaTest.lca(bst.root,50,30);
		System.out.println("Lowest Common Ancestor for 50,30 is  " + n.value);
		assertEquals(40,n.value);
	}

}

package com.sstummala.codingproblems.tree;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CheckBinaryTreeIsBalanced {
	
	BST bst1,bst2;
	
	@Before
	public void setup() {
		int[] input = new int[] {25,15,10,20,12,40,30,35};
		bst1 = new BST(input);
		
		int[] input2 = new int[] {25,15,10,20,12,40,30,35,50};
		bst2 = new BST(input2);	
		
	}
	
	@Test
	public void checkTreeIsBalanced() {
		assertFalse(CheckBalancedTree.isBalancedTree(bst1.root));
		assertTrue(CheckBalancedTree.isBalancedTree(bst2.root));
	}

}

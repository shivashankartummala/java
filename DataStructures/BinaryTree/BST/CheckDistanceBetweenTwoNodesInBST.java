package com.sstummala.codingproblems.tree;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CheckDistanceBetweenTwoNodesInBST {

	DistanceBetweenTwoNodesInBST objectUnderTest;
	int[] data1, data2;
	
	@Before
	public void setup() {
		
		data1 = new int[] {25,17,10,15,22,24,40,30,50};
		data2 = new int[] {5,6,3,1,2,4,8,7,9};
				
		
	}
	
	@Test
	public void checkDistance() {
		System.out.println("Distance between nodes 22,24 : " + objectUnderTest.bstDistance(data1, data1.length,22,24));
		System.out.println("Distance between nodes 17,24 : " + objectUnderTest.bstDistance(data1, data1.length,17,24));
		System.out.println("Distance between nodes 17,50 : " + objectUnderTest.bstDistance(data1, data1.length,17,50));
		System.out.println("Distance between nodes 25,17 : " + objectUnderTest.bstDistance(data1, data1.length,25,17));
		System.out.println("Distance between nodes 30,50 : " + objectUnderTest.bstDistance(data1, data1.length,30,50));
		System.out.println("Distance between nodes 15,15 : " + objectUnderTest.bstDistance(data1, data1.length,15,15));
		
		System.out.println("Distance between nodes 2,4 : " + objectUnderTest.bstDistance(data2, data2.length,2,4));
		System.out.println("Distance between nodes 7,9 : " + objectUnderTest.bstDistance(data2, data2.length,7,9));
		System.out.println("Distance between nodes 7,2 : " + objectUnderTest.bstDistance(data2, data2.length,7,2));
		System.out.println("Distance between nodes 6,7 : " + objectUnderTest.bstDistance(data2, data2.length,6,7));
		System.out.println("Distance between nodes 3,8 : " + objectUnderTest.bstDistance(data2, data2.length,3,8));
		System.out.println("Distance between nodes 1,8 : " + objectUnderTest.bstDistance(data2, data2.length,1,8));
	}
	
}

package com.sstummala.codingproblems2.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayRotationTest {

	@Test
	public void testRotateArray() {
		int [] input = {1,2,3,4,5,6,7};
		int [] exp = {5,6,7,1,2,3,4};
		 ArrayRotation.rotateArray(input,3);
		assertTrue(Arrays.equals(input,exp));
		System.out.println(Arrays.toString(input));
		
		int [] input2 = {1,2,3,4,5,6};
		
		int [] exp2 = {5,6,1,2,3,4} ;
		 ArrayRotation.rotateArray(input2,2);
		assertTrue(Arrays.equals(input2,exp2));
		System.out.println(Arrays.toString(input2));
		
	}

}

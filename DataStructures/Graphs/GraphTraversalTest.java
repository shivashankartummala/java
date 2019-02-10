package com.sstummala.codingproblems.graphs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class GraphTraversalTest {
	
	Graph g,g1;
	
	@Before
	public void setup() {
		char[] v = new char[] {'a','b','c','d','e'};
		boolean[][] adj = {{false,true,false,false,false},
				           {false,false,true,false,false},
				           {true,false,false,false,true},
				           {false,false,true,false,false},
				           {false,false,false,false,false}};
		
		g = new Graph(v,adj);
		
		char[] v1 = new char[] {'a','b','c','d','e','f'};
		
			
		
		char[] c1 = new char[] {'a','d'};
		char[] c2 = new char[] {'f','b'};
		char[] c3 = new char[] {'b','d'};
		char[] c4 = new char[] {'f','a'};
		char[] c5 = new char[] {'d','c'};
		
		
		ArrayList<char []> cl1=new ArrayList<char []>(); 
		cl1.add(c1);
		cl1.add(c2);
		cl1.add(c3);
		cl1.add(c4);
		cl1.add(c5);
		
		g1 = new Graph(v1,cl1);
		
	}
	
	@Test
	public void testDFS() {
		
		ArrayList<Character> actual = GraphTraversal.dFS(g);
		ArrayList<Character> expected = new ArrayList<Character>();
		expected.add('a');
		expected.add('b');
		expected.add('c');
		expected.add('e');
		expected.add('d');
		
		boolean result = Arrays.equals(actual.toArray(),expected.toArray());
		assertTrue(result);
		System.out.println("(DFS) Expected: "+ Arrays.toString(expected.toArray())+", Result :" +Arrays.toString(actual.toArray()));
		
		ArrayList<Character> actual1 = GraphTraversal.dFSPostOrder(g1);
		ArrayList<Character> expected1 = new ArrayList<Character>();
		expected1.add('f');
		expected1.add('a');		
		expected1.add('b');
		expected1.add('d');
		expected1.add('c');		
		expected1.add('e');
		
		
		boolean result1 = Arrays.equals(actual1.toArray(),expected1.toArray());
		assertTrue(result1);
		System.out.println("(DFS Post Order) Expected: "+ Arrays.toString(expected1.toArray())+", Result :" +Arrays.toString(actual1.toArray()));
		
		
	
	}
	
	@Test
	public void testBFS() {
		
		ArrayList<Character> actual = GraphTraversal.bFS(g);
		ArrayList<Character> expected = new ArrayList<Character>();
		expected.add('a');
		expected.add('b');
		expected.add('c');
		expected.add('e');
		expected.add('d');
		
		boolean result = Arrays.equals(actual.toArray(),expected.toArray());
		assertTrue(result);
		System.out.println("(BFS) Expected: "+ Arrays.toString(expected.toArray())+", Result :" +Arrays.toString(actual.toArray()));
		
		ArrayList<Character> actual1 = GraphTraversal.bFS(g1);
		
		ArrayList<Character> expected1 = new ArrayList<Character>();
		expected1.add('a');	
		expected1.add('f');			
		expected1.add('b');
		expected1.add('c');	
		expected1.add('d');			
		expected1.add('e');
		
		
		boolean result1 = Arrays.equals(actual1.toArray(),expected1.toArray());
		assertTrue(result1);
		System.out.println("(BFS) Expected: "+ Arrays.toString(expected1.toArray())+", Result :" +Arrays.toString(actual1.toArray()));
		
	
	}

}

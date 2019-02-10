package com.sstummala.codingproblems.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//This class implements the DFS BFS graph traversal algorithms.
public class GraphTraversal {
	//wrapper method for Depth first Traversal which calls the actual algorithm on a given graphnode.
	public static ArrayList<Character> dFS(GraphNode node) {
		
		ArrayList<Character> path = new ArrayList<Character>();
		
		System.out.println("******DFS*******");
		
		depthFirstTraversal(node, path);
		
		System.out.println("*************");
		
		return path;
		
	}
	
	//wrapper method for Depth first Traversal which calls the actual algorithm on each node of a given graph.
	public static ArrayList<Character> dFS(Graph g) {
		
		ArrayList<Character> path = new ArrayList<Character>();
		System.out.println("*******DFS******");
		for(GraphNode n:g.vertices) {
			depthFirstTraversal(n, path);
		}		
		System.out.println("*************");
		return path;
		
	}
	
public static ArrayList<Character> dFSPostOrder(Graph g) {
		
		ArrayList<Character> path = new ArrayList<Character>();
		System.out.println("*******DFS PostOrder******");
		for(GraphNode n:g.vertices) {
			depthFirstTraversalPostOrder(n, path);
		}		
		System.out.println("*************");
		return path;
		
	}
	
/*  Depth First Traversal with pre order on a given graph node that returns the path of the nodes traversed as a ArrayList of Characters.
 *   It a recursive algorithm
 * 
 */
	private static void depthFirstTraversal(GraphNode node, ArrayList<Character> path){
		
		if(node==null) return;
		
		if(!node.visited) {
		path.add(node.data);
		System.out.println(node.data);
		}
		
		node.visited=true;
		
		for(GraphNode n : node.adjacent) {
			
			if(!n.visited) {
				depthFirstTraversal(n,path);
			}
		}		
		
	}

	/*  Depth First Traversal with post order on a given graph node that returns the path of the nodes traversed as a ArrayList of Characters.
	 *   It a recursive algorithm
	 * 
	 */
private static void depthFirstTraversalPostOrder(GraphNode node, ArrayList<Character> path){
		
		if(node==null) return;		
		
		for(GraphNode n : node.adjacent) {
			
			if(!n.visited) {
				depthFirstTraversal(n,path);
			}
		}	
		if(!node.visited) {
			path.add(node.data);
			System.out.println(node.data);
			}
		node.visited=true;
		
	}


//wrapper method for Breadth first Traversal which calls the actual algorithm on a given graphnode.
public static ArrayList<Character> bFS(GraphNode node) {
	
	ArrayList<Character> path = new ArrayList<Character>();
	System.out.println("******BFS*******");
	breadthFirstTraversal(node, path);
	System.out.println("*************");
	
	return path;
	
}

//wrapper method for Breadth first Traversal which calls the actual algorithm on each node of a given graph.
public static ArrayList<Character> bFS(Graph g) {
	
	ArrayList<Character> path = new ArrayList<Character>();
	System.out.println("*******BFS******");
	for(GraphNode n:g.vertices) {
		breadthFirstTraversal(n, path);
	}		
	System.out.println("*************");
	return path;
	
}


/*  Breadth First Traversal on a given Node of the graph.
 *  Its a iterative algorithm that uses a queue to to track the list of nodes to be processed.
 *  It not a recursive algorithm
 *  Time Complexity : O(n)  
 */
private static void breadthFirstTraversal(GraphNode s,ArrayList<Character> path){
	if(s==null) return;
	Queue<GraphNode> q = new LinkedList<GraphNode>();
	
	q.add(s);
	
	while(!q.isEmpty()) {
		GraphNode v = q.remove();
		if(!v.visited) {
			path.add(v.data);
			System.out.println(v.data);
		}
		v.visited = true;
		for(GraphNode n : v.adjacent) {
			if(!n.visited) q.add(n);
		}
		
	}
	
	
	
}


}

package com.sstummala.codingproblems.graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	ArrayList<GraphNode> vertices;
	
	public GraphNode get(char c) {
		GraphNode g1 = null;
		for(GraphNode gn : vertices) {
			if(gn.data==c) g1 =gn;
		}
		return g1;
	}
	
	
	public Graph(char[] members, boolean[][] adjmatrix) {
		vertices = new ArrayList<GraphNode>();
		for(char v:members) {
			GraphNode n = new GraphNode(v);
			this.vertices.add(n);
		}
		
		for(int i=0;i<adjmatrix.length;i++) {			
			for(int j=0;j<adjmatrix[i].length;j++) {
				if (adjmatrix[i][j]) {
					vertices.get(i).adjacent.add(vertices.get(j));
				}
			}
		}
	}
	
	public Graph(char[] members, ArrayList<char []> clist) {
		
		vertices = new ArrayList<GraphNode>();
		for(char v:members) {
			GraphNode n = new GraphNode(v);
			this.vertices.add(n);
		}
		
		for(char[]  c  : clist) {
			char parent = c[1];
			char child = c[0];
			get(parent).adjacent.add(get(child));			
			
		}
		
	}

}

class GraphNode{
	char data;
	List<GraphNode> adjacent ;
	boolean visited;
	
	public GraphNode(char n) {
		this.data = n;
		adjacent = new ArrayList<GraphNode>();
	}
}

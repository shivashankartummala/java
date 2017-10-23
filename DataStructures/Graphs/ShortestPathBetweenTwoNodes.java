package com.sstummala.codingproblems.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathBetweenTwoNodes {
	public static void main(String[] args){
		Node graph = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		
		four.next.add(three);
		four.next.add(graph);		
		five.next.add(four);
		two.next.add(five);		
		graph.next.add(two);
		graph.next.add(three);
		
		/*          1 --------> 2
		 *          ^ \         |
		 *          |  \        |
		 *          |   V       |
		 *          |   3       |
		 *          |   ^       |
		 *          |  /        |
		 *          | /         V
		 *          4 <-------- 5
		 * 
		 * 
		 * 
		 * 
		 */
		
		List<Node> path = getShortestPathBetween(two,three);
	}
	
	public static List<Node> getShortestPathBetween(Node a, Node b){
		if(a==null || b==null) return null;
		
		Queue<Node> toVisit = new LinkedList<Node>();
		HashMap<Node, Node> parents = new HashMap<Node, Node>();
		
		toVisit.add(a);
		parents.put(a, null);
		while(!toVisit.isEmpty()){
			Node cur = toVisit.poll();
			if(b == cur) break;
			for(Node n : cur.getNext()){
				toVisit.add(n);
				parents.put(n,cur);
			}
		}
		
		if(parents.get(b)==null) return null;
		List<Node> out = new LinkedList<Node>();
		Node cur = b;
		while(cur!=null){
			out.add(0,cur);
			System.out.println(cur.data);
			cur = parents.get(cur);			
			
		}
		return out;
	}

}

class Node{
	int data;
	List<Node> next;
	public List<Node> getNext(){
		return this.next;
	}
	
	public Node(int val){
		this.data = val;
		this.next = new ArrayList<Node>();
	}
}

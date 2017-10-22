import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
*  Reference :  https://www.youtube.com/watch?v=0XgVhsMOcQM&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=23
*  Reference : https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach/problem
*/

public class Solution {
    public static class Graph {
        List<List<Integer>> adjlist ;
        int size;
        int DISTANCE = 6;
        
        public Graph(int size) {
            adjlist = new ArrayList<>();
            this.size=size;
            while(size-- >0){
                adjlist.add(new ArrayList<Integer>());
            }            
        }

        public void addEdge(int first, int second) {
            adjlist.get(first).add(second);
            adjlist.get(second).add(first); // For undirected graph, you gotta add edges from both sides.
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            int[] distances = new int[size];
            Arrays.fill(distances,-1);
            Queue<Integer> que = new LinkedList<Integer>();
            distances[startId] = 0;
            
            que.add(startId);
            while(!que.isEmpty()){
                Integer cur = que.poll();
                for(int neighbour: adjlist.get(cur)){
                    if(distances[neighbour]==-1){
                        distances[neighbour] = distances[cur] + DISTANCE;
                        que.add(neighbour);
                    }
                    
                }
                
            }
            
            return distances;
        }
    }
    
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}

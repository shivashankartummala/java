import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
* Reference : https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid
* Reference : https://www.youtube.com/watch?v=R4Nh-EgWjyQ&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=24
*/

public class Solution {
    
    
    public static int getBiggestRegion(int[][] matrix) {
        int maxregion = 0;
        
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[1].length;col++){
                int region = dfs(matrix, row,col) ; 
                maxregion = Math.max(maxregion, region);
            }
        }
             
       return maxregion; 
    }
    
    public static int dfs(int[][] matrix,int r, int c){
        if(r<0 || c<0 || r>=matrix.length || c>=matrix[r].length) return 0;
        if (matrix[r][c]==0) return 0;
        matrix[r][c]=0;
        int size = 1;
        for(int i=r-1;i<=r+1;i++){
              for(int j=c-1;j<=c+1;j++){      
                      if(i!=r || j!=c)
                        size += dfs(matrix,i,j);                    
                }
            } 
        return size;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}

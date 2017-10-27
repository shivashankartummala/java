package com.sstummala.codingproblems.dp;

public class LargestSqaureMatrixOfTrue {
	
	public static void main(String args[]){
		boolean[][] input = new boolean[5][5];
		input[0] = new boolean[] {true,false,true,false,true};
		input[1] = new boolean[] {true,false,true,true,true};
		input[2] = new boolean[] {true,false,true,true,true};
		input[3] = new boolean[] {true,false,true,true,true};
		input[4] = new boolean[] {true,false,true,false,true};
		
		System.out.println("length of square matrix: " + squareSubmatrix(input));		
		
	}

	
	// Bottom up solution. Start from the upper left corner and compute each larger submatrix
	public static int squareSubmatrix(boolean[][] arr) {
		int max = 0;		
		int[][] cache = new int[arr.length][arr[0].length]; // Initialize cache
		// Iterate over matrix to compute each value
		for (int i = 0; i < cache.length; i++) {
			for (int j = 0; j < cache[0].length; j++) {
				// If we’re in the first row/column then the value is just 1 if that cell is
				// true and 0 otherwise. In other rows and columns need to look up and to the left
				if (i == 0 || j == 0) {
					cache[i][j] = arr[i][j] ? 1 : 0;
				} else if (arr[i][j]) {
					cache[i][j] =
							Math.min(Math.min(cache[i][j-1],cache[i-1][j]),
									cache[i-1][j-1]) + 1;
				}
				if (cache[i][j] > max) max = cache[i][j];
				System.out.print(cache[i][j] + " ");
			}
			System.out.println();
		}
		return max;
	}
}

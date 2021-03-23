package com.sumit;

public class Solution {
	
	public int maximalSquare(char [][] matrix) {
		
		int rows = matrix.length;
		int col = matrix[0].length;
		
		int maxLength =0;
		
		int dp[][] = new int[rows][col];
		
		//filling first row
		for(int i=0;i<col;i++) 
		{
			if(matrix[0][i]=='1') {
				dp[0][i]='1';
				maxLength = Math.max(maxLength, dp[0][i]);
			} 
			else 
			{
				dp[0][i]='0';
				maxLength = Math.max(maxLength, dp[0][i]);
			}
			
		}
		
		//filling first column
		for(int i=0;i<rows;i++) 
		{
			if(matrix[i][0]=='1') {
				dp[i][0]='1';
				maxLength = Math.max(maxLength, dp[i][0]);
				
			} 
			else 
			{
				dp[i][0]='0';
				maxLength = Math.max(maxLength, dp[i][0]);
			}
			
		}
		
		//filling rest cells of dp matrix.
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				dp[i][j] = 1 +Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]);
				maxLength = Math.max(maxLength, dp[i][j]);
			}
		}
		
		return maxLength*maxLength;
		
	}

}

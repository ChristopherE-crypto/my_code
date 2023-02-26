package week1;

import java.util.ArrayList;
import java.util.List;

public class Array2D {
	
	public static int hourglassSum(List<List<Integer>> arr) {
		
		int maxSum = Integer.MIN_VALUE;
		
		int sum = 0;
		
		for(int i = 1; i < 5; i++) {
			
			//int sum = 0;
			
			for(int j = 1; j < 5; j++) {
				
				sum = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j) + arr.get(i - 1).get(j + 1) + arr.get(i).get(j) + arr.get(i + 1).get(j - 1) + arr.get(i + 1).get(j) + arr.get(i + 1).get(j + 1);
				
				if(sum > maxSum) {
					
					maxSum = sum;
				}
			}
		}
		
		return maxSum;
	}
	
	public static int hourglassSum(int [][] arr) {
		
		
		  int maxSum = Integer.MIN_VALUE;
		  
		  int sum = 0;
		  
		  for(int i = 1; i < 5; i++) {
		  
		  for(int j = 1; j < 5; j++) {
		  
		  sum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] +
		  arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
		  
		  if(sum > maxSum) {
		  
		  maxSum = sum; }
		  
		  } }
		 
		  return maxSum;

	}
	
	public static void main(String [] args) {
		
		int [] [] ar = {{1, 1, 1, 0, 0, 0},
						{0, 1, 0, 0, 0, 0},
						{1, 1, 1, 0, 0, 0},
						{0, 0, 2, 4, 4, 0},
						{0, 0, 0, 2, 0, 0},
						{0, 0, 1, 2, 4, 0}};
		
		System.out.println(hourglassSum(ar));
		
		
		
	}

}

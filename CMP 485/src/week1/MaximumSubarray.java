package week1;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {
	
	public static List<Integer> maxSubarray(List<Integer> arr){
		
		if(arr.size() == 1) {
			
			ArrayList<Integer> sums = new ArrayList<Integer>();
			
			sums.add(arr.get(0));
			sums.add(arr.get(0));
			
			return sums;
			
			
		}
		
		int subarraySum = 0;
		
		int subsequenceSum = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			
			if(arr.get(i) > 0) {
				
				subsequenceSum += arr.get(i);
			}
		}
		
		if(subsequenceSum == 0) {
			
			subsequenceSum = -1;
		}
		
		int lastMax = Integer.MIN_VALUE, max = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			
			max = max + arr.get(i);
			
			if(lastMax < max) {
				
				lastMax = max;
			}
			
			if(max < 0) {
				
				max = 0;
			}
		}
		
		subarraySum = lastMax;
		
		
		
		ArrayList<Integer> sums = new ArrayList<Integer>();
		
		sums.add(subarraySum);
		sums.add(subsequenceSum);
		
		return sums;
		
	}
	
	public static void main(String [] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//int [] ar = {-1, 2, 3, -4, 5, 10};
		
		//int [] ar = {1, 2, 3, 4};
		
		//int [] ar = {2, -1, 2, 3, 4, -5};
		
		int [] ar = {-2, -3, -1, -4, -6};
		
		for(int i = 0; i < ar.length; i++) {
			
			arr.add(ar[i]);
		}
		
		System.out.println(maxSubarray(arr).toString());
		
		
		
	}

}

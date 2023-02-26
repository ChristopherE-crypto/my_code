package week1;

import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {
	
	public static int sockMerchant(int n, List<Integer> ar) {
		
		ArrayList<Integer> checked = new ArrayList<Integer>();

		int numPairs = 0;

		for(int i = 0; i < n; i++){

			if(!checked.contains(ar.get(i))){

				checked.add(ar.get(i));
			}
			else {
				
				continue;
			}
		}

		for(int i = 0; i < checked.size(); i++){

			int counter = 0;

			for(int j = 0; j < n; j++){

				if(checked.get(i) == ar.get(j)){

					counter++;
					
				}

			}
			
			if(counter >= 2) {
					
				numPairs += counter / 2;
			}
		}

		return numPairs;
	}
	
	public static void main(String [] args) {
		
		//int [] arr = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}; // Answer = 4
		
		//int [] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20}; //  Answer = 3
		
		//int [] arr = {1, 1, 1, 2, 2, 1}; // Answer = 3
		
		//int [] arr = {1, 2, 3, 4, 5, 6}; // Answer = 0
		
		//int [] arr = {1, 2, 3, 4, 5, 6, 1}; // Answer = 1
		
		//int [] arr = {1, 1}; // Answer = 1
		
		//int [] arr = {1, 2, 1, 2, 3, 4, 3, 4}; //Answer = 4
		
		//int [] arr = {1, 1, 1, 1, 1, 1}; // Answer = 3
		
		int [] arr = {1, 1, 1}; // Answer = 1
		
		
		
		int n = arr.length;
		
		ArrayList <Integer> ar = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			
			ar.add(arr[i]);
		}
		
		
		
		System.out.println(sockMerchant(n, ar));
		
		
	}

}

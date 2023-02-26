package week5;

public class Subsets {
	
	public static void allSubsets(int [] arr) {
		
		int [] subset = new int [arr.length];
		
		helper(arr, subset, 0);
	}
	
	public static void helper(int [] arr, int [] subset, int i) {
		
		if(i == arr.length) {
			
			for(int j = 0; j < subset.length; j++) {
				
				System.out.print("{" + subset[j] + "}" + ",");
			}
			
			System.out.println();
		}
		else {
			
			subset[i] = 0;
			
			helper(arr, subset, i + 1);
			
			subset[i] = arr[i];
			
			helper(arr, subset, i + 1);
		}
	}
	
	public static void main(String [] args) {
		
		int [] arr = {1, 2, 3};
		
		allSubsets(arr);
	}

}

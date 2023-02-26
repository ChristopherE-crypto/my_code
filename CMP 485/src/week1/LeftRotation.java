package week1;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	
	public static List<Integer> rotateLeft2(int d, List<Integer> arr){
		
		ArrayList<Integer> copy = new ArrayList<Integer>();
		
		for(int i = 0; i < d; i++) {
			
			copy.add(arr.get(i));
		}
		
		for(int i = d; i < arr.size(); i++) {
			
			arr.set(i - d, arr.get(i));
		}
		
		for(int i = 0; i < copy.size(); i++) {
			
			arr.set(arr.size() - d, copy.get(i));
			
			d--;
		}
		
		return arr;
	}
	
	public static void main(String [] args) {
		
		int [] ar = {11, 22, 33, 44, 55, 66};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		List<Integer> list;
		
		for(int i = 0; i < ar.length; i++) {
			
			arr.add(ar[i]);
		}
		
		//list = rotateLeft(2, arr);
		
		list = rotateLeft2(2, arr);
		
		System.out.println(list.toString());
	}

}

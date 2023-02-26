package week1;

public class HighestValuePalindrome {
	
	public static String highestValuePalindrome(String s, int n, int k) {
		
		String palindrome = "";
		
		if(n == 0) {
			
			return "-1";
		}
		 
		char [] nums = s.toCharArray();
		
		if(k == 0) {
			
			return "-1";
		}
		
		if(k >= n) {
			
			String str = "";
			
			for(int i = 0; i < n; i++) {
				
				str += '9';
			}
			
			return str;
		}
		
		int i = 0;
		
		int j = n - 1;
		
		while(i <= j && !isValid(nums, n)) {
			
			if(Character.valueOf(nums[i]) > Character.valueOf(nums[j]) && k >= 1) {
				
				nums[j] = nums[i];
				
				k--;
			}
			
			if(Character.valueOf(nums[i]) < Character.valueOf(nums[j]) && k >= 1) {
				
				nums[i] = nums[j];
				
				k--;
			}
			
			i++;
			
			j--;
		}
		
		if(!isValid(nums, n) && k < 2) {
			
			return "-1";
		}
		
		i = 0;
		
		j = n - 1;
		
		while(k > 0 && i <= j) {
			
			if(nums[i] == findL(nums, n)) {
				
				nums[i] = '9';
				
				nums[j] = '9';
			}
			
			nums[i] = '9';
			
			nums[j] = '9';
			
			k--;
			
			i++;
			
			j--;
		}
		
		
		
		for(int x = 0; x < n; x++) {
			
			palindrome += nums[x];
		}
		
		
		
		
		return palindrome;
	
	}
	
	public static int findL(char [] nums, int n) {
		
		int low = Character.valueOf(nums[0]);
		
		for(int i = 0; i < n; i++) {
			
			if(Character.valueOf(nums[i]) < low) {
				
				low = nums[i];
			}
		}
		
		return low;
	}
	
	public static boolean isValid(char [] nums, int n) {
		
		String s = "";
		
		String inverse = "";
		
		for(int i = 0; i < n; i++) {
			
			s += nums[i];
		}
		
		for(int i = n - 1; i >= 0; i--) {
			
			inverse += nums[i];
		}
		
		if(s.equals(inverse)) {
			
			return true;
		}
		
		return false;
	}
	
	public static void main(String [] args) {
		
		String s = "542379";
		
		int n = s.length();
		
		int k = 5;
		
		System.out.println(highestValuePalindrome(s, n, k));
		
		
	}

}

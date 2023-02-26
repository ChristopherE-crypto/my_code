package week1;

public class HackerrankString {
	
	public static String hackerrankInString(String s) {
		
		String str = "hackerrank";
		
		if(s.length() < str.length()) {
			
			return "NO";
		}
		
		int count = 0;
		
		int i = 0;
		
		int j = 0;
		
		while(i < str.length() && j < s.length()) {
			
			if(str.charAt(i) == s.charAt(j)) {
				
				count++;
				
				i++;
				
			}
				
			j++;
			
		}
		
		if(count == str.length()) {
			
			return "YES";
		}
		else {
			
			return "NO";
		}
		
	}
	
	public static void main(String [] args) {
		
		String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
		
		System.out.println(hackerrankInString(s));
		
		
	}

}

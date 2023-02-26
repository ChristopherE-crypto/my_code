package week1;

public class CamelCase {
	
	public static int camelcase(String s) {
		
		int numWords = 1;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(Character.isUpperCase(s.charAt(i))) {
				
				numWords++;
			}
		}
		
		return numWords;
	}
	
	public static void main(String [] args) {
		
		String s = "saveChangesInTheEditor";
		
		System.out.println(camelcase(s));
	}

}

package week1;

public class CaesarCipher {
	
	public static String caesarCipher(String s, int k) {
		
		char [] alphabet = {'a', 'b', 'c' ,'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char [] alphabetB = {'A', 'B', 'C' ,'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		String newStr = "";
		
		if(k == 0) {
			
			return s;
		}
		
		for(int i = 0; i < s.length(); i++) {
			
			for(int j = 0; j < alphabet.length; j++) {
				
				if(s.charAt(i) == alphabet[j]) {
					
					int index = j + k;
					
					if(index >= alphabet.length) {
						
						index = index % alphabet.length;
					}
					newStr += alphabet[index];
				}
				
				if(s.charAt(i) == alphabetB[j]) {
					
					int index = j + k;
					
					if(index >= alphabet.length) {
						
						index = index % alphabet.length;
					}
					newStr += alphabetB[index];
				}
			}
			
			if(!Character.isLetter(s.charAt(i))){
				
				newStr += s.charAt(i);
			}
		}
		
		return newStr;
	}
	
	public static void main(String [] args) {
		
		String s = "middle-Outz";
		
		String newStr = caesarCipher(s, 2);
		
		System.out.println(newStr);
		
		char [] letters = Character.toChars('c' + 2);
		
		for(int i = 0; i < letters.length; i++) {
			
			System.out.println(letters[i]);
		}
		
		
	}

}

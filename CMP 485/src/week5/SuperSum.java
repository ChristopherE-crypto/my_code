package week5;

public class SuperSum {
	
	public static int superDigit(String n, int k) {
		
		int sum = getSuperSum(n);
		
		return getSuperSum(sum * k + "");
		
	}
	
	public static int getSuperSum(String n) {
		
		if(n.length() == 1) {
			
			return Integer.parseInt(n);
		}
		
		int sum = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			sum += Integer.valueOf(n.charAt(i) + "");
		}
		
		return getSuperSum(sum + "");
		
	}
	
	public static void main(String [] args) {
		
		String n = "1235823473284735732045327423984723487234732847239535037247";
		
		int k = 100;
		
		System.out.println(superDigit(n, k));
	}

}

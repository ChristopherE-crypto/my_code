package week5;

public class FactorialDigitSum {
	
	public static void factorialDigitSum(int N) {
		
		
	}
	
	public static int getFactorial(int N) {
		
		if(N >= 1) {
			
			return N * getFactorial(N - 1);
		}
		else {
			
			return 1;
		}
	}
	
	public static void main(String [] args) {
		
		System.out.println(getFactorial(25));
	}

}

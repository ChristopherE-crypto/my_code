package week6;

public class Fibonacci25 {
	
	public static int getFibonacciSum(int n) {
		
		if(n == 0) {
			
			return 0;
		}
		
		if(n == 1) {
			
			return 1;
		}
		
		int sum = 0;
		
		sum += getFibonacciSum(n - 1) + getFibonacciSum(n - 2);
		
		return sum;
	}
	
	public static void main(String [] args) {
		
		int n = 10;
		
		System.out.println(getFibonacciSum(n));
		
		
	}

}

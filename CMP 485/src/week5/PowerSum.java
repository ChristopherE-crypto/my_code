package week5;

public class PowerSum {
	
	public static int powerSum(int X, int N) {
		
		if(X != 0) {
			
			int i = 1;
			
			while(Math.pow(i, N) <= X) {
				
				i++;
			}
				
			int count = 1;
			
			count += powerSum(X - (int)Math.pow(i - 1, N), N);
			
			return count;
		}
		else {
			
			return 1;
		}
		
		
			
		
	}
	
	public static void main(String [] args) {
		
		int X = 10;
		
		int N = 2;
		
		System.out.println(powerSum(X, N));
	}

}

package week5;

public class ReduceToOne {
	
	public static void reduceToOne(int N) {
		
		int count = 0;
		
		while(N != 1) {
			
			if(N % 2 == 0) {
				
				N = N / 2;
				
				count++;
			}
			else {
				
				N -= 1;
				//N += 1;
				
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String [] args) {
		
		reduceToOne(1000000);
		
		
	}

}

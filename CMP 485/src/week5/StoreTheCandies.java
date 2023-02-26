package week5;

public class StoreTheCandies {
	
	public static int candyStorer(int numCandy, int jarCapacity) {
		
		if(numCandy <= jarCapacity) {
			
			return 1;
		}
		
		int mid = numCandy / 2;
		
		int numJars = 0;
		
		numJars += candyStorer(mid, jarCapacity);
		
		numJars += candyStorer(numCandy - mid, jarCapacity);
		
		return numJars;
		
		
		
		
	}
	
	public static void main(String [] args) {
		
		System.out.println(candyStorer(11, 3));
	}

}

import java.util.Arrays;

public class Homework7_1 {
	
	public static void main(String [] args) {
		//System.out.println(fib(2));
		//System.out.println(getPowerOfXtoN(-2, 3));
		
		//String [] arr = {"Andres", "Carlos", "Jose", "Mary"};
		//System.out.println(binarySearch("Andres", arr));
		
		//System.out.println(organizeParade(5));
		
		System.out.println(numJarsNeeded(10, 2));
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			return (fib(n - 1) + fib(n - 2));
		}
	}
	
	public static int getPowerOfXtoN(int xBase, int nExp) {
		if(nExp == 0) {
			return 1;
		}
		if(nExp == 1) {
			return xBase;
		}
		else {
			return xBase = xBase * getPowerOfXtoN(xBase, nExp - 1);
		}
	}
	
	public static int binarySearch(String target, String [] words) {
		return binarySearch(target, words, 0, words.length - 1);
	}
	
	public static int binarySearch(String target, String [] words, int start, int end) {
		
		Arrays.sort(words);
		
		if(start > end) {
			return -1;
		}
		else {
			int midpoint = (start + end) / 2;
			if(target == words[midpoint]) {
				return midpoint;
			}
			else if(target.charAt(0) > words[midpoint].charAt(0)) {
				return binarySearch(target, words, midpoint + 1, end);
			}
			else {
				return binarySearch(target, words, start, midpoint - 1);
			}
		}
	}
	
	public static int organizeParade(int paradeLength) {
		
		if(paradeLength == 1) {
			return 2;
		}
		else if(paradeLength == 2) {
			return 3;
		}
		else {
			return paradeLength = organizeParade(paradeLength - 1) + organizeParade(paradeLength - 2);
		}
	}
	
	public static int numJarsNeeded(int candyCount, int jarCapacity) {
		if(candyCount == 0) {
			return 0;
		}
		
		else if(candyCount <= jarCapacity) {
			return 1;
		}
		
		else {
			return numJarsNeeded(candyCount / 2, jarCapacity) + numJarsNeeded(candyCount / 2, jarCapacity) + numJarsNeeded(candyCount % 2, jarCapacity);
		}
	}

}


public class Airplane {
	
	private Passenger [] passengers;
	private String airplaneName;
	private int numPassengers;
	
	public Airplane() {
		airplaneName = "";
		passengers = new Passenger [100];
		numPassengers = 0;
	}
	
	public Airplane(String name) {
		airplaneName = name;
		passengers = new Passenger[100];
		numPassengers = 0;
	}
	
	public Airplane(int maxPassengers) {
		airplaneName = "";
		if(maxPassengers < 0) {
			passengers = new Passenger[0];
		}
		else {
			passengers = new Passenger[maxPassengers];
		}
	}
	
	public Airplane(String name, int maxPassengers) {
		airplaneName = name;
		if(maxPassengers < 0) {
			passengers = new Passenger[0];
		}
		else {
			passengers = new Passenger[maxPassengers];
		}
	}
	
	private void resizePassengerArray() {
		Passenger [] big = new Passenger [passengers.length * 2];
		
		for(int i = 0; i < numPassengers; i++) {
			big[i] = passengers[i];
		}
		
		passengers = big;
	}
	
	public void addPassenger(Passenger p) {//FIX ME: Add check for null array or null Passenger object.
		if(numPassengers < passengers.length) {
			passengers[numPassengers] = p;
			numPassengers++;
		}
		else {
			resizePassengerArray();
			passengers[numPassengers] = p;
			numPassengers++;
		}
	}
	
	public String getAirplaneName() {
		return airplaneName;
	}
	
	public Passenger getPassenger(int index) {
		if(index >= 0) {
			return passengers[index];
		}
		else {
			return null;
		}
	}
	
	public int getNumPassengers() {
		return numPassengers;
	}
	
	public Passenger getFirstPassenger() {
		return passengers[0];
	}
	
	public Passenger getLastPassenger() {
		return passengers[numPassengers - 1];
	}
	
	public Passenger [] getPassengers() {
		return passengers;
	}
	
	public void setAirplaneName(String name) {
		airplaneName = name;
	}
	
	public void printAllDetails() {
		System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n", airplaneName, getNumPassengers(), passengers.length);
		for(int i = 0; i < numPassengers; i++) {
			System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn: %2d\n", passengers[i].getName(), passengers[i].getBirthYear(), passengers[i].getWeight(), passengers[i].getGender(), passengers[i].getNumCarryOn());
		}
	}
	
//	public Passenger removePassenger(int index) {
//		if(index >= 0 && index < numPassengers) {
//			
//			Passenger [] copy = new Passenger[passengers.length - 1];
//			
//			Passenger removed = passengers[index];
//			numPassengers--;
//			
//			for(int i = 0, j = 0; i < passengers.length; i++) {
//				if(i == index) {
//					continue;
//				}
//				
//				copy[j++] = passengers[i];
//			}
//			
//			passengers = copy;
//			return removed;
//		}
//		else {
//			return null;
//		}
//	}
	
	public Passenger removePassenger(int index) {
		
		if(index >= 0 && index < numPassengers) {
		
		Passenger removed = passengers[index];
		for(int i = 0; i < numPassengers; i++) {
			if(i == index) {
				for(int j = i; j < numPassengers - 1; j++) {
					passengers[j] = passengers[j + 1];
					
				}
				passengers[--numPassengers] = null;
				return removed;
				}
			}
		}
		return null;
	}
	
	public void removeAllPassengers() {
		passengers = new Passenger[passengers.length];
	}
	
	public double getTotalWeightOfAllPassengers() {
		double total = 0;
		for(int i = 0; i < numPassengers; i++) {
			total += passengers[i].getWeight();
		}
		return total;
	}
	
	public double getAverageWeightOfAllPassengers() {
		double avg = getTotalWeightOfAllPassengers() / (double) numPassengers;
		
		return avg;
	}
	
	public int getNumberOfPassengersAboveWeight(double weight) {
		int counter = 0;
		for(int i = 0; i < numPassengers; i++) {
			if(passengers[i].getWeight() > weight) {
				counter++;
			}
		}
		return counter;
	}
	
	public int getNumberOfPassengersBelowWeight(double weight) {
		int counter = 0;
		for(int i = 0; i < numPassengers; i++) {
			if(passengers[i].getWeight() < weight) {
				counter++;
			}
		}
		return counter;
	}
	
	public void increaseWeightOfAllPassengers() {
		for(int i = 0; i < numPassengers; i++) {
			passengers[i].gainWeight();
		}
	}
	
	public void increaseWeightOfAllPassengers(double weight) {
		for(int i = 0; i < numPassengers; i++) {
			passengers[i].gainWeight(weight);
		}
	}
	

}

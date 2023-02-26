
public abstract class Passenger implements Eater{//Aparently everything is correct according to ZyBooks.
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	private double height;
	
	private int caloriesConsumed = 0;
	private int caloriesAccumulator = 0;
	
	public int getCaloriesConsumed() {
		return caloriesConsumed;
	}
	
	public void addCaloriesAccumulator(int caloriesAccumulator) {
		this.caloriesAccumulator += caloriesAccumulator;
	}
	
	public void addCaloriesConsumed(int caloriesConsumed) {
		this.caloriesConsumed += caloriesConsumed;
	}
	
	public void setCaloriesConsumed(int caloriesConsumed) {
		this.caloriesConsumed = caloriesConsumed;
	}
	
	public int getCaloriesAccumulator() {
		return caloriesAccumulator;
	}
	
	public void setCaloriesAccumulator(int caloriesAccumulator) {
		this.caloriesAccumulator = caloriesAccumulator;
	}
	
	public abstract double metabolizeAccumulatedCalories();
	
	public Passenger() {//Default Constructor
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
		numCarryOn = 0;
	}
	
	public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		this.name = name;
		this.birthYear = birthYear;
		
		if(weight < 0) {
			this.weight = -1;
		}
		else {
			this.weight = weight;
		}
		
		if(height < 0) {
			this.height = -1;
		}
		else {
			this.height = height;
		}
		
		if(gender == 'm' || gender == 'f') {
			this.gender = gender;
		}
		else {
			this.gender = 'u';
		}
		
		if(numCarryOn < 0) {
			this.numCarryOn = 0;
		}
		else if(numCarryOn > 2) {
			this.numCarryOn = 2;
		}
		else {
			this.numCarryOn = numCarryOn;
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if(height < 0) {
			this.height = -1;
		}
		else {
			this.height = height;
		}
	}
	
	public double calculateBMI() {
		double bmi = (weight * 703) / (Math.pow(height, 2));
		return bmi;
	}
	
	@Override
	public String toString() {
		String s = String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n", name, birthYear, weight, height, gender, numCarryOn);
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		if(obj instanceof Passenger) {
			Passenger otherPass = (Passenger) obj;
			if(name.equals(otherPass.name)) {
				if(birthYear == otherPass.birthYear) {
					if(gender == otherPass.gender) {
						if(Math.abs(weight - otherPass.weight) < 0.5) {
							if(Math.abs(height - otherPass.height) < 0.5) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {//Constructor
		this.name = name;
		this.birthYear = birthYear;
		
		if(weight < 0) {
			this.weight = -1;
		}
		else {
			this.weight = weight;
		}
		
		if(gender == 'm' || gender == 'f') {
			this.gender = gender;
		}
		else {
			this.gender = 'u';
		}
		
		if(numCarryOn < 0) {
			this.numCarryOn = 0;
		}
		else if(numCarryOn > 2) {
			this.numCarryOn = 2;
		}
		else {
			this.numCarryOn = numCarryOn;
		}
		
	}
	
	public int calculateAge(int currentYear) {
		if(currentYear < birthYear || currentYear <= 0) {
			return -1;
		}
		else {
			int age = currentYear - birthYear;
			return age;
		}
	}
	
	public void gainWeight() {
		weight++;
	}
	
	public void gainWeight(double inc) {
		if(inc >= 0) {
			this.weight = this.weight + inc;
		}
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getNumCarryOn() {
		return numCarryOn;
	}
	
	public boolean isFemale() {
		if(gender == 'f') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isMale() {
		if(gender == 'm') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void loseWeight() {
		if(weight >= 1) {
			weight--;
		}
	}
	
	public void loseWeight(double dec) {
		if(dec <= weight) {
			weight = weight - dec;
		}
	}
	
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n", getName(), getBirthYear(), getWeight(), getHeight(), getGender(), getNumCarryOn());
	}
	
	public void setGender(char g) {
		if(g == 'm' || g == 'f') {
			this.gender = g;
		}
		else {
			this.gender = 'u';
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setWeight(double weight) {
		if(weight < 0) {
			this.weight = -1;
		}
		else {
			this.weight = weight;
		}
	}
	
	public void setNumCarryOn(int numCarryOn) {
		if(numCarryOn < 0) {
			this.numCarryOn = 0;
		}
		else if(numCarryOn > 2) {
			this.numCarryOn = 2;
		}
		else {
			this.numCarryOn = numCarryOn;
		}
	}
	
	

}

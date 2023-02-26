
public class Infant extends Person implements Mover{
	
	public class InfantToy{
		private String infantToyName;
		private int infantToyRating;
		
		public InfantToy(String infantToyName, int infantToyRating) {
			this.infantToyName = infantToyName;
			this.infantToyRating = infantToyRating;
			
		}
		
		@Override
		public String toString() {
			String s = "";
			
			for(int i = 0; i < numInfantToys; i++) {
				s += String.format("InfantToy: Toy Name: %20s | Rating %4d\n", toys[i].infantToyName, toys[i].infantToyRating);
			}
			return s;
		}
	}
	
	private InfantToy [] toys;
	private int numInfantToys;
	
	public Infant() {
		toys = new InfantToy [10];
		numInfantToys = 0;
	}
	
	public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		super(name, birthYear, weight, height, gender, numCarryOn, 0);
		toys = new InfantToy [10];
		numInfantToys = 0;
		
	}
	
	public void addInfantToy(String infantToyName, int infantToyRating) {
		if(numInfantToys < 10) {
			InfantToy t = new InfantToy(infantToyName, infantToyRating);
			toys[numInfantToys] = t;
			numInfantToys++;
		}
		else {
			System.out.println("toys has reached capacity of 10");
		}
	}
	
	public String getInfantToyAsString(int index) {
		if(index >= 0 && index < numInfantToys) {
			String s = String.format("InfantToy: Toy Name: %20s | Rating %4d\n", toys[index].infantToyName, toys[index].infantToyRating);
			return s;
		}
		else {
			return "invalid index " + index;
		}
		
	}
	
	public int getNumInfantToys() {
		return numInfantToys;
	}
	
	public String getInfantToyName(int index) {
		if(index >= 0 && index < numInfantToys) {
			return toys[index].infantToyName;
		}
		else {
			return "invalid index " + index;
		}
	}
	
	public int getInfantToyRating(int index) {
		if(index >= 0 && index < numInfantToys) {
			return toys[index].infantToyRating; 
		}
		else {
			return -1;
		}
	}
	
	public int getHighestInfantToyRating() {
		int max = 0;
		for(int i = 0; i < numInfantToys; i++) {
			if(toys[i].infantToyRating > max) {
				max = toys[i].infantToyRating;
			}
		}
		return max; 
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n", numInfantToys);
		for(int i = 0; i < numInfantToys; i++) {
			System.out.printf("InfantToy: Toy Name: %20s | Rating %4d\n", toys[i].infantToyName, toys[i].infantToyRating);
		}
	}
	
	@Override
	public String toString() {
		String s = super.toString() + "";
		for(int i = 0; i < numInfantToys; i++) {
			s += String.format("InfantToy: Toy Name: %20s | Rating %4d\n", toys[i].infantToyName, toys[i].infantToyRating);
		}
		return s;
	}

	@Override
	public void eat(Food food) {
		addCaloriesConsumed(food.getCalories());
		addCaloriesAccumulator(food.getCalories());
		
	}

	@Override
	public void eat(Food[] foods) {
		int calories = 0;
		
		for(int i = 0; i < foods.length; i++) {
			calories += foods[i].getCalories();
		
		}
		
		addCaloriesConsumed(calories);
		addCaloriesAccumulator(calories);
		
	}

	@Override
	public double metabolizeAccumulatedCalories() {
		double totalWeight = 0;
		double caloriesLeft = getCaloriesAccumulator();
		
			caloriesLeft = caloriesLeft / 1200.0;
			gainWeight(caloriesLeft);
			//caloriesLeft -= 1200.0;
			//setCaloriesAccumulator(caloriesLeft);
			totalWeight += caloriesLeft;
			
		
		
		setCaloriesAccumulator(0);
		
		
		return totalWeight;
	}

	@Override
	public String move() {
		return "flail arms and legs";
	}

	@Override
	public String move(int count) {
		String move = "";
		if(count <= 0) {
			return "";
		}
		for(int i = 0; i < count; i++) {
			move += move() + "\n";
		}
		return move;
	}

}


public class Elder extends Person implements Mover{

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
	public String move() {
		return "ouch my back wait for me";
	}

	@Override
	public String move(int count) {
		String move = "";
		if(count <= 0) {
			return "";
		}
		for(int i = 0; i < count; i++) {
			if(i == 0) {
				move += move();
			}
			else {
				move += "\n" + move();
			}
			
		}
		return move;
	}

	@Override
	public double metabolizeAccumulatedCalories() {
		double totalWeight = 0;
		double caloriesLeft = getCaloriesAccumulator();
		
			caloriesLeft = caloriesLeft / 300.0;
			gainWeight(caloriesLeft);
			totalWeight += caloriesLeft;
			
		
		
		setCaloriesAccumulator(0);
		
		
		return totalWeight;
		
	}

}

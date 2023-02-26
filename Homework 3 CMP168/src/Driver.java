import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
		//Passenger p1 = new Passenger("Jose", 1990, 160.5, 180, 'm', 2);
		//Passenger p2 = new Passenger("Jose", 1990, 160.5, 180, 'm', 3);
		
		//System.out.println(p1.equals(p2));
		
		//Person person1 = new Person("Carlos", 2001, 140.6, 175.5, 'm', 2, 2);
		//Person person2 = new Person("Carlos", 2001, 140.5, 175.5, 'm', 2, 2);
		
		Infant infant1 = new Infant("Bebe", 2017, 50, 90.5, 'm', 1);
		Food food1 = new Food("Apple", 1250);
		Food food2 = new Food("Potato", 5000);
		Food [] foodAr = {food1, food2};
		
		System.out.println(infant1.getWeight());
		
		infant1.eat(food1);
		infant1.eat(food2);
		//infant1.eat(foodAr);
		
		System.out.println(infant1.getCaloriesConsumed());
		
		System.out.println(infant1.metabolizeAccumulatedCalories());
		
		System.out.println(infant1.getWeight());
		
		System.out.println(infant1.move());
		
		System.out.println(infant1.getCaloriesConsumed());
		
		//infant1.addInfantToy("Rex", 5);
		//infant1.addInfantToy("Pepe", 6);
		//infant1.addInfantToy("Mr potato", 9);
		
		//System.out.println(infant1.getInfantToyAsString(2));
		
		//System.out.println(infant1.getHighestInfantToyRating());
		
		//infant1.printDetails();
		
		//System.out.println(infant1);
		
		//System.out.println(person1);
		//person1.printDetails();
		
		//System.out.println(person1.equals(person2));

	}

}

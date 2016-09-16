package meal.builder;

public class LemonadeColdDrinkImpl extends ColdDrinkMealItem{
	
	LemonadeColdDrinkImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Lemonade";
	}

	@Override
	public double getPrice() {
		return 1.2; // in dollars
	}

}

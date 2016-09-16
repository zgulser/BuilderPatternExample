package meal.builder;

public class CokeColdDrinkImpl extends ColdDrinkMealItem{
	
	CokeColdDrinkImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Coke";
	}

	@Override
	public double getPrice() {
		return 2.0; // in dollars
	}

}

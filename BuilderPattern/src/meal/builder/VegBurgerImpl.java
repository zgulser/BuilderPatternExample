package meal.builder;

public class VegBurgerImpl extends BurgerMealItem {
	
	VegBurgerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Veg Burger";
	}

	@Override
	public double getPrice() {
		return 2.6; // in dollars
	}

}

package meal.builder;

public class ChickenBurgerImpl extends BurgerMealItem {
	
	ChickenBurgerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Chicken Burger";
	}

	@Override
	public double getPrice() {
		return 3.2; // in dollars
	}

}

package meal.builder;

/**
 * 
 * @author zeki
 *
 * Our composition root. The one knows the implementations.
 */
public class MealBuilder {
	
	public static Meal prepareChickenMeal(){
		Meal chickenMeal = new Meal()
				.addItem(new ChickenBurgerImpl())
				.addItem(new CokeColdDrinkImpl());
		return chickenMeal;
	}
	
	public static Meal prepareVeggiMeal(){
		Meal vegMeal = new Meal()
				.addItem(new VegBurgerImpl())
				.addItem(new LemonadeColdDrinkImpl());
		return vegMeal;
	}

}

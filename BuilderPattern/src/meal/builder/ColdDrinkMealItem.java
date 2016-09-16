package meal.builder;

public abstract class ColdDrinkMealItem implements MealItem{
	
	@Override
	public ItemPacking getPacking() {
		return new BottleItemPackingImpl();
	}

}

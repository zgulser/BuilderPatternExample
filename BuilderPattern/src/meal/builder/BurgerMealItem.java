package meal.builder;

public abstract class BurgerMealItem implements MealItem{
	
	@Override
	public ItemPacking getPacking() {		
		return new WrapperItemPackingImpl();
	}

}

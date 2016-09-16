package meal.builder;

import java.util.ArrayList;

/**
 * 
 * @author zeki
 *
 * Only knows about abstract MealItems
 *
 */
public class Meal {
	
	ArrayList<MealItem> mealItems;
	
	Meal(){
		mealItems = new ArrayList<MealItem>();
	}
	
	public double getCost(){
		
		double totalCost = 0.0d;
		for(MealItem mealItem : mealItems){
			totalCost += mealItem.getPrice();
		}
		
		return totalCost;
	}
	
	public Meal addItem(MealItem item){
		mealItems.add(item);
		return this;
	}	

}

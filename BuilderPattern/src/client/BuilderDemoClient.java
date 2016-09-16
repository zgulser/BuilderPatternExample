package client;

import meal.builder.Meal;
import meal.builder.MealBuilder;

public class BuilderDemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Meal chickenMeal = MealBuilder.prepareChickenMeal();
		Meal vegMeal = MealBuilder.prepareVeggiMeal();
	}

}

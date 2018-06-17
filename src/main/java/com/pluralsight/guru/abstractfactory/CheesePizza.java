package com.pluralsight.guru.abstractfactory;

public class CheesePizza extends Pizza {

	BaseToppingFactory toppingFactory;
	public CheesePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}
	@Override
	public void addIngredients() {
		System.out.println("Preparing Ingredients for cheese pizza...");
		toppingFactory.createCheese();
		toppingFactory.createSauce();

	}

}

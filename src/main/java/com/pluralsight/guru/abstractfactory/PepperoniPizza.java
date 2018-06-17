package com.pluralsight.guru.abstractfactory;

public class PepperoniPizza extends Pizza {

	BaseToppingFactory toppingFactory;
	public PepperoniPizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}
	@Override
	public void addIngredients() {
		System.out.println("Preparing Ingredients of pepperoni pizza...");
		toppingFactory.createCheese();
		toppingFactory.createCheese();

	}

}

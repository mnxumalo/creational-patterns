package com.pluralsight.guru.abstractfactory;

public class VeggiePizza extends Pizza {

	BaseToppingFactory toppingFactory;
	public VeggiePizza(BaseToppingFactory toppingFactory) {
		this.toppingFactory = toppingFactory;
	}
	@Override
	public void addIngredients() {
		System.out.println("Preparing veggie pizza ingredients...");
		toppingFactory.createCheese();
		toppingFactory.createSauce();
	}

}

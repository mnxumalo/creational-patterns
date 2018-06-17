package com.pluralsight.guru.factory;

public class PizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		
		switch (type) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "pepperoni":
			pizza = new PepperoniPizza();
			break;
		case "veggie":
			pizza = new VeggiePizza();
			break;
		default:
			pizza = null;
			break;
		}
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}

}

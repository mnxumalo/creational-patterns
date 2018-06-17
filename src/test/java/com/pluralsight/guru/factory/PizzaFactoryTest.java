package com.pluralsight.guru.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

class PizzaFactoryTest {

	@Test
	public void testCreatePizza() {
		BasePizzaFactory factory = new PizzaFactory();
		Pizza cheese = factory.createPizza("cheese");
		Pizza pepperoni = factory.createPizza("pepperoni");
		assertNotNull(cheese);
		assertNotNull(pepperoni);
	}

}

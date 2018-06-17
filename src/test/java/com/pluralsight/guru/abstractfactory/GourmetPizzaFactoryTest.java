package com.pluralsight.guru.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GourmetPizzaFactoryTest {

	@Test
	void testCreatePizza() {
		BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
        assertNotNull(cheesePizza);
        assertNotNull(veggiePizza);
	}

}

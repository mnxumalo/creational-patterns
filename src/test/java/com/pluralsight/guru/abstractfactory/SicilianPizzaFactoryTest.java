package com.pluralsight.guru.abstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SicilianPizzaFactoryTest {

	@Test
	void testCreatePizza() {
		BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
        assertNotNull(cheesePizza);
        assertNotNull(pepperoniPizza);
	}

}

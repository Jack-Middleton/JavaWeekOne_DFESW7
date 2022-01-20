package com.qa.jdbc_demo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JDBC_Setup setup = new JDBC_Setup();
		setup.connect();

		Pizzeria pepperoni = new Pizzeria("Pepperoni", 10, true);
		Pizzeria margerhita = new Pizzeria("Margherita", 12, true);
		Pizzeria hawaiian = new Pizzeria("Hawaiian", 12, true);
		PizzaManager manager = new PizzaManager();

		// the addPizza method is not using the passed in pizza
		// But requires it being passed in to run
		manager.addToMenu(pepperoni, margerhita, hawaiian);
		manager.addPizza(hawaiian);
		System.out.println(manager.viewPizza(2));
		manager.deletePizza(1);
//		manager.viewAllPizzas();
		System.out.println(manager.updatePizza(4, hawaiian));

	}

}

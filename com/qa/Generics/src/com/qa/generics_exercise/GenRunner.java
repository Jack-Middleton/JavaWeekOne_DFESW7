package com.qa.generics_exercise;

public class GenRunner {
	public static void pokemon() {
		Pokeball<Kyogre> masterBall = new Pokeball<>();
		Pokeball<Groudon> ultraBall = new Pokeball<>();

		masterBall.setLegendary(new Kyogre());
		ultraBall.setLegendary(new Groudon());

		masterBall.getLegendary().drizzle();
		ultraBall.getLegendary().drought();

	}

	public static void main(String[] args) {
		pokemon();
	}

}

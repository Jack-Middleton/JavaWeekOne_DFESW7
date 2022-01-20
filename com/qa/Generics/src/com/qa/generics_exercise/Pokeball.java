package com.qa.generics_exercise;

public class Pokeball<t extends Legendary> {
	private t Legendary;

	public t getLegendary() {
		return Legendary;
	}

	public void setLegendary(t legendary) {
		Legendary = legendary;
	}

}

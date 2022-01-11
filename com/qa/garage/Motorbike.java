package com.qa.garage;

public class Motorbike extends Vehicle {
	private boolean hasHandlebars;

	public Motorbike(String model, int noOfWheels, boolean hasEngine, int maxPeople, boolean hasHandlebars,
			String type) {
		super(model, noOfWheels, hasEngine, maxPeople, type);
		// TODO Auto-generated constructor stub
		setHasHandlebars(hasHandlebars);
	}

	public boolean isHasHandlebars() {
		return hasHandlebars;
	}

	public void setHasHandlebars(boolean hasHandlebars) {
		this.hasHandlebars = hasHandlebars;
	}

}

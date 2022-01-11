package com.qa.garage;

public class Boat extends Vehicle {
	public boolean isAquatic;

	public Boat(String model, int noOfWheels, boolean hasEngine, int maxPeople, boolean isAquatic, String type) {
		super(model, noOfWheels, hasEngine, maxPeople, type);
		// TODO Auto-generated constructor stub
		setAquatic(isAquatic);
	}

	public boolean isAquatic() {
		return isAquatic;
	}

	public void setAquatic(boolean isAquatic) {
		this.isAquatic = isAquatic;
	}

}

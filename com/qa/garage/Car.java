package com.qa.garage;

public class Car extends Vehicle {

	private boolean is4WD;

	public Car(String model, int noOfWheels, boolean hasEngine, int maxPeople, boolean is4wd, String type) {
		super(model, noOfWheels, hasEngine, maxPeople, type);
		setIs4WD(is4wd);
	}

	public boolean isIs4WD() {
		return is4WD;
	}

	public void setIs4WD(boolean is4wd) {
		is4WD = is4wd;
	}

}

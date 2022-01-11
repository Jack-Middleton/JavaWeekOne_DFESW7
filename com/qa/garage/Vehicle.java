package com.qa.garage;

import java.util.Objects;

public class Vehicle {

	private String model;
	private int noOfWheels;
	private boolean hasEngine;
	private int maxPeople;
	private String type;

	public Vehicle(String model, int noOfWheels, boolean hasEngine, int maxPeople, String type) {
		super();
		this.model = model;
		this.noOfWheels = noOfWheels;
		this.hasEngine = hasEngine;
		this.setMaxPeople(maxPeople);
		this.type = type;
	}

	public Vehicle() {
		super();
	}

	public void setDetails(String model, int noOfWheels, boolean hasEngine, int maxPeople, String type) {
		this.model = model;
		this.noOfWheels = noOfWheels;
		this.hasEngine = hasEngine;
		this.setMaxPeople(maxPeople);
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean getHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	@Override
	public String toString() {
		return "\nVehicle Details \nModel = " + model + "\n noOfWheels = " + noOfWheels + "\n hasEngine = " + hasEngine
				+ "\n maxPeople = " + maxPeople + "\n type = " + type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hasEngine, maxPeople, model, noOfWheels);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return hasEngine == other.hasEngine && maxPeople == other.maxPeople && Objects.equals(model, other.model)
				&& noOfWheels == other.noOfWheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

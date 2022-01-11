package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public void add(Vehicle vehicle) {
		garage.add(vehicle);
	}

	public void generateBill(Vehicle vehicle) {
		for (Vehicle v : garage) {
			if (v instanceof Car) {
				System.out.println(v.getModel() + " will cost £550 to fix");
			} else if (v instanceof Boat) {
				System.out.println(v.getModel() + " will cost £350 to fix");
			} else if (v instanceof Motorbike) {
				System.out.println(v.getModel() + " will cost £450 to fix");
			} else {
				System.out.println("No Vehicle found");
			}
		}
	}

	public void remove(String vehicle) {
		for (Vehicle i : new ArrayList<>(garage)) {
			if (i.getModel().equalsIgnoreCase(vehicle)) {
				System.out.println(i.getModel() + " has been removed from the garage");
				garage.remove(i);
			}
		}
	}

	public void removeType(String vehicle) {
		for (Vehicle i : new ArrayList<>(garage)) {
			if (i.getType().equalsIgnoreCase(vehicle)) {
				System.out.println(i.getModel() + " " + i.getType() + " has been removed from the garage");
				garage.remove(i);
			}
		}
	}

	public void print() {
		for (Vehicle i : garage) {
			System.out.println(i);
		}
	}

	public void empty() {
		garage.clear();
		System.out.println("Garage has been emptied");
	}

}

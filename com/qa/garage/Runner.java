package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vauxhall = new Car("Vauxhall", 4, true, 4, true, "Car");
//		System.out.println(vauxhall);
		Vehicle corsa = new Car("Corsa", 4, true, 4, true, "Car");
		Vehicle titanic = new Boat("titanic", 0, true, 1000, true, "Boat");
//		System.out.println(titanic);

		Vehicle yamaha = new Motorbike("Yamaha", 2, true, 2, true, "Motorbike");
		Vehicle subaru = new Motorbike("Subaru", 2, true, 2, true, "Motorbike");
		System.out.println(yamaha);

		Garage garageEdit = new Garage();
		garageEdit.add(vauxhall);
		garageEdit.add(subaru);
		garageEdit.add(titanic);
		garageEdit.add(corsa);

		garageEdit.generateBill(vauxhall);
		garageEdit.print();
		garageEdit.removeType("Car");
		garageEdit.print();
		garageEdit.empty();
		garageEdit.print();
	}

}

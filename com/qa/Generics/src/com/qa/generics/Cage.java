package com.qa.generics;

// This class can now take in a type of t / type
// we can specify that t must extend off of something 
// and it can accept any classes of that type
public class Cage<t extends Animal> {

	// takes in a class of any type and calls it animal
	private t animal;

	public t getAnimal() {
		return animal;
	}

	public void setAnimal(t animal) {
		this.animal = animal;
	}
}

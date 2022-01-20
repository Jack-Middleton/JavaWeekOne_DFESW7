package com.qa.generics;

public class GenRunner {

	public static void genericsExample() {

		// make some cages for my specific animals

		Cage<Dog> kennel = new Cage<>();
		kennel.setAnimal(new Dog());
		kennel.getAnimal().fetch();

		Cage<Lion> lionCage = new Cage<>();
		lionCage.setAnimal(new Lion());
		lionCage.getAnimal().roar();

		// generics allow us to specify what type of class a class should contain/be
		// leave this as flexible in the code, until we get to runtime

		// cage that takes in the class of Dog
		// no longer takes in a type of Animal, but is more specific
		Cage<Dog> kennel2 = new Cage<>();
		kennel2.setAnimal(new Dog());
		kennel2.getAnimal().fetch();

	}

	public static void main(String[] args) {

	}
}

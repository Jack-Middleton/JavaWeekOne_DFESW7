package com.qa.person;

import java.util.ArrayList;

public class PersonList {
	// create an object that stores people
	ArrayList<Person> personList = new ArrayList<Person>();

	public void print() {
		for (Person person : personList) {
			System.out.println(person);
		}
	}

	public void add(Person person) {
		// TODO Auto-generated method stub
		personList.add(person);

	}

	public void find(String name) {
		boolean resultsFound = false;
		for (Person person : personList) {
			if (person.getName().equalsIgnoreCase(name)) {
				System.out.println(person.getName());
				resultsFound = true;
			}
		}
		if (resultsFound == false) {
			System.out.println("Person not found");
		}
	}
}

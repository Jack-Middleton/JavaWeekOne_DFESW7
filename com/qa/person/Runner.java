package com.qa.person;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person jm = new Person();
		jm.setDetails("Jack", "26", "Trainee");

//		System.out.println(jm);
		Person dc = new Person();
//		System.out.println(dc);
		dc.setDetails("Daniel", "Unknown", "Trainee");
//		System.out.println(dc);

		PersonList register = new PersonList();

		register.add(jm);
		register.add(dc);
//		register.print();
		register.find("Jack");
		register.find("daniel");
		register.find("Caitriona");

	}

}

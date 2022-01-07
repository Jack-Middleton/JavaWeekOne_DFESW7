package com.qa.iteration;

public class Runner {

	public static void main(String[] args) {
		
//		for(int i = 10; i <= 99; i++) {
//			int x = i/10 + i%10;
//			System.out.println(x);
//		}
		
//		for (int a = 100; a <= 200; a++) {
//			System.out.println(a);
//		}
		
//		for (int a = 100; a < 201; a++) {
//			if(a%2 == 0) {
//				System.out.println("-");
//			}
//			else {
//				System.out.println("*");
//			}
//		}
		
//		int counter = 1;
//		while(counter<100) {
//			for(int i = 1; i <= 10; i++) {
//				System.out.println(i);
//				counter++;
//			}
//		}
		
//		int counter = 1;
//		for (int i =1; counter <= 100; i++) {
//			if (i == 11) {
//				i = 1;
//			}
//			System.out.println(i);
//			counter++;
//		}
		
//		int counter = 23;
//		for (int i = 1; i <= counter; i++) {
//			System.out.println(i);
//		}
		
//	    for (int i = 1; i <= 10; i++){
//	        for (int j = 1; j <= i; j++) {
//	            System.out.println(i);
//	        }
//	    }

		int amount = 20;
		double cost = 4.58;

		double changeGiven = amount * 100 - cost * 100;
		System.out.println(changeGiven);
		
		int twentyPounds = 0;
		int tenPounds = 0;
		int fivePounds = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		while (changeGiven > 0) {
		if(changeGiven >= 2000) {
			twentyPounds++;
			changeGiven -= 2000;
		}
		else if(changeGiven >= 1000) {
			tenPounds++;
			changeGiven -= 500;
		}
		else if(changeGiven >= 500) {
			fivePounds++;
			changeGiven-=500;
		}
		else if (changeGiven >= 100) {
			onePound++;
			changeGiven -=100;
		}
		else if (changeGiven >= 50) {
			fiftyPence++;
			changeGiven -= 50;
		}
		else if (changeGiven >= 20) {
			twentyPence++;
			changeGiven -=20;
		}
		else if (changeGiven >= 10) {
			tenPence++;
			changeGiven -=10;
		}
		else if (changeGiven >= 5) {
			fivePence++;
			changeGiven -=5;
		}
		else if (changeGiven >= 2) {
			twoPence++;
			changeGiven -=2;
		}
		else if (changeGiven >= 1) {
			onePence++;
			changeGiven -=1;
		}		
	}
		System.out.println("Your change is :" + (amount - cost));
		System.out.println("TWENTIES: ");
		System.out.println("\t" + twentyPounds);
		System.out.println("TENS: ");
		System.out.println("\t" + tenPounds);
		System.out.println("FIVES: ");
		System.out.println("\t" + fivePounds);
		System.out.println("FIFTY PENCE: ");
		System.out.println("\t" + fiftyPence);
		System.out.println("TWENTY PENCE: ");
		System.out.println("\t" + twentyPence);
		System.out.println("TEN PENCE: ");
		System.out.println("\t" + tenPence);
		System.out.println("FIVE PENCE: ");
		System.out.println("\t" + fivePence);
		System.out.println("TWO PENCE: ");
		System.out.println("\t" + twoPence);
		System.out.println("ONE PENCE: ");
		System.out.println("\t" + onePence);
		
		

		
		
		
		
		
		
		
		// this doesnt work, but Cameron explained it better
		// by keeping switch cases in the Runner file and using modulo to pass in int
		// to the switch case
//		Numbers myNumber = new Numbers();
//		myNumber.counter = 1;
//		myNumber.maxCounter = 99;
//				
//		
		// this 
//		for (int i = myNumber.counter; i <= myNumber.maxCounter; i++) {
//			String numTens = myNumber.tens();
//			String numSingles = myNumber.singles();
//			String numTeens = myNumber.teens();
//			if (i < 10) {
//				System.out.println(numSingles);
//				myNumber.counter++;
//			}
//			else if (i == 10) {
//				System.out.println(numTens);
//				myNumber.counter++;
//			}
//			else if (i >= 10 & i < 20) {
//				System.out.println(numTeens);
//				myNumber.counter++;
//			}
//			else {
//				System.out.println(numTens + numSingles);				
//			}
//		
//		}
	}
}


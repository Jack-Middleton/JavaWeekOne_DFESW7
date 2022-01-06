package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
		// condition logic uses boolean values or expressions that evaluate to a boolean value
		
		// Equality operators 
		// == is equal to 
		// != (is not equal to)
		boolean isRaining = true;
		
		// this checks if a boolean value is true
		// the same as doing if(isRaining == true)
		if(isRaining) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		// comparison operators
		// <,>,<=,>=
		
		// conditional operators
		// Logical:
		// OR
		// AND
		// short circuit:
		// OR
		// AND
		
		int day = 6;
		
		switch(day) {
		case 1:
			System.out.println("slogan 1");
			break;
		case 2:
			System.out.println("slogan 2");
			break;
		case 3:
			System.out.println("slogan 3");
			break;
		case 4:
			System.out.println("slogan 4");
			break;
		case 5:
			System.out.println("slogan 5");
			break;
		case 6:
			System.out.println("slogan 6");
			break;
		case 7:
			System.out.println("slogan 7");
			break;
		default:
			System.out.println("Please enter a number between 1 & 7");
			break;
		
		}
		
	}

}

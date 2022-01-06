package com.qa.data_types;

public class Runner_2 {

	public static void main(String[] args) {
		// 	EVERYTHING IS CASE SENSITIVE!
		
		// EVERY COMPLETE INSTRUCTION MUST FINISH WITH A SEMI-COLON
		// semicolon is the delimiter that denotes the end of a Java instruction
		// primitive types
		// these are basic building blocks
		// DO NOT HAVE METHODS
		// they do have reference type equivalents
		
		//variable declaration
		// Data type variableName
		
		int x; // declared a variable of type 'int' with the name 'x'
		
		//variable initialisation
		// variable name = value
		x = 3;
		System.out.println(x);
		
		// variable declaration and initialisation on the same line 
		// Data type variableName = some value
		int z = 43;
		// I have declared a variable of type int called z, which stores a value of 43
		
		
		// numerical types (whole number/integer data types)
		// when you write a whole number it will default to an integer
		// this conversion happens using type casting
		byte b = 3 ; // 3 is of type int by default, it gets downcast/converted (narrowed its type) by Java
		short s = 5;
		int i = 7;
		long l  = 12345678L; // we have to widen the int
		// the L on the end denotes that its a long int, without the L it will default to an int and throw an error 
		
		// System.out.println(Integer.MAX_VALUE); will print the max storage space of int
		
		
		// Numerical (decimal number/floating point types)
		// decimal numbers default to a double
		float f = 3.14f;
		float f2 = (float) 3.14; // works the same as line 45
		double d = 3.14;
		double d2 = 3.14d; // the d on the end explicitly states its a double, line 47 its the default
		
		// non-numerical types
		char c = 'A'; // holds a single character, or UTF-8 character, MUST BE SURROUNDED BY SINGLE QUOTES, NOT DOUBLE
		boolean bool = true; // True or False
				
		
		
		
		// reference types
		// - all classes are reference types 
		// reference types have state (fields describing them) and behaviours (methods that act on the state)
		
		String greeting = "Hello"; // a string is a sequence / array of chars
		
		
		// strings are immutable, methods do not change the data inside them
		System.out.println(greeting);
		System.out.println(greeting.toUpperCase());
		
		// string is a class 
		// a class is a blueprint 
		// each string created from that blueprint is called an instance or object
		// strings can be declared using a string literal inside double quotes
		String farewell = "goodbye";
		// farewell and greeting are two different string objects
		
		
		// explicit declaration of a string 
		// - the 'new' keyword signifies a new object is being created
		String anotherOne = new String("some other string");
		System.out.println(anotherOne);
		
		Fraction myFraction = new Fraction();
		Fraction myFraction2 = new Fraction();
		Fraction myBackupReference = myFraction;
		System.out.println(myFraction);
		System.out.println(myFraction2);
		System.out.println(myBackupReference);
		
		
		// fields on a class instance can be accessed using dot notation
		myFraction.numerator = 3;
		myFraction.denominator = 6;
		
		System.out.println(myFraction.numerator);
		myFraction.printInfo();
				
		myFraction2.addToNumerator(5);
		
		String toDisplay = myFraction.getInfo();
		
		
		Fraction anotherFraction = new Fraction();
		anotherFraction.numerator = 3;
		anotherFraction.denominator = 6;
		Fraction result = myFraction.multiply(anotherFraction);
		
		
	}

}

package com.qa.data_types;

// a class is a blueprint
// we can create many unique instances from this blueprint

// a class can only be public or package-private
public class Fraction {
	
	// fields hold data describing the instance
	// fields have a default value
	// integers default to zero
	
	// public is an access modifier
	
		int numerator;
		int denominator;		
		
		// Method
		// a self contained behaviour / piece of functionality
		// void means that the method returns nothing
		// the method does not have any parameters
		public void printInfo() {
			System.out.println(numerator + "/" + denominator);
			
		}
		
		public void addToNumerator(int i) {
			//i is a local variable, local to this methods body
			numerator += i;
			
			
		}
		
		
		// method that returns outputs 
		//this returns a string 
		
		public String getInfo() {
			// the return keyword signifies something to be returned 
			return numerator + "/" + denominator;
			
			
		}
		
		
		//fraction is the return type 
		// multiply is the name 
		// take an input of type Fraction and store it in a variable called fraction
		public Fraction multiply(Fraction fraction) {
			// create a new fraction to store the result 
			Fraction output = new Fraction();
			// set the new fractions numerator to the result of this objects numerator 
			// multiplied by the input fractions numerator 
			output.numerator = numerator * fraction.numerator;
			// do the same for the denominator
			output.denominator = denominator * fraction.denominator;
			
			return output;
		}
		// belongs to a class (class member)
		// AccessModifier
		// ReturnType
		// MethodName
		// Parentheses
		// curly braces
		
	}


// if you do not specify your public access modifier 
// it takes on the default package-private 

// fields and methods can have the following access modifiers

//public
//default package-private
//protected
//private
package com.qa.calculator;

public class Runner {
 
	
	public static void main(String[] args) {
		calculator_exercise myCalculator = new calculator_exercise(); 
		
		results myResults = new results();
		
		System.out.println(myCalculator.sumCalc(2, 4));
		System.out.println(myCalculator.multiplication(2, 4));
		
		int firstInt = 12;
		int secondInt = 15;
		if(firstInt < secondInt) {
			System.out.println(myCalculator.division(firstInt,secondInt));
		}
		else
		{
			System.out.println("division cannot be performed");
		}
		
		
		
		myResults.physics = 63;
		myResults.biology = 101;
		myResults.chemistry = 92;
		
		
		
		int exams = 1;
		
		switch(exams) {
			case 1:
				myResults.displayResults();
				if(myCalculator.checkExamPercentage(myResults.physics) > 60) {
					System.out.println("Passed physics, final percentage: " + myCalculator.checkExamPercentage(myResults.physics) );
				}
				else {
					System.out.println("Failed physics, you scored " + myCalculator.checkExamPercentage(myResults.physics));
					
				}
			case 2:
				if(myCalculator.checkExamPercentage(myResults.biology) > 60) {
					System.out.println("Passed biology, final percentage: " + myCalculator.checkExamPercentage(myResults.biology));
				}
				else {
					System.out.println("Failed biology, you scored " + myCalculator.checkExamPercentage(myResults.biology));				
				}
			case 3:
				if(myCalculator.checkExamPercentage(myResults.chemistry) > 60) {
					System.out.println("Passed chemistry, final percentage: " + myCalculator.checkExamPercentage(myResults.chemistry));
				}
				else {
					System.out.println("Failed chemistry, you scored " + myCalculator.checkExamPercentage(myResults.chemistry));
					
				}
			case 4:
				
				if(!myResults.checkExamPass(myResults.physics)) {
					System.out.println("You failed");
					
				}
				else if(!myResults.checkExamPass(myResults.biology)) {
					System.out.println("You failed");
				}
				else if(!myResults.checkExamPass(myResults.chemistry)) {
					System.out.println("You failed");
				}
				else {
					System.out.println("You passed");
				}
				break;
			default:
				System.out.println("please enter a number between 1 and 4");
				
		}
		
		
		
		
				
	}
	
		int x = 15;
		int y = 22;
		boolean b = true; 
		
		public int multiplyIfTrue(int x, int y, boolean b) {
			if(b) {
				return x + y;
			}
			else {
				return x * y;
			}
		}
	
	}



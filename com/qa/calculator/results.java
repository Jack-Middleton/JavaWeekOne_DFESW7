package com.qa.calculator;

public class results {

	
		int physics;
		int chemistry;
		int biology;
		
		int totalScore;
		int percentage;
		
		calculator_exercise myCalculator = new calculator_exercise();
		
		public void displayResults() {
			totalScore = physics + chemistry + biology;
			System.out.println("PHYSICS: ");
			System.out.println("\t " + physics);
			System.out.println("BIOLOGY: ");
			System.out.println("\t " + biology);
			System.out.println("CHEMISTRY: ");
			System.out.println("\t " + chemistry);
			
			System.out.println("\nEXAM SCORE: " + totalScore + "/450");
			
			System.out.println("\n FINAL PERCENTAGE: ");
			System.out.println("\t " + myCalculator.findPercentage(physics, biology, chemistry));
		}
		
		
		public void isPassFail() {
			if(myCalculator.findPercentage(physics, biology, chemistry) > 60){
				System.out.println("You passed");
			}
			else {
				System.out.println("you failed");
			}
		}
		public boolean checkExamPass(int a) {
			if(myCalculator.checkExamPercentage(a) > 60) {
				return true;
			}
			else {
				return false;
		}
	}
}

	

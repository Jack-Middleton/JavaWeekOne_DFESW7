package com.qa.calculator;

public class calculator_exercise {
	
	public int sumCalc(int a, int b) {
		int output = a + b;
		return output;
	}
	
	public int multiplication(int a, int b) {
		int output = a * b;
		return output;
	}
	
	public String division(double a, double b) {
		if( a < b) {
			System.out.println(a + " / "  + b + " = " + a/b);
			return "division successful";
		}
		else {
			return "division failed";
		}
		}
		
	public float findPercentage(float a, float b, float c) {
		
		float percentage = Math.round(((a + b + c) * 100) / 450);
		
		return percentage; 
		}
	
	public float checkExamPercentage(float a) {
		
		float percentage = Math.round((a * 100) / 150);
		
		return percentage;
		
	}

	
}
		


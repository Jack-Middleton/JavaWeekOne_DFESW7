package com.qa.iteration;

public class Numbers {
	
	String singleDigits;
	int counter;
	int maxCounter;
	
	public String singles() {
		switch(counter) {
		case 1:
			singleDigits = "one";
			return singleDigits;
		case 2:
			singleDigits = "two";
			return singleDigits;
		case 3:
			singleDigits = "three";
			return singleDigits;
		case 4:
			singleDigits = "four";
			return singleDigits;
		case 5:
			singleDigits = "five";
			return singleDigits;
		case 6:
			singleDigits = "six";
			return singleDigits;
		case 7:
			singleDigits = "seven";
			return singleDigits;
		case 8:
			singleDigits = "eight";
			return singleDigits;
		case 9:
			singleDigits = "nine";
			return singleDigits;
		default: 
			return "";
		}
		
	}
	public String teens() {
		switch(counter) {
		case 11:
			singleDigits = "eleven";
			return singleDigits;
		case 12:
			singleDigits = "twelve";
			return singleDigits;
		case 13:
			singleDigits = "thirteen";
			return singleDigits;
		case 14:
			singleDigits = "fourteen";
			return singleDigits;
		case 15:
			singleDigits = "fifteen";
			return singleDigits;
		case 16:
			singleDigits = "sixteen";
			return singleDigits;
		case 17:
			singleDigits = "seventeen";
			return singleDigits;
		case 18:
			singleDigits = "eighteen";
			return singleDigits;
		case 19:
			singleDigits = "nineteen";
			return singleDigits;
		default: 
			return "";
		}
		
	}
	
	public String tens() {
		switch(counter) {
		case 10:
			singleDigits = "ten";
			return singleDigits;
		case 20:
			singleDigits = "twenty";
			return singleDigits;
		case 30:
			singleDigits = "thirty";
			return singleDigits;
		case 40:
			singleDigits = "fourty";
			return singleDigits;
		case 50:
			singleDigits = "fifty";
			return singleDigits;
		case 60:
			singleDigits = "sixty";
			return singleDigits;
		case 70:
			singleDigits = "seventy";
			return singleDigits;
		case 80:
			singleDigits = "eighty";
			return singleDigits;
		case 9:
			singleDigits = "ninety";
			return singleDigits;
		default: 
			return "";
		}
		
	}
	
	

	
	
}

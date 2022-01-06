package com.qa.conditionals;

public class Tax {
	int income;
	
	// takes an input and determines which tax band that income falls under
	// this output will be used later to perform calcs determining total tax paid
	
	public int taxPercentage(int a) {
		
		if(a < 15000) {
			int taxBand = 1;
			System.out.println("0% tax on income less than 15'000");
			return taxBand;
		}
		else if(a >= 1500 & a < 20000) {
			System.out.println("10% tax on income between 15'000 and 19'999");
			int taxBand = 2;
			return taxBand;
		}
		else if(a >= 20000 & a < 30000) {
			System.out.println("15% tax on income between 20'000 and 29'999");
			int taxBand = 3;
			return taxBand;
		}
		else if(a >= 30000 & a < 45000) {
			System.out.println("20% tax on income between 30'000 and 44'999");
			int taxBand = 4;
			return taxBand;
		}
		else if(a >= 45000) {
			System.out.println("25% tax on income over than 45'000");
			int taxBand = 5;
			return taxBand;
		}
		else {
			System.out.println("Invalid income entered, enter a positive number");
			int taxBand = 0;
			return taxBand;
		}
		
		
	}
	
	public String taxPaid(int b) {

		switch(b) {
		case 1:
			return "On an income of £" + income + " you will be taxed 0%";
		case 2:
			double taxBandTwo = income * 0.1;
			return "you will pay £" + taxBandTwo + " in taxes";
		case 3:
			double taxBandThree = income * 0.15;
			return "you will pay £" + taxBandThree + " in taxes";
		case 4:
			double taxBandFour = income * 0.20;
			return "you will pay £" + taxBandFour + " in taxes";
		case 5:
			double taxBandFive = income * 0.25;
			return"you will pay £" + taxBandFive + " in taxes";
		default: 
			return "Invalid income entered";
		}
		
	}


	}
	


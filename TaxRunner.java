package com.qa.conditionals;

public class TaxRunner {

	public static void main(String[] args) {
		Tax taxCalc = new Tax();
		taxCalc.income = 32000;
		System.out.println(taxCalc.taxPaid(taxCalc.taxPercentage(taxCalc.income)));
		
		
	}

}

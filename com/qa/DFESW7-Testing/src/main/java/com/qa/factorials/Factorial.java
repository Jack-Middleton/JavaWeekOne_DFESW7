package com.qa.factorials;

public class Factorial {

	public static String fact(int num) {
		int sum = 1;
		for (int n = 1; n < num; n++) {
			sum *= n;
			if (sum == num) {
				System.out.println(n + "!");
				return n + "!";

			} else if (sum > num) {
				System.out.println("NONE");
				return "NONE";
			}

		}
		return "";
	}
}

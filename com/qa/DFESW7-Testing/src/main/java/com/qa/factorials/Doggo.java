package com.qa.factorials;

import java.util.ArrayList;

public class Doggo {

	// 1, 2, 3 is always st, nd, rd
	// apart from 10-20 which is all th

	public static ArrayList<String> placement(int placement) {
		String suffixes[] = { "st", "nd", "rd", "th" };
		ArrayList<String> results = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {

			// loop to skip chosen placement
			if (placement == i) {
				continue;
			} else if (i % 10 == 1 && i != 11) {
				// ad st
				results.add(i + suffixes[0] + "\n ");
			} else if (i % 10 == 2 && i != 12) {
				// ad nd
				results.add(i + suffixes[1] + "\n ");
			} else if (i % 10 == 3 && i != 13) {
				// ad rd
				results.add(i + suffixes[2] + "\n ");
			} else {
				// add th
				results.add(i + suffixes[3] + "\n ");
			}
		}

		return results;
	}

}

package Operators;

public class Runner {

	public static void main(String[] args) {
		
		// assignment
		// placing a value into a variable 
		// performed right to left 
		// = - symbol used for assignment
		int x = 3;
		String s = "Hello";
		
		//arithmetic operators 
		// follows BIDMAS/BODMAS/PEMDAS model of order of organisation 
		// + for addition , - for subtraction , / for division , * for multiplication 
		int y = 3 + 3; //6
		int z = 3 - 2; //1
		int division = 4 / 2; //2
		int i = 3 * 3; // 9
		
		//modular returns the remainder of a division as a whole number
		int r = 9 % 2; // 1
		System.out.println(r);
		
		// compound assignment
		// += *= /= %=
		int accumulator = 15;
		int input = 24;
		// accumulator = accumulator + input; //39
		accumulator += input;
		
		System.out.println(accumulator);
		
		
	// string concatenation 
		String greeting = "Hello";
		String name = "Jack";
			
		String greetPerson = greeting + " " + name;
		System.out.println(greetPerson);
	}
	
	
}

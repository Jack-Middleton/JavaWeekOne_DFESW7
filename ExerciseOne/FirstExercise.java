package ExerciseOne;

public class FirstExercise {

	public static void main(String[] args) {
		
		// primitive type variables int, boolean, long, short, double, float, char, byte
		
		byte firstByte = 3;
		byte secondByte = 6;
		int firstInt = 3;
		int secondInt = 6;
		short firstShort = 3;
		short secondShort = 6;
		long firstLong = 987768798787L;
		long secondLong = 9999988888998L;
		char firstChar = 'A';
		char secondChar = 'B';
		float firstFloat = 3.14f;
		float secondFloat = 4.96f;
		double firstDouble = 6.72;
		double secondDouble = 9.81;
		boolean firstBool = true;
		boolean secondBool = false;
		System.out.println(firstByte);
		System.out.println(secondByte);
		System.out.println(firstInt);
		System.out.println(secondInt);
		System.out.println(firstShort);
		System.out.println(secondShort);
		System.out.println(firstLong);
		System.out.println(secondLong);
		System.out.println(firstChar);
		System.out.println(secondChar);
		System.out.println(firstFloat);
		System.out.println(secondFloat);
		System.out.println(firstDouble);
		System.out.println(secondBool);
		System.out.println(firstBool);
		System.out.println(secondBool);
		
		int sum = firstInt + secondInt;
		int product = firstInt * secondInt;
		System.out.println(sum);
		System.out.println(product);
		
		System.out.println(firstInt + " + " + secondInt + " " + "=" + " " + sum);
		System.out.println(firstInt + " " + "*" + " " + secondInt + " " + "=" + " " + product);
		
		int oddNumber = 7;
		int evenNumber = 4;
		
		int isOdd = oddNumber % 2;
		int isEven = evenNumber % 2;
		
		System.out.println(isOdd);
		System.out.println(isEven);
		
		Fraction myFraction = new Fraction();
		Fraction myFraction2 = new Fraction();
		
		
		System.out.println(myFraction);
		System.out.println(myFraction2);
		
		myFraction.numerator = 3;
		myFraction2.numerator = 6;
		
		System.out.println(myFraction.numerator);
		System.out.println(myFraction2.numerator);
	}

}

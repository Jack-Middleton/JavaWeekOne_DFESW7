import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.factorials.Factorial;

public class Fact_Test {

	// we need a test that returns a factorial of a number if it exists, or none if
	// no factorial
	// for example 120 prints 5!

	@Test
	public void returnFactorial() {
		String result = Factorial.fact(120);
		assertEquals("5!", result);
	}

}

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.factorials.Doggo;

public class Doggo_Test {

	@Test
	public void shouldMatchArray() {

		ArrayList<String> results = Doggo.placement(1);
		boolean ifContains = results.contains("1st");

		assertEquals(false, ifContains);

	}

}

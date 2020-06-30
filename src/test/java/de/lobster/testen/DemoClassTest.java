package de.lobster.testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoClassTest {

	@Test
	void test() {
		DemoClass testClass = new DemoClass();
		
		assertEquals(6, testClass.execute(2, 3));
	}

}

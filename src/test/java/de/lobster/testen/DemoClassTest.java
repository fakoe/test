package de.lobster.testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoClassTest {

	@Test
	void test() {
		DemoClass testClass = new DemoClass();
		
		assertEquals(6, testClass.execute(2, 3));
	}
	
	@Test
	@DisplayName("This should fail")
	void test2() {
		DemoClass testClass = new DemoClass();
		
		assertEquals(8, testClass.execute(2, 4));
	}

}

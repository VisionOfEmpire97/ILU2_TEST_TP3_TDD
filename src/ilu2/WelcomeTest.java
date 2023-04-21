package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testWelcomeEX1() {
		assertEquals("Hello, Bob",Welcome.welcome("Bob"));
		assertEquals("Hello, Zorro",Welcome.welcome("Zorro"));
		assertEquals("Hello, Dante from DMC 5",Welcome.welcome("Dante from DMC 5"));
	}
	
	@Test
	void testWelcomeEX2() {
		assertEquals("Hello, my friend", Welcome.welcome("    "));
		assertEquals("Hello, my friend", Welcome.welcome(""));
	}
	
	@Test
	void testWelcomeEX3() {
		assertEquals("HELLO, JERRY !", Welcome.welcome("JERRY"));
		assertEquals("HELLO, DANTE FROM DMC !",
				Welcome.welcome("DANTE FROM DMC"));
		assertEquals("Hello, AMy", Welcome.welcome("AMy"));
	}
}

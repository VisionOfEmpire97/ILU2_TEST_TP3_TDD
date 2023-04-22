package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testWelcomeEX1() {
		assertEquals("Hello, Bob",Welcome.welcome("Bob"));
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
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
		assertEquals("HELLO, DANTE FROM DMC 5 !",
				Welcome.welcome("DANTE FROM DMC 5"));
		assertEquals("Hello, AMy", Welcome.welcome("AMy"));
	}
	
	@Test
	void testWelcomeEX4() {
		assertEquals("Hello, Johnson, Barry", 
				Welcome.welcome("Johnson,Barry"));
		assertEquals("Hello, Cena, John",
				Welcome.welcome(" Cena , John "));
		assertEquals("Hello, Juan, Pedro",Welcome.welcome("juan,pedro"));
		assertEquals("Hello, Dante from DMC5, Ada",
				Welcome.welcome("dante from DMC5, ada"));
	}
	
	@Test
	void tesWelcomeEX5() {
		assertEquals("Hello, Amy, Bob, Jerry",
				Welcome.welcome("Amy, bob,jerry"));
		assertEquals("Hello, Metzabok, No-hek, Mihira, Majira",
				Welcome.welcome("metzabok, no-hek, mihira,majira"));
	}
}

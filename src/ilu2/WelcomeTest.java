package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testWelcomeEX_1() {
		assertEquals("Hello, Bob",Welcome.welcome("Bob"));
		assertEquals("Hello, Zorro",Welcome.welcome("Zorro"));
		assertEquals("Hello, Dante from DMC 5",Welcome.welcome("Dante from DMC 5"));
		
	}

}

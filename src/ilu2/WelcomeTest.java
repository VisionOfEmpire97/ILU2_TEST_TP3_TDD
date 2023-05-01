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
		assertEquals("Hello, Johnson and Barry", 
				Welcome.welcome("Johnson,Barry"));
		assertEquals("Hello, Cena and John",
				Welcome.welcome(" Cena , John "));
		assertEquals("Hello, Juan and Pedro",Welcome.welcome("juan,pedro"));
		assertEquals("Hello, Dante from DMC5 and Ada",
				Welcome.welcome("dante from DMC5, ada"));
	}
	
	@Test
	void testWelcomeEX5() {
		assertEquals("Hello, Amy, Bob and Jerry",
				Welcome.welcome("Amy, bob,jerry"));
		assertEquals("Hello, Metzabok, No-hek, Mihira and Majira",
				Welcome.welcome("metzabok, no-hek, mihira,majira"));
	}
	
	@Test
	void testWelcomeEX6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !",
				Welcome.welcome("Amy, BOB, Jerry"));
		assertEquals("Hello, Sancho and Seth. AND HELLO, CLOUD !",
				Welcome.welcome("CLOUD,sancho, Seth"));
		
	}
	
	@Test
	void testWelcomeEX7() {
		assertEquals("Hello, Bob, Amy and Jerry",
				Welcome.welcome("bob,amy,jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !",
				Welcome.welcome("bob, AMY, jerry,JACK"));
		assertEquals("Hello, Pedro, Pablo, Piotr and Pamela. AND HELLO, DONALD, DEMITRI AND DVORAK !", 
				Welcome.welcome("pedro, DONALD, Pablo, DEMITRI, DVORAK, Piotr,Pamela"));
		assertEquals("Hello, John. AND HELLO, JOHNSON !",
				Welcome.welcome("john,JOHNSON"));
	}
	
	@Test
	void testWelcomeEX8() {
		assertEquals("Hello, Bob and Amy", Welcome.welcome("bob    , amy "));
		assertEquals("Hello, Riri, Fifi and Loulou", Welcome.welcome("    riri   , fifi   , Loulou   "));
	}
}

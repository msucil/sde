package dev.msucil.exercise.sde.general.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testIsPalindromeUsingReverseMethod() {
		
		assertEquals(true, Palindrome.isPalindromeUsingReverseMethod(121));
		
	}
	
	@Test
	void testIsPalindromeUsingReverseMethodShouldReturnFalse() {
		
		assertEquals(true, Palindrome.isPalindromeUsingReverseMethod(1241));
		
	}

}
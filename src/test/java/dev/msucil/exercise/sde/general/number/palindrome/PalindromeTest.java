package dev.msucil.exercise.sde.general.number.palindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testIsPalindromeUsingReverseMethodShouldReturnTrue() {

		assertEquals(true, Palindrome.isPalindromeUsingReverseMethod(121));

	}

	@Test
	void testIsPalindromeUsingReverseMethodShouldReturnTrueIfLessThan10() {

		assertEquals(true, Palindrome.isPalindromeUsingReverseMethod(1));

	}

	@Test
	void testIsPalindromeUsingReverseMethodShouldReturnFalse() {

		assertEquals(false, Palindrome.isPalindromeUsingReverseMethod(1241));

	}

	@Test
	void testIsPalindromeWithoutExtraSpaceShouldReturnFalse() {

		assertEquals(false, Palindrome.isPalindromeWithoutExtraSpacee(1241));

	}

	@Test
	void testIsPalindromeWithoutExtraSpaceShouldReturnTrue() {

		assertEquals(true, Palindrome.isPalindromeWithoutExtraSpacee(1));
	}

}
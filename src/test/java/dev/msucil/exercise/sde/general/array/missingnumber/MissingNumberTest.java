package dev.msucil.exercise.sde.general.array.missingnumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingNumberTest {

	@Test
	void testUsingHashingShouldReturnTrue() {
		assertEquals(8, MissingNumber.usingHashing(new int[] { 1, 3, 7, 5, 6, 2, 4, 9 }));

		assertEquals(0, MissingNumber.usingHashing(new int[] { 1, 3, 7, 5, 6, 2, 4 }));
	}

	@Test
	void testUsingSummationOfFirstNNaturalNumbersShouldReutrnTrue() {
		assertEquals(8, MissingNumber.usingSummationOfFirstNNaturalNumbers(new int[] { 1, 3, 7, 5, 6, 2, 4, 9 }));

		assertEquals(0, MissingNumber.usingSummationOfFirstNNaturalNumbers(new int[] { 1, 3, 7, 5, 6, 2, 4 }));
	}
	
	@Test
	void testResolvingIntegerOverflowShouldReutrnTrue() {
		assertEquals(8, MissingNumber.resolvingIntegerOverflow(new int[] { 1, 3, 7, 5, 6, 2, 4, 9 }));
		
		assertEquals(0, MissingNumber.resolvingIntegerOverflow(new int[] { 1, 3, 7, 5, 6, 2, 4 }));
	}

}

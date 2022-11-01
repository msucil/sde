package dev.msucil.exercise.sde.general.array.equilibrium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EqualSumTest {

	@Test
	void testFindElementPositionUsingLoopShouldReturn2() {
		assertEquals(2, EqualSum.findElementPositionUsingLoop(new int[] { 1, 4, 2, 5 }));
	}

	@Test
	void testFindElementPositionUsingLoopShouldReturnNegative() {
		assertEquals(-1, EqualSum.findElementPositionUsingLoop(new int[] { 1, 4, 2, 5, 8 }));
	}
	
	@Test
	void testFindElementPositionUsingPrefixSuffixSumShouldReturnNegative() {
		assertEquals(2, EqualSum.findElementPositionUsingPrefixSuffixSum(new int[] { 1, 4, 2, 5 }));
	}
	
	@Test
	void testFindElementPositionUsingSpaceEfficientShouldReturnNegative() {
		assertEquals(2, EqualSum.findElementPositionUsingSpaceEfficient(new int[] { 1, 4, 2, 5 }));
	}

}

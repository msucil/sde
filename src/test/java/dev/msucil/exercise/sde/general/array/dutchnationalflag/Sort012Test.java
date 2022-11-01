package dev.msucil.exercise.sde.general.array.dutchnationalflag;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Sort012Test {

	@Test
	void testusingPointerApproachShoudReturnTrue() {
		int[] arr = new int[] { 0, 1, 2, 0, 1, 2 };

		assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, Sort012.usingPointerApproach(arr));
	}

	@Test
	void testUsingCountingApproachShoudReturnTrue() {
		int[] arr = new int[] { 0, 1, 2, 0, 1, 2 };

		assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, Sort012.usingCountingApproach(arr));
	}

	@Test
	void testUsing01OnlyReturnTrue() {
		int[] arr = new int[] { 0, 0, 1, 1, 0, 1 };

		assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 1 }, Sort012.sort01Only(arr));
	}

}

package dev.msucil.exercise.sde.general.array;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LeaderInArrayTest {

	@Test
	void testGetLeaders() {
		var arr = new int[] { 16, 17, 4, 3, 5, 2 };

		var leaders = LeaderInArray.getLeaders(arr);

		assertIterableEquals(Arrays.asList(17, 5, 2), leaders);
	}

	@Test
	void testGetLeadersUsingSuffixMaximum() {
		var arr = new int[] { 16, 17, 4, 3, 5, 2 };

		var leaders = LeaderInArray.getLeadersUsingSuffixMaximum(arr);

		System.out.println(leaders);

		assertIterableEquals(Arrays.asList(2, 5, 17), leaders);
	}
}

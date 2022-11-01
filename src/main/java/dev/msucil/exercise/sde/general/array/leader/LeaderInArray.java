package dev.msucil.exercise.sde.general.array.leader;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author msucil
 * 
 *         Write a program to return all the LEADERS in the array. An element is
 *         a leader if it is greater than all the elements to its right side.
 *         And the rightmost element is always a leader.
 *
 *         https://www.geeksforgeeks.org/leaders-in-an-array/
 */
public class LeaderInArray {
	
	private LeaderInArray() {}

	public static List<Integer> getLeaders(int[] arr) {

		final List<Integer> leaders = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] <= arr[j]) {
					break;
				}

				if (j == (arr.length - 1)) {
					leaders.add(arr[i]);
				}
			}

			if (i == (arr.length - 1)) {
				leaders.add(arr[i]);
			}
		}

		return leaders;
	}

	public static List<Integer> getLeadersUsingSuffixMaximum(int[] arr) {

		List<Integer> leaders = new ArrayList<>();

		var suffixMax = arr[arr.length - 1];

		leaders.add(suffixMax);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (suffixMax < arr[i]) {
				suffixMax = arr[i];
				leaders.add(suffixMax);
			}

		}

		return leaders;
	}

}
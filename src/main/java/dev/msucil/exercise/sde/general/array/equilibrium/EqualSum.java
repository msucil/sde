package dev.msucil.exercise.sde.general.array.equilibrium;

import java.util.Arrays;
import java.util.List;

public class EqualSum {

	public static int findElementPositionUsingLoop(int[] numbers) {

		final List<Integer> nums = Arrays.stream(numbers).boxed().toList();

		for (int i = 1; i < numbers.length; i++) {

			int leftSum = nums.subList(0, i).stream().mapToInt(x -> x).sum();

			int rightSum = nums.subList(i + 1, numbers.length).stream().mapToInt(x -> x).sum();

			if (leftSum == rightSum) {
				return i;
			}
		}

		return -1;

	}

	public static int findElementPositionUsingPrefixSuffixSum(int[] numbers) {

		int[] prefixSum = new int[numbers.length];

		prefixSum[0] = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + numbers[i];
		}

		int[] suffixSum = new int[numbers.length];
		suffixSum[numbers.length - 1] = numbers[numbers.length - 1];

		for (int i = numbers.length - 2; i >= 0; i--) {
			suffixSum[i] = numbers[i] + suffixSum[i + 1];
		}

		for (int i = 0; i < numbers.length; i++) {
			if (prefixSum[i] == suffixSum[i]) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * We calculate the sum of the whole array except the first element in
	 * right_sum, considering it to be the partitioning element. Now, we traverse
	 * the array from left to right, subtracting an element from right_sum and
	 * adding an element to left_sum. At the point where right_sum equals left_sum,
	 * we get the partition.
	 * 
	 * @param numbers
	 * @return
	 */
	public static int findElementPositionUsingSpaceEfficient(int[] numbers) {
		int rightSum = 0, leftSum = 0;

		for (int i = 1; i < numbers.length; i++) {
			rightSum += numbers[i];
		}

		for (int i = 0; i < numbers.length; i++) {
			rightSum -= numbers[i+1];
			leftSum += numbers[i];
			
			if(rightSum == leftSum) {
				return i + 1;
			}
		}

		return -1;
	}
}

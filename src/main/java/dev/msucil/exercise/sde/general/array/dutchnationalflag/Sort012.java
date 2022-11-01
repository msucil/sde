package dev.msucil.exercise.sde.general.array.dutchnationalflag;

/***
 * 
 * @author msucil
 * 
 *         Given N balls of colour red, white or blue arranged in a line in
 *         random order. You have to arrange all the balls such that the balls
 *         with the same colours are adjacent with the order of the balls, with
 *         the order of the colours being red, white and blue (i.e., all red
 *         coloured balls come first then the white coloured balls and then the
 *         blue coloured balls).
 * 
 *         Ref: https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 *
 */
public class Sort012 {

	public static int[] usingPointerApproach(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		int temp;

		for (int i = 0; i <= high;) {

			if (arr[i] == 0) {

				temp = arr[low];
				arr[low] = arr[i];
				arr[i] = temp;

				low += 1;
				mid += 1;
				i++;
			} else if (arr[i] == 1) {
				mid++;
				i++;
			} else {
				temp = arr[i];
				arr[i] = arr[high];
				arr[high] = temp;
				high--;

			}
		}

		return arr;
	}

	public static int[] usingCountingApproach(int[] arr) {
		int count0 = 0, count1 = 0, count2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count0++;
			} else if (arr[i] == 1) {
				count1++;
			} else {
				count2++;
			}
		}

		int i = 0;
		while (count0 != 0) {
			arr[i] = 0;

			i++;
			count0--;
		}

		while (count1 != 0) {
			arr[i] = 1;

			i++;
			count1--;
		}

		while (count2 != 0) {
			arr[i] = 2;

			i++;
			count2--;
		}

		return arr;
	}

	public static int[] sort01Only(int[] arr) {
		int low = 0, high = arr.length - 1;
		int temp;

		for (int i = 0; i <= high;) {
			if (arr[i] == 0) {
				i++;
			} else {
				temp = arr[i];
				arr[i] = arr[high];
				arr[high] = temp;

				high--;
			}
		}

		return arr;

	}
}

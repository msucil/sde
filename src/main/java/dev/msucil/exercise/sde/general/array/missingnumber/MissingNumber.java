package dev.msucil.exercise.sde.general.array.missingnumber;

public class MissingNumber {

	/**
	 * 
	 * @param arr from 1 to N where N is the length of array and max integer item in
	 *            array
	 * @return
	 */
	public static int usingHashing(int[] arr) {
		int[] temp = new int[arr.length + 1];

		/**
		 * create array of N+1 and set value 0
		 */
		for (int i = 0; i <= arr.length; i++) {
			temp[i] = 0;
		}

		/**
		 * traverse given array and hash the value by adding array item - 1 which
		 * returns the index for which we set value one since the array must contain
		 * value from 1 to N the index of 0 value will be the missing item
		 */
		for (int i = 0; i < arr.length; i++) {

			temp[arr[i] - 1] = 1;
		}

		int missingNumber = 0;

		for (int i = 0; i <= arr.length; i++) {

			/**
			 * index of 0 value + 1 will be the missing value since we subtracted 1 from the
			 * given array and set 1 to that value index
			 */
			if (temp[i] == 0) {
				missingNumber = i + 1;
			}

		}

		/**
		 * return missingNumber is less than or equal to array length as max item is
		 * equal to array length otherwise return 0 since any max value greater than
		 * array length is not valid missing number
		 */
		return (arr.length >= missingNumber) ? missingNumber : 0;
	}

	/**
	 * 
	 * Formula for sum of first n natural number: ((n + 1) (n + 2)) / 2
	 * 
	 * @param arr
	 * @return
	 */
	public static int usingSummationOfFirstNNaturalNumbers(int[] arr) {
		int sumOfN = ((arr.length + 1) * (arr.length + 2)) / 2;
		int arraySum = 0;

		for (int i : arr) {
			arraySum += i;
		}

		int missingNumber = sumOfN - arraySum;

		return (arr.length >= missingNumber) ? missingNumber : 0;
	}
	
	
	public static int resolvingIntegerOverflow(int[] arr) {
		
		int total = 1;
		
		/**
		 *  in each iteration sum the index as there will be sequence of numbers to max N
		 *  and subtract the value in array with the sum
		 *  total result will be the missing number
		 */
		for(int i = 2; i <= (arr.length + 1); i ++) {
			total += i;
			total -= arr[i - 2];
		}
		
		
		return (arr.length >= total) ? total : 0;
	}

}

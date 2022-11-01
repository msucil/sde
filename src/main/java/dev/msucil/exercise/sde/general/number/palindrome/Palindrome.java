package dev.msucil.exercise.sde.general.number.palindrome;

public class Palindrome {

	private Palindrome() {
	}

	public static boolean isPalindromeUsingReverseMethod(int number) {

		if (number >= 0 && number < 10) {
			return true;
		}

		var reverseNumber = reverseNumber(Math.abs(number));

		return number == reverseNumber;
	}

	private static int reverseNumber(int num) {

		int reverseNumber = 0;

		while (num > 0) {
			reverseNumber = reverseNumber * 10 + (num % 10);
			num = num / 10;
		}

		return reverseNumber;
	}

	public static boolean isPalindromeWithoutExtraSpacee(int number) {

		number = Math.abs(number);
		
		int divisor = 1;

		while (number / divisor >= 10) {
			divisor *= 10;
		}

		while (number != 0) {
			int leading = number / divisor;
			int trailing = number % 10;

			if (leading != trailing) {
				return false;
			}

			// remove leading and trailing digit from number
			number = (number % divisor) / 10;

			// reduce divisor by a factor of 2 since 2 digits are removed from the number
			divisor = divisor / 100;

		}

		return true;
	}

}

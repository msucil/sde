package dev.msucil.exercise.sde.general.number;

public class Palindrome {

	private Palindrome() {
	}

	public static boolean isPalindromeUsingReverseMethod(int number) {

		if (number > 0 && number < 10) {
			return true;
		}

		var reverseNumber = reverseNumber(number);

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

}

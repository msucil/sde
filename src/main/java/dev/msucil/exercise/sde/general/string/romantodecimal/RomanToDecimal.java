package dev.msucil.exercise.sde.general.string.romantodecimal;

public class RomanToDecimal {

	public static int convert(String roman) {

		int total = 0;

		for (int i = 0; i < roman.length(); i++) {
			System.out.println(total);
			
			int value1 = decimalValue(roman.charAt(i));
			
			System.out.println("value1: " + value1 + ", " + roman.charAt(i));

			if (i + 1 < roman.length()) {
				int value2 = decimalValue(roman.charAt(i+1));
				
				System.out.println("value2: " + value2 + ", " + roman.charAt( i + 1));
				
				
				if(value1 >= value2) {
					total += value1;
				}
				else {
					total = total + value2 - value1;
					i++;
				}
				
			}
			else {
				total += value1;
			}
			
			System.out.println("after op total: " + total);

		}

		return total;
	}

	private static int decimalValue(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

}
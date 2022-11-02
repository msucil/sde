package dev.msucil.exercise.sde.general.string.romantodecimal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanToDecimalTest {

	@Test
	void testConvertShouldReturnTrue() {
		assertEquals(1904, RomanToDecimal.convert("MCMIV"));
	}

}

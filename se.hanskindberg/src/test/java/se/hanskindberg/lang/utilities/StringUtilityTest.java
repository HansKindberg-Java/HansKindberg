package se.hanskindberg.lang.utilities;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilityTest
{
	/* Methods - begin */

	@Test
	public void isNullOrEmptyShouldReturnFalseIfTheStringContainsWhiteSpaces()
	{
		assertFalse(StringUtility.isNullOrEmpty("   "));
	}

	@Test
	public void isNullOrEmptyShouldReturnFalseIfTheStringOnlyContainOneWhiteSpace()
	{
		assertFalse(StringUtility.isNullOrEmpty(" "));
	}

	@Test
	public void isNullOrEmptyShouldReturnTrueIfTheStringIsEmpty()
	{
		assertTrue(StringUtility.isNullOrEmpty(""));
	}

	@Test
	public void isNullOrEmptyShouldReturnTrueIfTheStringIsNull()
	{
		assertTrue(StringUtility.isNullOrEmpty(null));
	}

	/* Methods - end */
}
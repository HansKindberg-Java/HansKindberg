package se.hanskindberg.lang.extensions;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringExtensionTest
{
	/* Methods - begin */

	@Test
	public void isNullOrEmptyShouldReturnFalseIfTheStringContainsWhiteSpaces()
	{
		assertFalse(StringExtension.isNullOrEmpty("   "));
	}

	@Test
	public void isNullOrEmptyShouldReturnFalseIfTheStringOnlyContainOneWhiteSpace()
	{
		assertFalse(StringExtension.isNullOrEmpty(" "));
	}

	@Test
	public void isNullOrEmptyShouldReturnTrueIfTheStringIsEmpty()
	{
		assertTrue(StringExtension.isNullOrEmpty(""));
	}

	@Test
	public void isNullOrEmptyShouldReturnTrueIfTheStringIsNull()
	{
		assertTrue(StringExtension.isNullOrEmpty(null));
	}

	/* Methods - end */
}
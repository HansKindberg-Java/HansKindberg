package se.hanskindberg.lang.extensions;

public class StringExtension
{
	/* Constructors - begin */

	private StringExtension()
	{
		super();
	}

	/* Constructors - end */

	/* Methods - begin */

	public static Boolean isNullOrEmpty(String string)
	{
		return string == null || string.length() == 0;
	}

	/* Methods - end */
}
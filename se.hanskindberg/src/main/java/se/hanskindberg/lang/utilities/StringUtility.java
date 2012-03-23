package se.hanskindberg.lang.utilities;

public class StringUtility
{
	/* Constructors - begin */

	private StringUtility()
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
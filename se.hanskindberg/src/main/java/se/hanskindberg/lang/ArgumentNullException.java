package se.hanskindberg.lang;

import se.hanskindberg.lang.extensions.StringExtension;

public class ArgumentNullException extends IllegalArgumentException
{
	/* Fields - begin */

	private final String m_parameterName;

	/* Fields - end */

	/* Constructors - begin */

	public ArgumentNullException(String parameterName)
	{
		this(parameterName, null);
	}

	public ArgumentNullException(String parameterName, Throwable cause)
	{
		super(generateMessage(parameterName), cause);
		this.m_parameterName = parameterName;
	}

	/* Constructors - end */

	/* Methods - begin */

	private static String generateMessage(String parameterName)
	{
		return String.format("The parameter%s can not be null.", StringExtension.isNullOrEmpty(parameterName) ? "" : String.format(" \"%s\"", parameterName));
	}

	public String getParameterName()
	{
		return this.m_parameterName;
	}

	/* Methods - end */
}
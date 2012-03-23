package se.hanskindberg.lang.utilities;

import se.hanskindberg.lang.reflect.utilities.ConstructorUtility;

import java.lang.reflect.Constructor;

public class ClassUtility
{
	/* Constructors - begin */

	private ClassUtility()
	{
		super();
	}

	/* Constructors - end */

	/* Methods - begin */

	public static Constructor getConstructorWithMostParameters(Class theClass)
	{
		return getConstructorWithMostParameters(theClass.getConstructors());
	}

	protected static Constructor getConstructorWithMostParameters(Constructor[] constructors)
	{
		if (constructors == null || constructors.length == 0)
			return null;

		ConstructorUtility.sortByMostParameters(constructors, false);

		return constructors[0];
	}

	public static Constructor getDeclaredConstructorWithMostParameters(Class theClass)
	{
		return getConstructorWithMostParameters(theClass.getDeclaredConstructors());
	}

	/* Methods - end */
}
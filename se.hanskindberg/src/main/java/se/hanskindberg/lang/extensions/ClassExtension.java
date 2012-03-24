package se.hanskindberg.lang.extensions;

import se.hanskindberg.lang.reflect.extensions.ConstructorExtension;

import java.lang.reflect.Constructor;

public class ClassExtension
{
	/* Constructors - begin */

	private ClassExtension()
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

		ConstructorExtension.sortByMostParameters(constructors, false);

		return constructors[0];
	}

	public static Constructor getDeclaredConstructorWithMostParameters(Class theClass)
	{
		return getConstructorWithMostParameters(theClass.getDeclaredConstructors());
	}

	/* Methods - end */
}
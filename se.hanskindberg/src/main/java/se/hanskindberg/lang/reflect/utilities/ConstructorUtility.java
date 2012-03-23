package se.hanskindberg.lang.reflect.utilities;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;

public class ConstructorUtility
{
	/* Constructors - begin */

	private ConstructorUtility()
	{
		super();
	}

	/* Constructors - end */

	/* Methods - begin */

	public static void sortByMostParameters(Constructor[] constructors, final Boolean ascending)
	{
		Arrays.sort(constructors, new Comparator<Constructor>()
		{
			@Override
			public int compare(Constructor firstConstructor, Constructor secondConstructor)
			{
				Integer firstParameterCount = firstConstructor.getParameterTypes().length;
				Integer secondParameterCount = secondConstructor.getParameterTypes().length;

				return ascending ? firstParameterCount.compareTo(secondParameterCount) : secondParameterCount.compareTo(firstParameterCount);
			}
		});
	}

	/* Methods - end */
}
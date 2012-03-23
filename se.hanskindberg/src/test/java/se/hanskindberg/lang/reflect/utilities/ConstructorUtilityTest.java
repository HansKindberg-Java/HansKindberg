package se.hanskindberg.lang.reflect.utilities;

import org.junit.Test;
import se.hanskindberg.lang.utilities.mocks.TestClassWithUpToTenConstructorParameters;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertEquals;

public class ConstructorUtilityTest
{
	/* Methods - begin */

	@Test
	public void sortByMostParametersAscendingTest()
	{
		Constructor[] constructors = TestClassWithUpToTenConstructorParameters.class.getDeclaredConstructors();
		ConstructorUtility.sortByMostParameters(constructors, true);
		assertEquals(0, constructors[0].getParameterTypes().length);
		assertEquals(1, constructors[1].getParameterTypes().length);
		assertEquals(2, constructors[2].getParameterTypes().length);
		assertEquals(3, constructors[3].getParameterTypes().length);
		assertEquals(4, constructors[4].getParameterTypes().length);
		assertEquals(5, constructors[5].getParameterTypes().length);
		assertEquals(6, constructors[6].getParameterTypes().length);
		assertEquals(7, constructors[7].getParameterTypes().length);
		assertEquals(8, constructors[8].getParameterTypes().length);
		assertEquals(9, constructors[9].getParameterTypes().length);
		assertEquals(10, constructors[10].getParameterTypes().length);
	}

	@Test
	public void sortByMostParametersDescendingTest()
	{
		Constructor[] constructors = TestClassWithUpToTenConstructorParameters.class.getDeclaredConstructors();
		ConstructorUtility.sortByMostParameters(constructors, false);
		assertEquals(10, constructors[0].getParameterTypes().length);
		assertEquals(9, constructors[1].getParameterTypes().length);
		assertEquals(8, constructors[2].getParameterTypes().length);
		assertEquals(7, constructors[3].getParameterTypes().length);
		assertEquals(6, constructors[4].getParameterTypes().length);
		assertEquals(5, constructors[5].getParameterTypes().length);
		assertEquals(4, constructors[6].getParameterTypes().length);
		assertEquals(3, constructors[7].getParameterTypes().length);
		assertEquals(2, constructors[8].getParameterTypes().length);
		assertEquals(1, constructors[9].getParameterTypes().length);
		assertEquals(0, constructors[10].getParameterTypes().length);
	}

	/* Methods - end */
}

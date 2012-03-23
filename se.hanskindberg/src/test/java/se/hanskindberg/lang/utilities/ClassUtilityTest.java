package se.hanskindberg.lang.utilities;

import org.junit.Test;
import se.hanskindberg.lang.utilities.mocks.TestClassWithUpToTenConstructorParameters;

import static org.junit.Assert.assertEquals;

public class ClassUtilityTest
{
	/* Methods - begin */

	@Test
	public void getConstructorWithMostParametersTest()
	{
		assertEquals(6, ClassUtility.getConstructorWithMostParameters(TestClassWithUpToTenConstructorParameters.class).getParameterTypes().length);
	}

	@Test
	public void getDeclaredConstructorWithMostParametersTest()
	{
		assertEquals(10, ClassUtility.getDeclaredConstructorWithMostParameters(TestClassWithUpToTenConstructorParameters.class).getParameterTypes().length);
	}

	@Test
	public void prerequisitesTest()
	{
		assertEquals(11, TestClassWithUpToTenConstructorParameters.class.getDeclaredConstructors().length);
		assertEquals(3, TestClassWithUpToTenConstructorParameters.class.getConstructors().length);
	}

	/* Methods - end */
}
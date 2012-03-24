package se.hanskindberg.lang.extensions;

import org.junit.Test;
import se.hanskindberg.lang.extensions.mocks.TestClassWithUpToTenConstructorParameters;

import static org.junit.Assert.assertEquals;

public class ClassExtensionTest
{
	/* Methods - begin */

	@Test
	public void getConstructorWithMostParametersTest()
	{
		assertEquals(6, ClassExtension.getConstructorWithMostParameters(TestClassWithUpToTenConstructorParameters.class).getParameterTypes().length);
	}

	@Test
	public void getDeclaredConstructorWithMostParametersTest()
	{
		assertEquals(10, ClassExtension.getDeclaredConstructorWithMostParameters(TestClassWithUpToTenConstructorParameters.class).getParameterTypes().length);
	}

	@Test
	public void prerequisitesTest()
	{
		assertEquals(11, TestClassWithUpToTenConstructorParameters.class.getDeclaredConstructors().length);
		assertEquals(3, TestClassWithUpToTenConstructorParameters.class.getConstructors().length);
	}

	/* Methods - end */
}
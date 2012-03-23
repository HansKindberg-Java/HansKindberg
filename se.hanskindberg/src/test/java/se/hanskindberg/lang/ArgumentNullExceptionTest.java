package se.hanskindberg.lang;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ArgumentNullExceptionTest
{
	/* Methods - begin */

	@Test
	public void getLocalizedMessageShouldIncludeTheParameterNameIfTheParameterNameIsNotNullOrEmpty()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException("TestParameterName");
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException("TestParameterName", null);
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException("TestParameterName", new RuntimeException());
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException("TestParameterName", new RuntimeException("Test"));
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getLocalizedMessage());
	}

	@Test
	public void getLocalizedMessageShouldNotIncludeTheParameterNameIfTheParameterNameIsEmpty()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException("");
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException("", null);
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException("", new RuntimeException());
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException("", new RuntimeException("Test"));
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());
	}

	@Test
	public void getLocalizedMessageShouldNotIncludeTheParameterNameIfTheParameterNameIsNull()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException(null);
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException(null, null);
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException(null, new RuntimeException());
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());

		argumentNullException = new ArgumentNullException(null, new RuntimeException("Test"));
		assertEquals("The parameter can not be null.", argumentNullException.getLocalizedMessage());
	}

	@Test
	public void getMessageShouldIncludeTheParameterNameIfTheParameterNameIsNotNullOrEmpty()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException("TestParameterName");
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException("TestParameterName", null);
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException("TestParameterName", new RuntimeException());
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException("TestParameterName", new RuntimeException("Test"));
		assertEquals("The parameter \"TestParameterName\" can not be null.", argumentNullException.getMessage());
	}

	@Test
	public void getMessageShouldNotIncludeTheParameterNameIfTheParameterNameIsEmpty()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException("");
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException("", null);
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException("", new RuntimeException());
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException("", new RuntimeException("Test"));
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());
	}

	@Test
	public void getMessageShouldNotIncludeTheParameterNameIfTheParameterNameIsNull()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException(null);
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException(null, null);
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException(null, new RuntimeException());
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());

		argumentNullException = new ArgumentNullException(null, new RuntimeException("Test"));
		assertEquals("The parameter can not be null.", argumentNullException.getMessage());
	}

	@Test
	public void getParameterNameShouldReturnTheParameterNameSetInTheConstructor()
	{
		ArgumentNullException argumentNullException = new ArgumentNullException(null);
		assertNull(argumentNullException.getParameterName());

		argumentNullException = new ArgumentNullException(null, new RuntimeException());
		assertNull(argumentNullException.getParameterName());

		argumentNullException = new ArgumentNullException("");
		assertEquals("", argumentNullException.getParameterName());

		argumentNullException = new ArgumentNullException("", new RuntimeException());
		assertEquals("", argumentNullException.getParameterName());

		argumentNullException = new ArgumentNullException("Test");
		assertEquals("Test", argumentNullException.getParameterName());

		argumentNullException = new ArgumentNullException("Test", new RuntimeException());
		assertEquals("Test", argumentNullException.getParameterName());
	}

	/* Methods - end */
}
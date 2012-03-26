package se.hanskindberg.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult<TValidatedObject> implements IValidationResult<TValidatedObject>
{
	/* Fields - begin */

	private List<Exception> m_exceptions;
	private Boolean m_isValid;
	private TValidatedObject m_validatedObject;

	/* Fields - end */

	/* Constructors - begin */

	public ValidationResult()
	{
		this(true, new ArrayList<Exception>());
	}

	public ValidationResult(IValidationResult validationResultToCopy)
	{
		this(validationResultToCopy.isValid(), validationResultToCopy.getExceptions());
	}

	public ValidationResult(Boolean isValid, List<Exception> exceptions)
	{
		this(isValid, exceptions, null);
	}

	public ValidationResult(Boolean isValid, List<Exception> exceptions, TValidatedObject validatedObject)
	{
		this.m_exceptions = exceptions;
		this.m_isValid = isValid;
		this.m_validatedObject = validatedObject;
	}

	/* Constructors - end */

	/* Methods - begin */

	@Override
	public List<Exception> getExceptions()
	{
		if (this.m_exceptions == null)
			this.m_exceptions = new ArrayList<Exception>();

		return this.m_exceptions;
	}

	public TValidatedObject getValidatedObject()
	{
		return this.m_validatedObject;
	}

	@Override
	public Boolean isValid()
	{
		if (this.m_isValid == null)
			this.m_isValid = false;

		return this.m_isValid;
	}

	@Override
	public void setExceptions(Exception[] exceptions)
	{
		if (exceptions == null)
		{
			this.m_exceptions = null;
			return;
		}

		this.m_exceptions = new ArrayList<Exception>();

		for (Exception exception : exceptions)
		{
			this.m_exceptions.add(exception);
		}
	}

	@Override
	public void setValid(Boolean isValid)
	{
		this.m_isValid = isValid;
	}

	@Override
	public void setValidatedObject(TValidatedObject validatedObject)
	{
		this.m_validatedObject = validatedObject;
	}

	/* Methods - end */
}
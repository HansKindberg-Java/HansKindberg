package se.hanskindberg.validation;

import java.util.List;

public interface IValidationResult<TValidatedObject>
{
	/* Methods - begin */

	List<Exception> getExceptions();
	TValidatedObject getValidatedObject();
	Boolean isValid();
	void setExceptions(Exception[] exceptions);
	void setValid(Boolean isValid);
	void setValidatedObject(TValidatedObject validatedObject);

	/* Methods - end */
}


package constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EmailConstraintValidator implements
		ConstraintValidator<Email, String> {

	@Override
	public void initialize(Email params) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		int atIndex = value.indexOf("@");
		if (atIndex == -1)
			return false;
		int lastDotIndex = value.lastIndexOf(".");
		if (lastDotIndex < atIndex)
			return false;
		return true;
	}

}

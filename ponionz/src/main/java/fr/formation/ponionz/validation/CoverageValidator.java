package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LendingCreate;

public class CoverageValidator implements ConstraintValidator<Coverage, LendingCreate> {

    @Override
    public boolean isValid(LendingCreate value, ConstraintValidatorContext context) {

	if (value.isLostJobInsurance()) {
	    return true;
	} else {
	    return false;
	}

    }

}

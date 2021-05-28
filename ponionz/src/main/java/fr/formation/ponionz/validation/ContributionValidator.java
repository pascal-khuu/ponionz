package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.LendingCreate;

public class ContributionValidator implements ConstraintValidator<Contribution, LendingCreate> {

    @Override
    public boolean isValid(LendingCreate value, ConstraintValidatorContext context) {

	return (value.getContribution() <= 0.5 * value.getBorrowAmount());
    }

}

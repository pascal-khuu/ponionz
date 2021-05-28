package fr.formation.ponionz.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// personal annotation 
// error if the contribution is greater than 50% borrowAmount
@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = { ContributionValidator.class })
public @interface Contribution {
    String message() default "the contribution is greater than 50% borrowAmount";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

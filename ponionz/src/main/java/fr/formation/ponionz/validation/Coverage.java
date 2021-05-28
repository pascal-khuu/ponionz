package fr.formation.ponionz.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// personal annotation 
// error if the lostJobInsurance is not checked
@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = { CoverageValidator.class })
public @interface Coverage {
    // if the case is not checked
    String message() default "the lostJobInsurance is not checked";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

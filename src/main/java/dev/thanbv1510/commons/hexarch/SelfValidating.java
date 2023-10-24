package dev.thanbv1510.commons.hexarch;

import jakarta.validation.*;

import java.util.Set;

/**
 * @author ThanBV
 * @since 1.0
 */
public abstract class SelfValidating<T> {
    private final Validator validator;

    protected SelfValidating() {
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            validator = factory.getValidator();
        }
    }

    /**
     * Evaluates all Bean Validations on the attributes of this instance.
     */
    @SuppressWarnings("unchecked")
    protected void validateSelf() {
        Set<ConstraintViolation<T>> violations = validator.validate((T) this);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}

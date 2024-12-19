package com.gavaskar.emoApp.Constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PancardValidatio implements ConstraintValidator<Pan, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

}

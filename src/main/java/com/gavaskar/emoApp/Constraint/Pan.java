package com.gavaskar.emoApp.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy = PancardValidatio.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Pan {
	String message () default " Pan Not valid ";
	Class <?> [] groups() default{};
	Class<? extends Payload> [] payload() default{};

}

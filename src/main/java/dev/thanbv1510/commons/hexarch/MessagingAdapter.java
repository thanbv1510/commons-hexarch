package dev.thanbv1510.commons.hexarch;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Indicates that an annotated class is a "messaging adapter"
 *
 * @author ThanBV
 * @see Component
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MessagingAdapter {
    @AliasFor(annotation = Component.class)
    String value() default "";
}

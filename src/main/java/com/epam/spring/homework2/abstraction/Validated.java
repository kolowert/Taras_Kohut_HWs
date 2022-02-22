package com.epam.spring.homework2.abstraction;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that component will be validated before collecting in context by
 * ValidatorBeanPostProcessor.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Validated {
}

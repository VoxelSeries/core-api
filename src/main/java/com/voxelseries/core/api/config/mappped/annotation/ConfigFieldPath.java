package com.voxelseries.core.api.config.mappped.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigFieldPath {
    String value();
}

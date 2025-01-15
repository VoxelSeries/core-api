package com.voxelseries.core.api.config.mappped.annotation;

import org.intellij.lang.annotations.Pattern;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigPath {
    @Pattern("[a-zA-Z0-9_/]+")
    String value();
}

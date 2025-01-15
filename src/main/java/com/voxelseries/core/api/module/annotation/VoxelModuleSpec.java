package com.voxelseries.core.api.module.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface VoxelModuleSpec {
    String name();
    String version() default "";
    String[] authors() default {};
    VoxelModuleDependency[] dependencies() default {};
}

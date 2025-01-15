package com.voxelseries.core.api.module.annotation;

public @interface VoxelModuleDependency {
    String value();
    String version() default "*";
}

package com.voxielseries.core.api.module.annotation;

public @interface VoxelModuleDependency {
    String name();
    String version() default "*";
}

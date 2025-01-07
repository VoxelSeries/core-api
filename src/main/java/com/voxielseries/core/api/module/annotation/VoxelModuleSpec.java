package com.voxielseries.core.api.module.annotation;

public @interface VoxelModuleSpec {
    String name();
    String version() default "";
    String[] authors() default {};
    VoxelModuleDependency[] dependencies() default {};
}

package com.voxelseries.core.api.config;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class AbstractMultiFileElement<K, V> implements ConfigElement {
    protected Map<K, V> files;

    public static final MethodHandle FILES_SETTER;

    static {
        try {
            FILES_SETTER = MethodHandles.lookup().findSetter(
                    AbstractMultiFileElement.class,
                    "files",
                    Map.class
            );
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to initialize FILES_SETTER", e);
        }
    }
}

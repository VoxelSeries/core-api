package com.voxelseries.core.api.config;

import java.util.function.Consumer;

/**
 * References to latest config object of T
 * You can listen to config changes
 */
public interface ConfigReference<T> {
    T get();

    void onPreReload(Consumer<T> consumer);
    void onPostReload(Consumer<T> consumer);
}

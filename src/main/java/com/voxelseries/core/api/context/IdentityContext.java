package com.voxelseries.core.api.context;

import org.jetbrains.annotations.Nullable;

/**
 * Used to get the target of an identity
 * It can be used for players, groups, etc.
 *
 * @param <TARGET>
 */
public interface IdentityContext<TARGET> {
    @Nullable
    TARGET target();

    IdentityContextKeyProvider provider();

    <T> T get(IdentityContextKey<T> key);

    <T> T set(IdentityContextKey<T> key, T value);

    <T> T setWeak(IdentityContextKey<T> key, T value);
}

package com.voxelseries.core.api.config.mappped.context;

import net.endergrid.atom.typetoken.TypeToken;

import java.util.Optional;

public interface ConfigMappedContextRead extends ConfigMappedContext {

    void addError(String error);
    void addError(Throwable throwable);

    boolean hasErrors();

    <T> T read();

    default <T> T read(Class<T> type, Object ...path) {
        return this.read(TypeToken.convert(type), path);
    }

    <T> T read(TypeToken<T> typeToken, Object ...path);

    default <T> Optional<T> readOptional(Class<T> type, Object ...path) {
        return this.readOptional(TypeToken.convert(type), path);
    }

    <T> Optional<T> readOptional(TypeToken<T> typeToken, Object ...path);

    <T> T instantiate(Class<T> clazz);

    <T> T getInstance(Class<T> type);
}

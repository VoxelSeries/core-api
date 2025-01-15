package com.voxelseries.core.api.config.mappped.codec;

import lombok.SneakyThrows;
import net.endergrid.atom.typetoken.TypeToken;
import net.endergrid.atom.typetoken.TypeTokenMatcher;
import org.spongepowered.configurate.ConfigurationNode;

public interface ConfigCodecRegistry {
    <T> void register(TypeTokenMatcher<?> typeTokenMatcher, ConfigCodec<T> codec);

    <T> ConfigCodec<? super T> find(TypeToken<?> typeToken);

    @SneakyThrows
    <T> T read(ConfigurationNode node, TypeToken<T> typeToken, Object ...basePath);
}

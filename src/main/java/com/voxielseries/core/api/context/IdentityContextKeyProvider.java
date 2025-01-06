package com.voxielseries.core.api.context;

import lombok.NonNull;

public interface IdentityContextKeyProvider {
    <T> IdentityContextKey<T> get(@NonNull String key);
}

package com.voxelseries.core.api.item;

import dev.oop778.blixx.api.component.BlixxComponent;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import java.util.function.UnaryOperator;

public interface ItemBuilderUnified<MATERIAL, ITEM> {
    @CheckReturnValue
    ItemBuilderUnified<MATERIAL, ITEM> withAmount(int amount);

    @CheckReturnValue
    ItemBuilderUnified<MATERIAL, ITEM> withMaterial(MATERIAL material);

    @CheckReturnValue
    ItemBuilderUnified<MATERIAL, ITEM> withDisplayName(@Nullable BlixxComponent component);

    @CheckReturnValue
    ItemBuilderUnified<MATERIAL, ITEM> withLore(@Nullable BlixxComponent component);

    @CheckReturnValue
    ItemBuilderUnified<MATERIAL, ITEM> withPostBuildTransformer(UnaryOperator<ITEM> postBuild);

    @CheckReturnValue
    ITEM build();
}

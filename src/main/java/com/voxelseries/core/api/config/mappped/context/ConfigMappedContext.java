package com.voxelseries.core.api.config.mappped.context;

import net.endergrid.atom.typetoken.TypeToken;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.configurate.ConfigurationNode;

import java.util.Stack;
import java.util.function.Supplier;

public interface ConfigMappedContext {
    // Get current working node
    @Nullable
    ConfigurationNode currentNode();

    // either file name, section key or collection index
    Stack<Object> currentPath();

    // Keys till current node
    Stack<Object> configKeys();

    // What type token are we writing, reading?
    TypeToken<?> expectedTypeToken();

    void expectTypeToken(TypeToken<?> typeToken);
    void enterPath(Object path);

    void enterPathAct(Object path, Runnable onPath);

    <T> T enterPathSupplying(Object path, Supplier<T> onPath);

    void enterNode(Object path);
    void currentNode(ConfigurationNode node);

    void exitPath();
    void exitNode();

    void exit();
}

package com.voxelseries.core.api.variable;

import com.voxelseries.core.api.context.IdentityContext;
import lombok.NonNull;
import org.intellij.lang.annotations.Pattern;

import java.util.function.Function;
import java.util.function.Supplier;

public interface Variables<CONTEXT extends IdentityContext<?>> {
    VariableCreation<CONTEXT> newVariable(@Pattern("[a-z_0-9.]+") String key);

    interface VariableCreation<CONTEXT extends IdentityContext<?>> {
        void constant(@NonNull Object value);

        void supplied(Supplier<@NonNull Object> valueSupplier);

        void extracted(Function<CONTEXT, @NonNull Object> extractor);
    }
}

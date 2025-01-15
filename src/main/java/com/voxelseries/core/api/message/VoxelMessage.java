package com.voxelseries.core.api.message;

import dev.oop778.blixx.api.component.BlixxComponent;
import dev.oop778.blixx.api.placeholder.BlixxPlaceholder;
import dev.oop778.blixx.api.replacer.ReplaceActionCaller;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.sound.Sound;

import java.time.Duration;

public interface VoxelMessage {
    void send(Audience audience, BlixxPlaceholder<?>... placeholders);

    void send(Audience audience, ReplaceActionCaller actionCaller);

    interface Builder<B extends Builder<B>> {
        B withSound(Sound sound);

        VoxelMessage build();
    }

    interface TitleBuilder extends Builder<TitleBuilder> {
        TitleBuilder withTitle(BlixxComponent blixxComponent);

        TitleBuilder withSubtitle(BlixxComponent blixxComponent);

        TitleBuilder withFadeIn(Duration duration);

        TitleBuilder withFadeOut(Duration duration);

        TitleBuilder withStay(Duration duration);
    }

    interface ActionBarBuilder extends Builder<ActionBarBuilder> {
        ActionBarBuilder withMessage(BlixxComponent blixxComponent);
    }

    interface ChatBuilder extends Builder<ChatBuilder> {
        ChatBuilder withMessage(BlixxComponent blixxComponent);
    }
}

package com.voxelseries.core.api.message;

public interface VoxelMessageBuilderFactory {
    VoxelMessage.TitleBuilder createTitle();
    VoxelMessage.ChatBuilder createChat();
    VoxelMessage.ActionBarBuilder createActionBar();
}

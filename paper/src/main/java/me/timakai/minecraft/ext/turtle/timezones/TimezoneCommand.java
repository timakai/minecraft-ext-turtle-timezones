package me.timakai.minecraft.ext.turtle.timezones;

import com.mojang.brigadier.builder.*;
import com.mojang.brigadier.tree.*;
import io.papermc.paper.command.brigadier.*;
import org.jspecify.annotations.*;

@NullMarked
public interface TimezoneCommand {

    static LiteralCommandNode<CommandSourceStack> create() {
        return root().build();
    }

    static LiteralArgumentBuilder<CommandSourceStack> root() {
        return Commands.literal("timezone");
    }
}

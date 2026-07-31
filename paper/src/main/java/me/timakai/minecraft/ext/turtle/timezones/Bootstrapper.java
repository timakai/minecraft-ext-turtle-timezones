package me.timakai.minecraft.ext.turtle.timezones;

import io.papermc.paper.plugin.bootstrap.*;
import io.papermc.paper.plugin.lifecycle.event.*;
import io.papermc.paper.plugin.lifecycle.event.handler.configuration.*;
import io.papermc.paper.plugin.lifecycle.event.types.*;
import java.util.concurrent.*;
import org.bukkit.plugin.java.*;
import org.jetbrains.annotations.*;

@SuppressWarnings({"UnstableApiUsage", "unused"})
public final class Bootstrapper implements PluginBootstrap {

    @Override
    public void bootstrap(@NotNull BootstrapContext context) {
        var lifecycleManager = context.getLifecycleManager();
        lifecycleManager.registerEventHandler(createCommandsEventHandler());
    }

    private static LifecycleEventHandlerConfiguration<@NotNull LifecycleEventOwner> createCommandsEventHandler() {
        var command = CompletableFuture.supplyAsync(TimezoneCommand::create);
        return LifecycleEvents.COMMANDS.newHandler(event -> event.registrar().register(command.join()));
    }

    @Override
    public @NotNull JavaPlugin createPlugin(@NotNull PluginProviderContext context) {
        return new Main(context.getLogger());
    }
}

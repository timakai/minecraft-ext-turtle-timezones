package me.timakai.minecraft.ext.turtle.timezones.plugin;

import io.papermc.paper.plugin.bootstrap.*;
import io.papermc.paper.plugin.lifecycle.event.*;
import io.papermc.paper.plugin.lifecycle.event.handler.configuration.*;
import io.papermc.paper.plugin.lifecycle.event.types.*;
import java.util.concurrent.*;
import me.timakai.minecraft.ext.turtle.timezones.*;
import org.bukkit.plugin.java.*;
import org.jspecify.annotations.*;

@NullMarked
@SuppressWarnings({"UnstableApiUsage", "unused"})
public final class Bootstrapper implements PluginBootstrap {

    @Override
    public void bootstrap(BootstrapContext context) {
        var lifecycleManager = context.getLifecycleManager();
        lifecycleManager.registerEventHandler(createCommandsEventHandler());
    }

    private static LifecycleEventHandlerConfiguration<LifecycleEventOwner> createCommandsEventHandler() {
        var command = CompletableFuture.supplyAsync(TimezoneCommand::create);
        return LifecycleEvents.COMMANDS.newHandler(event -> event.registrar().register(command.join()));
    }

    @Override
    public JavaPlugin createPlugin(PluginProviderContext context) {
        return new Main(context.getLogger());
    }
}

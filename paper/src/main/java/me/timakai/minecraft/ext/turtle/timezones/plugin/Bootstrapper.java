package me.timakai.minecraft.ext.turtle.timezones.plugin;

import io.papermc.paper.plugin.bootstrap.*;
import io.papermc.paper.plugin.lifecycle.event.*;
import io.papermc.paper.plugin.lifecycle.event.handler.configuration.*;
import io.papermc.paper.plugin.lifecycle.event.types.*;
import java.nio.file.*;
import java.util.concurrent.*;
import me.timakai.minecraft.ext.turtle.timezones.*;
import me.timakai.minecraft.ext.turtle.timezones.core.*;
import org.bukkit.plugin.java.*;
import org.jdbi.v3.core.*;
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
        Path storePath = context.getDataDirectory().resolve("store.db");
        String connectionString = "jdbc:sqlite:" + storePath;
        
        Jdbi jdbi = Jdbi.create(connectionString);
        JdbiConfig.applyTo(jdbi);

        return new Main(context.getLogger(), jdbi);
    }
}

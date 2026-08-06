package me.timakai.minecraft.ext.turtle.timezones.plugin;

import lombok.*;
import net.kyori.adventure.text.logger.slf4j.*;
import org.bukkit.plugin.java.*;
import org.jdbi.v3.core.*;
import org.jspecify.annotations.*;

@NullMarked
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class Main extends JavaPlugin {

    private final ComponentLogger logger;
    private final Jdbi jdbi;
}

package me.timakai.minecraft.ext.turtle.timezones;

import net.kyori.adventure.text.logger.slf4j.*;
import org.bukkit.plugin.java.*;

public final class Main extends JavaPlugin {

    private final ComponentLogger logger;

    Main(ComponentLogger logger) {
        this.logger = logger;
    }
}

package io.github.username.template;

import io.github.username.template.log.*;
import net.kyori.adventure.text.logger.slf4j.*;
import org.bukkit.plugin.java.*;

public final class Main extends JavaPlugin {

    public static final String NAMESPACE = "template";
    private final ComponentLogger logger;

    Main(ComponentLogger logger) {
        this.logger = logger;
    }


    @Override
    public void onEnable() {
        logger.info(Messages.WELCOME);
    }
}

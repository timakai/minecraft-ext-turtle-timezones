package me.timakai.minecraft.ext.turtle.timezones.core;

import org.jdbi.v3.core.*;
import org.jdbi.v3.sqlite3.*;
import org.jdbi.v3.sqlobject.*;
import org.jdbi.v3.sqlobject.locator.*;

public interface JdbiConfig {

    static void applyTo(Jdbi jdbi) {
        jdbi.installPlugin(new SQLitePlugin());
        jdbi.installPlugin(new SqlObjectPlugin());
        jdbi.configure(SqlObjects.class, JdbiConfig::configureSqlObjects);
    }

    private static void configureSqlObjects(SqlObjects config) {
        config.setSqlLocator(new SqlObjectClasspathSqlLocator());
    }
}

package me.timakai.minecraft.ext.turtle.timezones;

import io.papermc.paper.plugin.loader.*;
import io.papermc.paper.plugin.loader.library.impl.*;
import org.eclipse.aether.artifact.*;
import org.eclipse.aether.graph.*;
import org.eclipse.aether.repository.*;
import org.jspecify.annotations.*;

@SuppressWarnings({"UnstableApiUsage", "unused"})
public final class Loader implements PluginLoader {

    @Override
    public void classloader(@NonNull PluginClasspathBuilder classpathBuilder) {
        var defaultRepositoryMirror = new RemoteRepository.Builder("central", "default", MavenLibraryResolver.MAVEN_CENTRAL_DEFAULT_MIRROR).build();
        var resolver = new MavenLibraryResolver();

        resolver.addRepository(defaultRepositoryMirror);
        resolver.addDependency(new Dependency(new DefaultArtifact("org.jdbi:jdbi3-core:3.54.0"), null));

        classpathBuilder.addLibrary(resolver);
    }
}

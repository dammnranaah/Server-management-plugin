package com.dammnranaah.adminessentials;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

public class AdminEssentials extends JavaPlugin {

    private static AdminEssentials instance;

    public static AdminEssentials getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getLogger().info("AdminEssentials enabled.");
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        getLogger().info("AdminEssentials disabled.");
    }

    private void registerCommands() {
        // Commands will be registered here as they are implemented
        // Example:
        // getCommand("vanish").setExecutor(new VanishCommand());
    }

    private void registerListeners() {
        // Event listeners will be registered here as needed
        // Example:
        // Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    public FileConfiguration getCfg() {
        return this.getConfig();
    }
}

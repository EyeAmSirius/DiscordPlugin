package com.reddawn.discord;

import org.bukkit.plugin.java.JavaPlugin;

public class DiscordTsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("ts").setExecutor(new TsCommand());
        getCommand("site").setExecutor(new SiteCommand());
        getLogger().info("DiscordPlugin activé !");
    }

    @Override
    public void onDisable() {
        getLogger().info("DiscordPlugin désactivé !");
    }
}
package me.geuxy;

import me.geuxy.command.impl.BroadcastCommand;
import me.geuxy.command.impl.ReloadCommand;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Broadcast extends JavaPlugin {

    private static Broadcast instance;

    private boolean papiCompatible;

    @Override
    public void onEnable() {
        instance = this;

        // Check if server has PlaceholderAPI plugin
        this.papiCompatible = Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null;

        // Initialize commands
        new BroadcastCommand();
        new ReloadCommand();
    }

    public static Broadcast getInstance() {
        return instance;
    }

    public boolean isPapiCompatible() {
        return papiCompatible;
    }

}

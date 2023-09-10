package me.geuxy;

import me.geuxy.command.impl.BroadcastCommand;
import me.geuxy.command.impl.ReloadCommand;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Broadcast extends JavaPlugin {

    private static Broadcast instance;

    private boolean papi;

    @Override
    public void onEnable() {
        instance = this;

        this.papi = Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null;

        Broadcast.getInstance().getCommand("broadcast").setExecutor(new BroadcastCommand());
        Broadcast.getInstance().getCommand("broadcast-reload").setExecutor(new ReloadCommand());
    }

    public static Broadcast getInstance() {
        return instance;
    }

    public boolean isPapi() {
        return papi;
    }

}

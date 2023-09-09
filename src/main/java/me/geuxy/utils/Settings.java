package me.geuxy.utils;

import me.geuxy.Broadcast;

import java.util.List;

public enum Settings {

    // Prefix just for looks n stuff idk
    PREFIX("prefix"),

    // List of strings sent when broadcast command is ran
    MESSAGE("message"),

    // Message sent when plugin has been reloaded by command
    RELOAD("reload"),

    PLAYER_ONLY("player-only");

    private final String prefix;

    Settings(final String prefix) {
        this.prefix = prefix;
    }

    // Casts value to string
    public String castString() {
        return Broadcast.getInstance().getConfig().getString(prefix);
    }

    // Casts value to string list
    public List<String> castStringList() {
        return Broadcast.getInstance().getConfig().getStringList(prefix);
    }

}

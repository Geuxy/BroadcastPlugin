package me.geuxy.utils;

import me.geuxy.Broadcast;

import java.util.List;

public enum Settings {

    PREFIX("prefix"),

    MESSAGE("message"),

    RELOAD("reload"),

    PLAYER_ONLY("player-only");

    private final String prefix;

    Settings(final String prefix) {
        this.prefix = prefix;
    }

    public String stringValue() {
        return Broadcast.getInstance().getConfig().getString(prefix);
    }

    public List<String> stringListValue() {
        return Broadcast.getInstance().getConfig().getStringList(prefix);
    }

}

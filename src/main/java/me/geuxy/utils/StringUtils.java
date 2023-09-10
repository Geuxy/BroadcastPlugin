package me.geuxy.utils;

import me.clip.placeholderapi.PlaceholderAPI;
import me.geuxy.Broadcast;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class StringUtils {

    public static String format(String string) {
        return format(null, string, "");
    }

    public static String format(Player player, String string, String msg) {
        if(!msg.equals("")) {
            string = string.replace("{message}", msg);
        }

        if(Broadcast.getInstance().isPapi() && player != null) {
            string = PlaceholderAPI.setPlaceholders(player, string);
        }

        string = string.replace("{prefix}", Settings.PREFIX.stringValue());

        return ChatColor.translateAlternateColorCodes('&', string);
    }

}

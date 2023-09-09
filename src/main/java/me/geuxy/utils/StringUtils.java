package me.geuxy.utils;

import me.clip.placeholderapi.PlaceholderAPI;
import me.geuxy.Broadcast;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class StringUtils {

    // Translates color codes and sets local and PAPI placeholders
    public static String format(String string) {
        return format(null, string, "");
    }

    // Translates color codes and sets local and PAPI placeholders
    public static String format(Player player, String string, String msg) {

        // Replaces {message} with the args sent by broadcast command
        if(!msg.equals("")) {
            string = string.replace("{message}", msg);
        }

        // Replaces {prefix} to the prefix value in config.
        string = string.replace("{prefix}", Settings.PREFIX.castString());

        // Sets PAPI placeholders
        if(Broadcast.getInstance().isPapiCompatible() && player != null) {
            string = PlaceholderAPI.setPlaceholders(player, string);
        }

        // Replace & char with section sign
        return ChatColor.translateAlternateColorCodes('&', string);
    }

}

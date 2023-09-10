package me.geuxy.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MessageUtils {

    public static void sendBroadcast(CommandSender sender, String line, String message) {
        Bukkit.broadcastMessage(StringUtils.format((Player) sender, line, message));
    }

    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(StringUtils.format(message));
    }

}

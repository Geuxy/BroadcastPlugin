package me.geuxy.command.impl;

import me.geuxy.command.AbstractCommand;
import me.geuxy.utils.Settings;
import me.geuxy.utils.StringUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand extends AbstractCommand {

    public BroadcastCommand() {
        super("broadcast", false);
    }

    @Override
    public void handle(CommandSender sender, String[] args) {
        String message = "";

        int i = 0;
        for(String arg : args) {
            if(i != 0) {
                message += " ";
            }
            message += arg;
            i++;
        }

        for(String line : Settings.MESSAGE.castStringList()) {
            Bukkit.broadcastMessage(StringUtils.format((Player) sender, line, message));
        }
    }

}

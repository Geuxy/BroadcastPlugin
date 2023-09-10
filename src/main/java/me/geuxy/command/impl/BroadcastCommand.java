package me.geuxy.command.impl;

import me.geuxy.command.ICommand;
import me.geuxy.utils.MessageUtils;
import me.geuxy.utils.Settings;

import org.bukkit.command.CommandSender;

public class BroadcastCommand implements ICommand {

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

        for(String line : Settings.MESSAGE.stringListValue()) {
            MessageUtils.sendBroadcast(sender, line, message);
        }
    }

    @Override
    public boolean allowConsole() {
        return false;
    }

}

package me.geuxy.command.impl;

import me.geuxy.Broadcast;
import me.geuxy.command.ICommand;
import me.geuxy.utils.MessageUtils;
import me.geuxy.utils.Settings;

import org.bukkit.command.CommandSender;

public class ReloadCommand implements ICommand {

    @Override
    public void handle(CommandSender sender, String[] args) {
        Broadcast.getInstance().reloadConfig();
        MessageUtils.sendMessage(sender, Settings.RELOAD.stringValue());
    }

    @Override
    public boolean allowConsole() {
        return true;
    }

}

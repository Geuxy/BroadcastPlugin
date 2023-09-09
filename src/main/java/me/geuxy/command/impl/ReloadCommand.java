package me.geuxy.command.impl;

import me.geuxy.Broadcast;
import me.geuxy.command.AbstractCommand;
import me.geuxy.utils.Settings;

import me.geuxy.utils.StringUtils;
import org.bukkit.command.CommandSender;

public class ReloadCommand extends AbstractCommand {

    public ReloadCommand() {
        super("broadcast-reload");
    }

    @Override
    public void handle(CommandSender sender, String[] args) {
        Broadcast.getInstance().reloadConfig();
        sender.sendMessage(StringUtils.format(Settings.RELOAD.castString()));
    }

}

package me.geuxy.command;

import me.geuxy.utils.Settings;
import me.geuxy.utils.StringUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public interface ICommand extends CommandExecutor {

    void handle(CommandSender sender, String[] args);

    boolean allowConsole();

    @Override
    default boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!allowConsole() && sender.equals(Bukkit.getServer().getConsoleSender())) {
            sender.sendMessage(StringUtils.format(Settings.PLAYER_ONLY.stringValue()));
            return true;
        }
        this.handle(sender, args);
        return true;
    }

}

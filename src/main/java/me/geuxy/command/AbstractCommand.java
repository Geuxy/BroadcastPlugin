package me.geuxy.command;

import me.geuxy.Broadcast;

import me.geuxy.utils.Settings;
import me.geuxy.utils.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class AbstractCommand implements CommandExecutor {

    private boolean console;

    public AbstractCommand(String name, boolean console) {
        // Automatically adds the command once the constructors initialized
        Broadcast.getInstance().getCommand(name).setExecutor(this);
        this.console = console;
    }

    // Function that's used when player enters command, just making it look a bit nice
    public abstract void handle(CommandSender sender, String[] args);

    // Handles command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!console && sender.equals(Bukkit.getServer().getConsoleSender())) {
            sender.sendMessage(StringUtils.format(Settings.PLAYER_ONLY.castString()));
            return true;
        }
        this.handle(sender, args);
        return true;
    }

}

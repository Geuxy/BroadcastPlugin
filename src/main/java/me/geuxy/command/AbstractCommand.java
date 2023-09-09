package me.geuxy.command;

import me.geuxy.Broadcast;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class AbstractCommand implements CommandExecutor {

    public AbstractCommand(String name) {

        // Automatically adds the command once the constructors initialized
        Broadcast.getInstance().getCommand(name).setExecutor(this);
    }

    // Function that's used when player enters command, just making it look a bit nice
    public abstract void handle(CommandSender sender, String[] args);

    // Handles command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        this.handle(sender, args);
        return true;
    }

}

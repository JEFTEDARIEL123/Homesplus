package org.jeft.homes.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jeft.homes.Homesplus;

public class SetHome implements CommandExecutor{

    private Homesplus plugin;
    public SetHome(Homesplus plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + plugin.name + " You can't do that through the console" + ChatColor.RED);
            return false;
        } else {
            Player jugador = (Player) sender;
            jugador.sendTitle("Has sido llevado a","",10,40,10);
            return true;
        }
    }
}

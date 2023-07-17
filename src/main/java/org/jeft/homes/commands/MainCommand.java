package org.jeft.homes.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jeft.homes.Homesplus;

public class MainCommand implements CommandExecutor {

    private Homesplus plugin;
    public MainCommand(Homesplus plugin){
        this.plugin = plugin;
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + plugin.name + " You can't do that through the console" + ChatColor.RED);
            return false;
        } else {
            Player jugador = (Player) sender;
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("version")) {
                    jugador.sendMessage(ChatColor.YELLOW+"[!]"+ChatColor.WHITE+" You are running Homesplus version " + plugin.version);
                    return true;
                }
                else if(args[0].equalsIgnoreCase("spawn")){
                    Location l = new Location(jugador.getWorld(),0,100,0,0,0); // X, Y, Z, YAW, PITCH
                    jugador.teleport(l);
                    return true;
                }
                else if(args[0].equalsIgnoreCase("reload")){
                    plugin.reloadConfig();
                    jugador.sendMessage(ChatColor.YELLOW+"[!]"+ChatColor.WHITE+" Has been reloaded");
                    return true;
                }

                else {
                    jugador.sendMessage(ChatColor.YELLOW+"[!]"+ChatColor.WHITE+" Invalid command, use /homesplus help");
                    return true;
                }

            } else {
                jugador.sendMessage(ChatColor.YELLOW+"[!]"+ChatColor.WHITE+" There are missing arguments, use /homesplus help");
                return true;
            }
        }
    }
}

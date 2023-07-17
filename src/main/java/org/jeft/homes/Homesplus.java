package org.jeft.homes;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jeft.homes.commands.SetHome;

public final class Homesplus extends JavaPlugin {
    PluginDescriptionFile confile = getDescription();
    public String version = confile.getVersion();
    public String name = confile.getName();
    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "====================================================");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + name + " Has been enabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Version: " + version);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Thanks for using my plugin!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "My githup profile: https://github.com/JEFTEDARIEL123");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "====================================================");
        CommandRegister();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "====================================================");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Homesplus Has been disabled.");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Version: " + version);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "See you soon!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "====================================================");
    }

    public void CommandRegister(){
        this.getCommand("sethome").setExecutor(new SetHome(this));
    }
}

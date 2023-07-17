package org.jeft.homes.events;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jeft.homes.Homesplus;

public class Jointp implements Listener {
    private Homesplus plugin;
    public Jointp(Homesplus plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void whenJoin(PlayerJoinEvent event){
        Player jugador = event.getPlayer();

        FileConfiguration config = plugin.getConfig();
        String path = "Config.welcome";
        if (config.getString(path).equals("true")){
            String text = "Config.welcome-msg";
            jugador.sendMessage(config.getString(text));
        }

        return;
    }
}

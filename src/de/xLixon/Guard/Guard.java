package de.xLixon.Guard;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Guard implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();

        if(p.getOpenInventory().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Shop")){
            e.setCancelled(true);
        }else{
            return;
        }



    }


}

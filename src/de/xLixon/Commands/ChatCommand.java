package de.xLixon.Commands;

import de.xLixon.apis.ReturnItem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class ChatCommand implements CommandExecutor {
    int i1 = 0;
    int i2 = 17;


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (args.length > 0) {
            sender.sendMessage(ChatColor.RED + "Wrong Syntax: /shop");
            return false;
        }

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein, um diesen Befehl ausführen zu können!");
            return false;
        } else {
            Player p = (Player) sender;
            Inventory shopInv = Bukkit.createInventory(p, InventoryType.CHEST, ChatColor.AQUA + "Shop");

            while (i1 <= 9) {
                shopInv.setItem(i1, ReturnItem.addItem(Material.GRAY_STAINED_GLASS_PANE, ChatColor.RED + ""));
                i1++;
            }

            shopInv.setItem(10, ReturnItem.addItem(Material.NETHERITE_SCRAP, ChatColor.BLACK + "Netherite Scrap :> " + ChatColor.AQUA + "5 Diamonds"));
            shopInv.setItem(11, ReturnItem.addItem(Material.DIAMOND, ChatColor.AQUA + "Diamond :> " + ChatColor.GRAY + "5 Iron Ingots"));

            while (i2 <= 26) {
                shopInv.setItem(i2, ReturnItem.addItem(Material.GRAY_STAINED_GLASS_PANE, ""));
                i2++;
            }

            p.openInventory(shopInv);

// Hallo
// Hallo
// Hallo
        }

        return false;
    }


}

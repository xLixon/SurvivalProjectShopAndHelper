package de.xLixon.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;

public class ResetWorld implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player){
            sender.sendMessage(ChatColor.DARK_RED + "Aus Sicherheitsgründen musst du die Konsole sein, um diesen Command ausführen zu können!");
        }else{
            if(args.length < 1){
                sender.sendMessage(ChatColor.DARK_RED + "Um das Löschen der Welt zu bestätigen, gib " + ChatColor.GREEN + "/resetworld confirm" + ChatColor.DARK_RED + " ein");
            }else{
                if(args[0].equalsIgnoreCase("confirm")){

                    File overworld = new File("world");
                    File worldNether = new File("world_nether");
                    File worldEnd = new File("world_the_end");

                    overworld.delete();
                    worldNether.delete();
                    worldEnd.delete();

                    sender.sendMessage(ChatColor.GREEN + "Folgende Maps wurden gelöscht: \n \"overworld\", \n \"world_nether\", \n \"world_the_end\". \n Diese wurden unwiederruflich gelöscht.");
                    for(Player all : Bukkit.getOnlinePlayers()){
                        all.sendMessage(ChatColor.DARK_RED + "Die Konsole hat Folgende Welten gelöscht: \n -\"overworld\", \n -\"world_nether\", \n -\"world_the_end\"");
                        all.sendMessage(ChatColor.DARK_RED + "Um die Änderungen zu übernehmen, wird der Server nun neugestartet. \n Alle Spielstände wurde " + ChatColor.GREEN + "erfolgreich" + ChatColor.DARK_RED + "gelöscht.");
                        all.kickPlayer(ChatColor.RED + "Die Map wurde zurückgesetzt. \n" + ChatColor.AQUA + "Viel Spaß mit der neuen Map!");

                    }
                    Bukkit.shutdown();

                }
            }
                    }

        return false;
    }
}

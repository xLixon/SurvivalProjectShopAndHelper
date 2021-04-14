package de.xLixon.yHighPing.Main;


import de.xLixon.Commands.ChatCommand;
import de.xLixon.Commands.ResetWorld;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;

    public void onEnable() {
        registerEvents(Bukkit.getPluginManager());
        getLogger().info(ChatColor.GREEN + "SurvivalProjectHelper by xLixon and yHighPing started successfully");
        RegisterCommands.registerCommands();
        getCommand("shop").setExecutor(new ChatCommand());
        getCommand("resetworld").setExecutor(new ResetWorld());
    }

    public void onDisable() {
        getLogger().info(ChatColor.DARK_RED + "SurvivalProjectHelper by xLixon and yHighPing stopped successfully");
    }

    public void registerEvents(PluginManager pm) {
    	pm.registerEvents(new OPTimOnJoin(), this);
	}

	// hallo


}

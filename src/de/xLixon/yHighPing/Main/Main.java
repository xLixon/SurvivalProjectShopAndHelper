package de.xLixon.yHighPing.Main;


import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{

	public static Main instance;

	public void onEnable() {
		registerEvents(Bukkit.getPluginManager());
		getLogger().info(ChatColor.GREEN + "SurvivalProjectHelper by xLixon and yHighPing started successfully");
		RegisterCommands.registerCommands();
	}
	
	public void onDisable() {
		getLogger().info(ChatColor.DARK_RED + "SurvivalProjectHelper by xLixon and yHighPing stopped successfully");
	}
	
	public void registerEvents(PluginManager pm) {
	}



}

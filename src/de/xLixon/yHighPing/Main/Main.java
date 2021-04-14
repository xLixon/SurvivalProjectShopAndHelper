package de.xLixon.yHighPing.Main;


import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		registerEvents(Bukkit.getPluginManager());

	}
	
	public void onDisable() {
	}
	
	public void registerEvents(PluginManager pm) {
	}

}

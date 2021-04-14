package de.xLixon.yHighPing.Main;

import de.xLixon.Commands.ChatCommand;

public class RegisterCommands {

    public static void registerCommands() {
        Main.instance.getCommand("shop").setExecutor(new ChatCommand());
    }
}

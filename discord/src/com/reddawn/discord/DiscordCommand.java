package com.reddawn.discord;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {

    private final String discordLink = "https://discord.gg/t3HjJvQ5WA";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage("§aRejoins notre Discord : §b" + discordLink);
        } else {
            sender.sendMessage("Discord : " + discordLink);
        }

        return true;
    }
}

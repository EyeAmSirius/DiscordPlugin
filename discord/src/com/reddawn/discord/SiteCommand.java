package com.reddawn.discord;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SiteCommand implements CommandExecutor {

    private final String siteUrl = "https://www.reddawn-pvp.com/";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage("§aVisite notre site : §b" + siteUrl);
        } else {
            sender.sendMessage("Site : " + siteUrl);
        }

        return true;
    }
}
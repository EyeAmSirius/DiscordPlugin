package com.reddawn.discord;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TsCommand implements CommandExecutor {

    private final String tsIp = "reddawn-pvp.skailarhost.com";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage("§aAdresse TeamSpeak : §b" + tsIp);
        } else {
            sender.sendMessage("TeamSpeak : " + tsIp);
        }

        return true;
    }
}

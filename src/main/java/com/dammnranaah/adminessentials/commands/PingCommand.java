package com.dammnranaah.adminessentials.commands;

import com.dammnranaah.adminessentials.util.PingUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("adminessentials.ping")) {
            sender.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }
        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /ping <player>");
            return true;
        }
        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found.");
            return true;
        }
        int ping = PingUtil.getPing(target);
        if (ping < 0) {
            sender.sendMessage(ChatColor.RED + "Unable to retrieve ping.");
        } else {
            sender.sendMessage(ChatColor.YELLOW + target.getName() + "'s ping: " + ChatColor.GREEN + ping + "ms");
        }
        return true;
    }
}

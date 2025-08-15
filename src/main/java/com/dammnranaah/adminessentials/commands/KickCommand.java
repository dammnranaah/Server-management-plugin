package com.dammnranaah.adminessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("adminessentials.kick")) {
            sender.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }
        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /kick <player> [reason]");
            return true;
        }
        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found.");
            return true;
        }
        String reason = args.length > 1 ? ChatColor.translateAlternateColorCodes('&', String.join(" ", java.util.Arrays.copyOfRange(args, 1, args.length))) : "Kicked by an operator.";
        target.kickPlayer(reason);
        Bukkit.broadcastMessage(ChatColor.YELLOW + target.getName() + " was kicked. Reason: " + ChatColor.RESET + reason);
        return true;
    }
}

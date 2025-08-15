package com.dammnranaah.adminessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.stream.Collectors;

public class WhoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("adminessentials.who")) {
            sender.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }
        int count = Bukkit.getOnlinePlayers().size();
        String list = Bukkit.getOnlinePlayers().stream()
                .map(Player::getName)
                .collect(Collectors.joining(ChatColor.GRAY + ", " + ChatColor.RESET));
        sender.sendMessage(ChatColor.YELLOW + "Online (" + count + "): " + ChatColor.RESET + list);
        return true;
    }
}

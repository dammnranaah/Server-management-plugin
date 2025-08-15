package com.dammnranaah.adminessentials.commands;

import com.dammnranaah.adminessentials.AdminEssentials;
import com.dammnranaah.adminessentials.manager.VanishManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {

    private final VanishManager vanishManager;

    public VanishCommand(VanishManager vanishManager) {
        this.vanishManager = vanishManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command.");
            return true;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("adminessentials.vanish")) {
            p.sendMessage(ChatColor.RED + "No permission.");
            return true;
        }
        boolean newState = !vanishManager.isVanished(p);
        vanishManager.setVanished(p, newState);
        p.sendMessage(ChatColor.YELLOW + "Vanish " + (newState ? ChatColor.GREEN + "enabled" : ChatColor.RED + "disabled"));
        return true;
    }
}

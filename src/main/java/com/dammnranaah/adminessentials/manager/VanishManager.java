package com.dammnranaah.adminessentials.manager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class VanishManager {
    private final Set<UUID> vanished = new HashSet<>();

    public boolean isVanished(Player p) {
        return vanished.contains(p.getUniqueId());
    }

    public void setVanished(Player p, boolean vanish) {
        if (vanish) {
            vanished.add(p.getUniqueId());
            for (Player other : Bukkit.getOnlinePlayers()) {
                if (!other.equals(p)) other.hidePlayer(p);
            }
        } else {
            vanished.remove(p.getUniqueId());
            for (Player other : Bukkit.getOnlinePlayers()) {
                if (!other.equals(p)) other.showPlayer(p);
            }
        }
    }

    public Set<UUID> getVanished() {
        return Collections.unmodifiableSet(vanished);
    }
}

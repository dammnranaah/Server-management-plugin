package com.dammnranaah.adminessentials.util;

import org.bukkit.entity.Player;

public class PingUtil {
    public static int getPing(Player player) {
        try {
            Object craftPlayer = player;
            // In 1.8.8, CraftPlayer has getHandle() returning EntityPlayer with public int ping
            Object handle = craftPlayer.getClass().getMethod("getHandle").invoke(craftPlayer);
            return (int) handle.getClass().getField("ping").get(handle);
        } catch (Exception e) {
            return -1;
        }
    }
}

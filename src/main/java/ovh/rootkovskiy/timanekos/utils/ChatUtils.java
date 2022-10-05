package ovh.rootkovskiy.timanekos.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ovh.rootkovskiy.timanekos.cfgmanager.ConfigManager;

public class ChatUtils {
    public static String format(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static void sendMessage(CommandSender target, String message) {
        target.sendMessage(format(ConfigManager.getPrefix()) + format(message));
    }

    public static void sendTitle(Player player, String title, String subtitle, int fi, int stay, int fo) {
        player.sendTitle(format(title), format(subtitle), fi, stay, fo);
    }
}

package ovh.rootkovskiy.timanekos.utils;

import org.bukkit.ChatColor;

public class ColorUtils {
    public static String format(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}

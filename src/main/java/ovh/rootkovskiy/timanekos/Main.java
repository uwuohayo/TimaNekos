package ovh.rootkovskiy.timanekos;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ovh.rootkovskiy.timanekos.utils.ConsoleUtils;

public final class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled");
        System.out.println(ConsoleUtils.ANSI_GREEN + "#-#-#-#-#-#-#-#-#" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "TimaNekos " + getDescription().getVersion() + " Loaded and Enabled!" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "MC Core Version: " + Bukkit.getBukkitVersion() + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "Author: Timur Rootkovskiy (Adminov)" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "VK: @timurroot" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_GREEN + "#-#-#-#-#-#-#-#-#" + ConsoleUtils.ANSI_RESET);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
        System.out.println(ConsoleUtils.ANSI_GREEN + "#-#-#-#-#-#-#-#-#" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "TimaNekos " + getDescription().getVersion() + " Disabled!" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "MC Core Version: " + Bukkit.getBukkitVersion() + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "Author: Timur Rootkovskiy (Adminov)" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "VK: @timurroot" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_CYAN + "Goodbye ;p" + ConsoleUtils.ANSI_RESET);
        System.out.println(ConsoleUtils.ANSI_GREEN + "#-#-#-#-#-#-#-#-#" + ConsoleUtils.ANSI_RESET);
    }
}

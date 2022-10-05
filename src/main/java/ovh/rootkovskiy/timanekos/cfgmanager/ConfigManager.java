package ovh.rootkovskiy.timanekos.cfgmanager;

import ovh.rootkovskiy.timanekos.Main;

public class ConfigManager {
    private static String prefix = Main.getInstance().getConfig().getString("PREFIX");
    public static String getPrefix() {
        return prefix;
    }
    private static String noPerms = Main.getInstance().getConfig().getString("NO_PERMS");
    public static String getNoPerms() {
        return noPerms;
    }
    private static String noPlayer = Main.getInstance().getConfig().getString("NO_PLAYER");
    public static String getNoPlayer() {
        return noPlayer;
    }
    private static String invalidUsage = Main.getInstance().getConfig().getString("INVALID_USAGE");
    public static String getInvalidUsage() {
        return invalidUsage;
    }
    private static String nekoOn = Main.getInstance().getConfig().getString("NEKO_ON");
    public static String getNekoOn() {
        return nekoOn;
    }
    private static String nekoOff = Main.getInstance().getConfig().getString("NEKO_OFF");
    public static String getNekoOff() {
        return nekoOff;
    }
    public static void reload() {

    }
}

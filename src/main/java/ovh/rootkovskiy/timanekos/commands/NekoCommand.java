package ovh.rootkovskiy.timanekos.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ovh.rootkovskiy.timanekos.cfgmanager.ConfigManager;
import ovh.rootkovskiy.timanekos.utils.ChatUtils;

public class NekoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            ChatUtils.sendMessage(sender, ConfigManager.getNoPlayer());
            return true;
        }

        if (!(sender.hasPermission("neko.use"))) {
            ChatUtils.sendMessage(sender, ConfigManager.getNoPerms());
        }

        if (args.length != 1) {
            ChatUtils.sendMessage(sender, ConfigManager.getInvalidUsage());
        }

        return true;
    }
}

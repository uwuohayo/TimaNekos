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
            return true;
        }

        if (args.length != 1) {
            ChatUtils.sendMessage(sender, ConfigManager.getInvalidUsage());
            return true;
        }

        Player player = (Player) sender;

        switch (args[0].toLowerCase()) {
            case "on":
                ChatUtils.sendMessage(player, ConfigManager.getNekoOn());
                //todo: start neko mechanics
                return true;
            case "off":
                ChatUtils.sendMessage(player, ConfigManager.getNekoOff());
                //todo stop neko mechanics
                return true;
            case "add":

                return true;
            case "remove":

                return true;
        }
        return true;
    }
}

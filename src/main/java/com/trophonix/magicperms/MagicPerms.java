package com.trophonix.magicperms;

import co.aikar.commands.BukkitCommandManager;
import com.trophonix.magicperms.commands.MagicPermsCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class MagicPerms extends JavaPlugin {

    private BukkitCommandManager commandManager;

    @Override
    public void onEnable() {
        commandManager = new BukkitCommandManager(this);
        commandManager.registerCommand(new MagicPermsCommand());
    }

}

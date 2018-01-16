package com.trophonix.magicperms.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

@CommandAlias("magicperms|mperms|mp")
public class MagicPermsCommand extends BaseCommand {

    @Subcommand("user|u")
    public class UserSubCommand {

        @Subcommand("add|a")
        public void addSubCommand(CommandSender sender, String playerName, String permission) {
            // Add permission to player
        }

    }

}

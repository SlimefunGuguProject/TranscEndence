package me.sfiguz7.transcendence.implementation.core.commands;

import io.github.thebusybiscuit.slimefun4.libraries.dough.common.ChatColors;
import me.sfiguz7.transcendence.TranscEndence;
import me.sfiguz7.transcendence.implementation.items.items.Daxi;
import me.sfiguz7.transcendence.implementation.listeners.TranscEndenceGuideListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Set;
import java.util.UUID;

public class TranscEndenceCommand implements CommandExecutor {

    @Override
    // TODO: sort this mess into subcommands because it's getting obnoxious
    // TODO: move all sender.sendMessage's to some structured, cleaned up place
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("guide")
                && sender instanceof Player) {
                Player p = (Player) sender;
                p.getInventory().addItem(TranscEndenceGuideListener.getGuide());
            } else if (args[0].equalsIgnoreCase("walkthrough")) {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.GRAY +
                    "https://github.com/Sfiguz7/TranscEndence/wiki/Walkthrough-guide-thingy");
            } else if (args[0].equalsIgnoreCase("list")) {
                Set<UUID> uuids =
                        TranscEndence.getRegistry().getDaxiEffectPlayers().keySet();
                StringBuilder list = new StringBuilder().append(ChatColor.LIGHT_PURPLE);
                if (uuids.isEmpty()) {
                    list.append("没有玩家拥有超能力核心!");
                } else {
                    for (UUID uuid : uuids) {
                        list.append(Bukkit.getOfflinePlayer(uuid).getName()).append(' ');
                    }
                }
                sender.sendMessage(list.toString());
            } else {
                sendHelp(sender);
            }
        } else if (args.length == 2) {
            if (args[0].equalsIgnoreCase("reapply")) {
                if (sender.hasPermission("te.command.reapply")) {
                    Player p = Bukkit.getPlayer(args[1]);
                    if (p != null) {
                        Set<Daxi.Type> effects =
                            TranscEndence.getRegistry().getDaxiEffectPlayers().get(p.getUniqueId());
                        if (effects != null) {
                            StringBuilder message = new StringBuilder("已重新应用: ");
                            for (Daxi.Type t : effects) {
                                message.append(" ").append(t);
                            }
                            Bukkit.getScheduler().runTask(TranscEndence.getInstance(), () -> Daxi.reapplyEffects(p));
                            sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED +
                                message);

                        } else {
                            sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED +
                                "该玩家没有超能力核心!");
                        }
                    } else {
                        sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED + "玩家不存在!");
                    }
                } else {
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED +
                        "你没有权限!");
                }
            } else if (args[0].equalsIgnoreCase("toggle")) {
                if (sender.hasPermission("te.command.toggle")) {
                    Player p = Bukkit.getPlayer(args[1]);
                    if (p != null) {
                        Set<UUID> toggledPlayers = TranscEndence.getRegistry().getToggledPlayers();
                        UUID uuid = p.getUniqueId();
                        if (toggledPlayers.contains(uuid)) {
                            toggledPlayers.remove(uuid);
                            Bukkit.getScheduler().runTask(TranscEndence.getInstance(), () -> Daxi.reapplyEffects(p));
                            sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED +
                                "玩家的超能力核心效果刷新已启用: " + p.getDisplayName());
                        } else {
                            toggledPlayers.add(uuid);
                            sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED +
                                "玩家的超能力核心效果刷新已禁用: " + p.getDisplayName());
                        }
                    } else {
                        sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED + "玩家不存在!");
                    }
                } else {
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + "末地科技 > " + ChatColor.RED +
                        "你没有权限!");
                }
            }
        } else {
            sendHelp(sender);
        }
        return true;
    }

    public void sendHelp(CommandSender sender) {
        sender.sendMessage("");
        sender.sendMessage(ChatColors.color("&a末地科技 &2v" + TranscEndence.getVersion()));

        sender.sendMessage(ChatColors.color("&3/te guide &b") + "获得末地科技指南");
        sender.sendMessage(ChatColors.color("&3/te walkthrough &b") + "前往Wiki进一步了解");
        if (sender.hasPermission("te.command.reapply")) {
            sender.sendMessage(ChatColors.color("&3/te reapply <name> &b") + "重新给指定玩家应用超能力核心");
        }
        if (sender.hasPermission("te.command.toggle")) {
            sender.sendMessage(ChatColors.color("&3/te toggle <name> &b") + "开启/关闭指定玩家的超能力核心检测");
        }
    }

}


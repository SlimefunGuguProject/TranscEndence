package me.sfiguz7.transcendence.implementation.listeners;

import io.github.thebusybiscuit.slimefun4.libraries.dough.common.ChatColors;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;
import java.util.List;

public class TranscEndenceGuideListener implements Listener {

    private final boolean giveOnFirstJoin;

    public TranscEndenceGuideListener(boolean giveOnFirstJoin) {
        this.giveOnFirstJoin = giveOnFirstJoin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (giveOnFirstJoin && !e.getPlayer().hasPlayedBefore()) {
            Player p = e.getPlayer();

            p.getInventory().addItem(getGuide());
        }
    }

    public static ItemStack getGuide() {
        List<String> pages = new ArrayList<>();
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta meta = (BookMeta) book.getItemMeta();
        meta.setTitle("末地科技指南书");
        meta.setAuthor("作者:Sfiguz7 汉化:baoad, ybw0014");
        //Page 3 has an extra space after "Polarizer" otherwise "in" gets cut
        pages.add(ChatColors.color("你好!这是关于末地科技的指南.\n\n" +
            "&r首先，你需要获得&a粒子&r。你可以通过通过&9粒子生产机&r来获得&a粒子&r" +
            "&r注意，&9粒子生产机&r只能在末地使用!"));
        pages.add(ChatColors.color("你可以从粒子生产机中得到4种不同的粒子: Up, Down 水平粒子, Left, " +
            "Right 垂直粒子.\n\n" +
            "你可以让粒子生产机产生水平粒子和垂直粒子." +
            "通过两种不同的&d偏振器&r来增加对应粒子的生成几率."));
        pages.add(ChatColors.color("&4不稳定的锭:" +
            "小心点,如果拿着它超过了一定时间,那么它会&c杀了&r你,并且物品会永远消失.\n\n" +
            "建议你用货运来运输."));
        pages.add(ChatColors.color("&r在&a粒子过载机&r在里面放入未充能的粒子" +
            "用来给粒子充能.\n\n" +
            "粒子过载机方向相同的粒子的比率是1:1如果它们的方向不同，比率则是16:1."));
        pages.add(ChatColors.color("&a超能力核心&r是末地科技的终极目标: 它们可以给你提供不同的" +
            "药水效果,持续到你死亡.\n" +
            "效果列表图:\n" +
            "(S) - 力量 3\n" +
            "(A) - 伤害吸收 5\n" +
            "(F) - 抗性提升 4\n" +
            "(H) - 饱和\n" +
            "(R) - 生命恢复 2\n"));
        pages.add(ChatColors.color("死亡的时候,所有的超能力效果将会消失." +
            "这意味着只能从头开始." +
            "只能重新制作超能力核心."));
        meta.setPages(pages);
        book.setItemMeta(meta);
        return book;

    }
}

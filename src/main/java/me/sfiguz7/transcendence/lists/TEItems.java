package me.sfiguz7.transcendence.lists;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.sfiguz7.transcendence.TranscEndence;
import me.sfiguz7.transcendence.implementation.utils.TranscendenceLoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class TEItems {

    /* QoL info item */
    // Credits to @NCBPFluffy for the idea, people appreciate it so adding to this too
    public static final SlimefunItemStack TE_INFO = new SlimefunItemStack("TE_INFO",
        Material.WRITTEN_BOOK,
        "&5末地科技指南书",
        "",
        "&e" + TranscEndence.getInstance().getName() + " " + TranscEndence.getInstance().getPluginVersion(),
        "",
        "&e/te guide &7给你一本指南书",
        "&e/te walkthrough &7来深入了解",
        "&7guide/walkthrough 链接"
    );


    /* Category */
    public static final ItemGroup transcendence = new ItemGroup(new NamespacedKey(TranscEndence.getInstance(),
        "transcendence"),
        new CustomItemStack(Material.PURPUR_BLOCK, "&5TranscEndence(末地科技)")
    );
    /* Items */
    public static final SlimefunItemStack QUIRP_UP = new SlimefunItemStack("QUIRP_UP",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2M0ZDdhM2JjM2RlODMzZDMwMzJlODVhMGJmNmYyYmVmNzY4Nzg2MmIzYzZiYzQwY2U3MzEwNjRmNjE1ZGQ5ZCJ9fX0=",
        "&a水平粒子 (Up)",
        "&9宇宙中的基本粒子"
    );
    public static final SlimefunItemStack QUIRP_DOWN = new SlimefunItemStack("QUIRP_DOWN",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjlhMDMwY2EyYjJjNmZlNjdmZTgwOTdkM2NkMjA2OTY5ZmM1YzAwMTdjNjBiNmI0MDk5MGM3NzJhNmYwYWMwYSJ9fX0=",
        "&a水平粒子 (Down)",
        "&9宇宙中的基本粒子"
    );
    public static final SlimefunItemStack QUIRP_LEFT = new SlimefunItemStack("QUIRP_LEFT",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTc2OTVmOTZkZGE2MjZmYWFhMDEwZjRhNWYyOGE1M2NkNjZmNzdkZTBjYzI4MGU3YzU4MjVhZDY1ZWVkYzcyZSJ9fX0=",
        "&a垂直粒子 (Left)",
        "&9宇宙中的基本粒子"
    );
    public static final SlimefunItemStack QUIRP_RIGHT = new SlimefunItemStack("QUIRP_RIGHT",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWY4NjkwNDhmMDZkMzE4ZTUwNThiY2EwYTg3NmE1OTg2MDc5ZjQ1YTc2NGQxMmFiMzRhNDkzMWRiNmI4MGFkYyJ9fX0=",
        "&a垂直粒子 (Right)",
        "&9宇宙中的基本粒子"
    );
    public static final SlimefunItemStack QUIRP_CONDENSATE = new SlimefunItemStack("QUIRPCONDENSATE",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFlMWY2MTYyZGI0MjI0NTYzOTYwOWY3MjhhNGUxMzRlZDdiZDdkZTNjMTVhNzc5MmQyMTlhNmUyYTlkYiJ9fX0=",
        "&5冷凝粒子",
        "&9能量奇点"
    );
    public static final SlimefunItemStack UNSTABLE_INGOT = new SlimefunItemStack("UNSTABLEINGOT",
        Material.NETHER_BRICK,
        "&4不稳定的锭",
        "&9你将会死亡",
        "&9超过时间,物品将会消失.....",
        "",
        TranscendenceLoreBuilder.unstable()
    );
    public static final SlimefunItemStack UNSTABLE_INGOT_2 = new SlimefunItemStack("UNSTABLEINGOT2",
        Material.NETHER_BRICK,
        "&4不稳定的锭 (75%)",
        "&9你将会死亡",
        "&9超过时间,物品将会消失.....",
        "",
        TranscendenceLoreBuilder.unstable()
    );
    public static final SlimefunItemStack UNSTABLE_INGOT_3 = new SlimefunItemStack("UNSTABLEINGOT3",
        Material.NETHER_BRICK,
        "&4不稳定的锭 (50%)",
        "&9你将会死亡",
        "&9超过时间,物品将会消失.....",
        "",
        TranscendenceLoreBuilder.unstable()
    );
    public static final SlimefunItemStack UNSTABLE_INGOT_4 = new SlimefunItemStack("UNSTABLEINGOT4",
        Material.NETHER_BRICK,
        "&4不稳定的锭 (25%)",
        "&9你将会死亡",
        "&9超过时间,物品将会消失.....",
        "",
        TranscendenceLoreBuilder.unstable()
    );
    public static final SlimefunItemStack ZOT_UP = new SlimefunItemStack("ZOT_UP",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWZkZTNiZmNlMmQ4Y2I3MjRkZTg1NTZlNWVjMjFiN2YxNWY1ODQ2ODRhYjc4NTIxNGFkZDE2NGJlNzYyNGIifX19",
        "&a未充能的水平粒子 (Up)",
        "&9需要粒子过载机",
        "&7进度: &e0/1000"
    );
    public static final SlimefunItemStack ZOT_DOWN = new SlimefunItemStack("ZOT_DOWN",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzY0MTY4MmY0MzYwNmM1YzlhZDI2YmM3ZWE4YTMwZWU0NzU0N2M5ZGZkM2M2Y2RhNDllMWMxYTI4MTZjZjBiYSJ9fX0=",
        "&a未充能的水平粒子 (Down)",
        "&9需要粒子过载机",
        "&7进度: &e0/1000"
    );
    public static final SlimefunItemStack ZOT_LEFT = new SlimefunItemStack("ZOT_LEFT",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDI3Y2E0NmY2YTliYjg5YTI0ZmNhZjRjYzBhY2Y1ZTgyODVhNjZkYjc1MjEzNzhlZDI5MDlhZTQ0OTY5N2YifX19",
        "&a未充能的垂直粒子 (Left)",
        "&9需要粒子过载机",
        "&7进度: &e0/1000"
    );
    public static final SlimefunItemStack ZOT_RIGHT = new SlimefunItemStack("ZOT_RIGHT",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2RkM2VkZTBhZDUzNzY4YWJkY2U0OTNmYmYzYzIzNTlkYzg3ZWM1NWQyZmNlZWIxNzc1NGVkNTkwZTQxYSJ9fX0=",
        "&a未充能的垂直粒子 (Right)",
        "&9需要粒子过载机",
        "&7进度: &e0/1000"
    );
    public static final SlimefunItemStack ZOT_UP_2 = new SlimefunItemStack("ZOT_UP_2",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWZkZTNiZmNlMmQ4Y2I3MjRkZTg1NTZlNWVjMjFiN2YxNWY1ODQ2ODRhYjc4NTIxNGFkZDE2NGJlNzYyNGIifX19",
        "&c充能水平粒子 (Up)",
        "&9充能完成",
        "&7进度: &c1000/1000"
    );
    public static final SlimefunItemStack ZOT_DOWN_2 = new SlimefunItemStack("ZOT_DOWN_2",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzY0MTY4MmY0MzYwNmM1YzlhZDI2YmM3ZWE4YTMwZWU0NzU0N2M5ZGZkM2M2Y2RhNDllMWMxYTI4MTZjZjBiYSJ9fX0=",
        "&c充能水平粒子 (Down)",
        "&9充能完成",
        "&7进度: &c1000/1000"
    );
    public static final SlimefunItemStack ZOT_LEFT_2 = new SlimefunItemStack("ZOT_LEFT_2",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDI3Y2E0NmY2YTliYjg5YTI0ZmNhZjRjYzBhY2Y1ZTgyODVhNjZkYjc1MjEzNzhlZDI5MDlhZTQ0OTY5N2YifX19",
        "&c充能垂直粒子 (Left)",
        "&9充能完成",
        "&7进度: &c1000/1000"
    );
    public static final SlimefunItemStack ZOT_RIGHT_2 = new SlimefunItemStack("ZOT_RIGHT_2",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2RkM2VkZTBhZDUzNzY4YWJkY2U0OTNmYmYzYzIzNTlkYzg3ZWM1NWQyZmNlZWIxNzc1NGVkNTkwZTQxYSJ9fX0=",
        "&c充能垂直粒子 (Right)",
        "&9充能完成",
        "&7进度: &c1000/1000"
    );
    public static final SlimefunItemStack STABLE_INGOT = new SlimefunItemStack("STABLEINGOT",
        Material.BRICK,
        "&c稳定的锭",
        "&9无价材料"
    );
    public static final SlimefunItemStack STABLE_BLOCK = new SlimefunItemStack("STABLEBLOCK",
        Material.BRICKS,
        "&c稳定的锭块",
        "&9无价材料"
    );
    public static final SlimefunItemStack DAXI_STRENGTH = new SlimefunItemStack("DAXI_STRENGTH",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZmYzk3N2NjN2UxMGU1NjRhMDk2MzhhNTNiYmM0YzU0YzljOGRhYzc0NTBiYTNkZmEzYzkwOTlkOTRmNSJ9fX0=",
        "&a超能力核心 (S)",
        "&9右键获得药水效果(力量3）",
        "&9按下F5来看粒子特效!"
    );
    public static final SlimefunItemStack DAXI_ABSORPTION = new SlimefunItemStack("DAXI_ABSORPTION",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZmYzk3N2NjN2UxMGU1NjRhMDk2MzhhNTNiYmM0YzU0YzljOGRhYzc0NTBiYTNkZmEzYzkwOTlkOTRmNSJ9fX0=",
        "&a超能力核心 (A)",
        "&9右键获得药水效果(伤害吸收5)",
        "&9按下F5来看粒子特效!"
    );
    public static final SlimefunItemStack DAXI_FORTITUDE = new SlimefunItemStack("DAXI_FORTITUDE",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZmYzk3N2NjN2UxMGU1NjRhMDk2MzhhNTNiYmM0YzU0YzljOGRhYzc0NTBiYTNkZmEzYzkwOTlkOTRmNSJ9fX0=",
        "&a超能力核心 (F)",
        "&9右键获得药水效果(抗性提升4)",
        "&9按下F5来看粒子特效!"
    );
    public static final SlimefunItemStack DAXI_SATURATION = new SlimefunItemStack("DAXI_SATURATION",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZmYzk3N2NjN2UxMGU1NjRhMDk2MzhhNTNiYmM0YzU0YzljOGRhYzc0NTBiYTNkZmEzYzkwOTlkOTRmNSJ9fX0=",
        "&a超能力核心 (H)",
        "&9右键获得药水效果(饱和)",
        "&9按下F5来看粒子特效!"
    );
    public static final SlimefunItemStack DAXI_REGENERATION = new SlimefunItemStack("DAXI_REGENERATION",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2ZmYzk3N2NjN2UxMGU1NjRhMDk2MzhhNTNiYmM0YzU0YzljOGRhYzc0NTBiYTNkZmEzYzkwOTlkOTRmNSJ9fX0=",
        "&a超能力核心 (R)",
        "&9右键获得药水效果(生命恢复2)",
        "&9按下F5来看粒子特效!"
    );
    public static final SlimefunItemStack VERTICAL_POLARIZER = new SlimefunItemStack("VERTICAL_POLARIZER",
        Material.END_ROD,
        "&5垂直偏振器",
        "&9增加垂直粒子的产出记录",
        "&c需要放入粒子生产机"
    );
    public static final SlimefunItemStack HORIZONTAL_POLARIZER = new SlimefunItemStack("HORIZONTAL_POLARIZER",
        Material.END_ROD,
        "&5水平偏振器",
        "&9增加水平粒子产出几率",
        "&c需要放入粒子生产机"
    );
    public static final SlimefunItemStack NANOBOT_CRAFTER = new SlimefunItemStack("NANOBOT_CRAFTER",
        Material.CHISELED_STONE_BRICKS,
        "&c纳米工作台",
        "末地科技最基本制作"
    );


    /* Machines */
    public static final SlimefunItemStack QUIRP_OSCILLATOR = new SlimefunItemStack("QUIRP_OSCILLATOR",
        Material.PURPUR_PILLAR,
        "&9粒子生产机",
        "来自虚空",
        "&c需要在末地运行!",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(512),
        LoreBuilder.powerPerSecond(256)
    );
    public static final SlimefunItemStack QUIRP_ANNIHILATOR = new SlimefunItemStack("QUIRP_ANNIHILATOR",
        Material.YELLOW_CONCRETE,
        "&c粒子冷凝机",
        "需要相对的粒子才能运行",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.powerPerSecond(512)
    );
    public static final SlimefunItemStack QUIRP_CYCLER = new SlimefunItemStack("QUIRP_CYCLER",
        Material.BLUE_CONCRETE,
        "&c粒子转向机",
        "变成不同的粒子",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.powerPerSecond(512)
    );
    public static final SlimefunItemStack STABILIZER = new SlimefunItemStack("STABILIZER",
        Material.BLACK_CONCRETE,
        "&c稳定器",
        "生产不稳定的锭",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.powerPerSecond(512)
    );
    public static final SlimefunItemStack QUIRP_SCATTERER = new SlimefunItemStack("QUIRP_SCATTERER",
        "9343ce58da54c79924a2c9331cfc417fe8ccbbea9be45a7ac85860a6c730",
        "&c粒子发电机",
        "最好的发电机",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(65536),
        LoreBuilder.powerPerSecond(1536)
    );
    public static final SlimefunItemStack ZOT_OVERLOADER = new SlimefunItemStack("ZOT_OVERLOADER",
        Material.WHITE_CONCRETE,
        "&9粒子过载机",
        "用于粒子充能",
        "&c需要在末地运行!",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.powerPerSecond(512)
    );
    private TEItems() {
    }
}

package me.sfiguz7.transcendence.implementation.items.multiblocks;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.sfiguz7.transcendence.TranscEndence;
import me.sfiguz7.transcendence.lists.TEItems;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class NanobotCrafter extends MultiBlockMachine {

    public NanobotCrafter() {
        super(TEItems.transcendence, TEItems.NANOBOT_CRAFTER, new ItemStack[] {
                null, null, null,
                new ItemStack(Material.END_ROD), null, null,
                new ItemStack(Material.CHISELED_STONE_BRICKS), new ItemStack(Material.CRAFTING_TABLE),
                new ItemStack(Material.DISPENSER)},
            new ItemStack[0],
            BlockFace.UP);
    }

    @Override
    public void onInteract(Player p, Block b) {
        Block dispenser = locateDispenser(b);

        if (dispenser == null) {
            // How even...
            // Nice question Cookie, I'm leaving it for those pesky null dispensers
            return;
        }

        Inventory inv = ((Dispenser) dispenser.getState()).getInventory();
        List<ItemStack[]> inputs = RecipeType.getRecipeInputList(this);
        for (ItemStack[] input : inputs) {
            if (isCraftable(inv, input)) {
                ItemStack output = RecipeType.getRecipeOutputList(this, input).clone();

                if (SlimefunUtils.canPlayerUseItem(p, output, true)) {
                    craft(inv, dispenser, p, b, output);
                }

                return;
            }
        }
        Slimefun.getLocalization().sendMessage(p, "machines.pattern-not-found", true);
    }

    private void craft(Inventory inv, Block dispenser, Player p, Block b, ItemStack output) {
        Inventory fakeInv = createVirtualInventory(inv);
        Inventory outputInv = findOutputInventory(output, dispenser, inv, fakeInv);

        if (outputInv != null) {
            for (int j = 0; j < 9; j++) {
                if (inv.getContents()[j].getType() != Material.AIR) {
                    if (inv.getContents()[j].getAmount() > 1)
                        inv.setItem(j, new CustomItemStack(inv.getContents()[j], inv.getContents()[j].getAmount() - 1));
                    else inv.setItem(j, null);
                }
            }

            startAnimation(p, b, outputInv, output);
        } else Slimefun.getLocalization().sendMessage(p, "machines.full-inventory", true);
    }

    private void startAnimation(Player p, Block b, Inventory inv, ItemStack output) {
        for (int j = 0; j < 4; j++) {
            int current = j;
            Bukkit.getScheduler().runTaskLater(TranscEndence.getInstance(), () -> {
                p.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                p.getWorld().playEffect(b.getLocation(), Effect.ENDER_SIGNAL, 1);

                if (current < 3) {
                    p.getWorld().playSound(b.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1F, 1F);
                } else {
                    p.getWorld().playSound(p.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1F, 1F);
                    inv.addItem(output);
                }
            }, j * 20L);
        }
    }

    private Block locateDispenser(Block b) {
        Block block = null;

        if (b.getRelative(1, 0, 0).getType() == Material.DISPENSER) block = b.getRelative(1, 0, 0);
        else if (b.getRelative(0, 0, 1).getType() == Material.DISPENSER) block = b.getRelative(0, 0, 1);
        else if (b.getRelative(-1, 0, 0).getType() == Material.DISPENSER) block = b.getRelative(-1, 0, 0);
        else if (b.getRelative(0, 0, -1).getType() == Material.DISPENSER) block = b.getRelative(0, 0, -1);

        return block;
    }

    private boolean isCraftable(Inventory inv, ItemStack[] recipe) {
        for (int j = 0; j < inv.getContents().length; j++) {
            if (!SlimefunUtils.isItemSimilar(inv.getContents()[j], recipe[j], true)) {
                return false;
            }
        }

        return true;
    }

    protected Inventory createVirtualInventory(Inventory inv) {
        Inventory fakeInv = Bukkit.createInventory(null, 9, "Fake Inventory");

        for (int j = 0; j < inv.getContents().length; j++) {
            ItemStack stack = inv.getContents()[j].getAmount() > 1 ?
                new CustomItemStack(inv.getContents()[j], inv.getContents()[j].getAmount() - 1) : null;
            fakeInv.setItem(j, stack);
        }

        return fakeInv;
    }
}


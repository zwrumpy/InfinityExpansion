package me.mooy1.infinityexpansion.Gear;

import me.mooy1.infinityexpansion.Categories;
import me.mooy1.infinityexpansion.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.annotation.Nonnull;

public class MagnoniumGear extends SlimefunItem{

    private final MagnoniumTool magnoniumTool;

    public MagnoniumGear(MagnoniumTool magnoniumtool) {
        super(Categories.INFINITY_GEAR, magnoniumtool.getItem(), RecipeType.ENHANCED_CRAFTING_TABLE, magnoniumtool.getRecipe());
        this.magnoniumTool = magnoniumtool;
    }

    private static final ItemStack alloy = Items.MAGNONIUM_INGOT;

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum MagnoniumTool {

        CROWN(Items.MAGNONIUM_CROWN, new ItemStack[] {
                alloy, alloy, alloy,
                alloy, null, alloy,
                null, null, null
        }),

        CHESTPLATE(Items.MAGNONIUM_CHESTPLATE, new ItemStack[] {
                alloy, null, alloy,
                alloy, alloy, alloy,
                alloy, alloy, alloy
        }),

        LEGGINGS(Items.MAGNONIUM_LEGGINGS, new ItemStack[] {
                alloy, alloy, alloy,
                alloy, null, alloy,
                alloy, null, alloy
        }),

        BOOTS(Items.MAGNONIUM_BOOTS, new ItemStack[] {
                null, null, null,
                alloy, null, alloy,
                alloy, null, alloy
        }),

        BLADE(Items.MAGNONIUM_BLADE , new ItemStack[] {
            null, alloy, null,
            null, alloy, null,
            null, alloy, null
        }),

        PICKAXE(Items.MAGNONIUM_PICKAXE, new ItemStack[] {
            alloy, alloy, alloy,
            null, alloy, null,
            null, alloy, null
        });

        @Nonnull
        private final SlimefunItemStack item;
        private final ItemStack[] recipe;
    }
}
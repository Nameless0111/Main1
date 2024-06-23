package net.bilashenko.metro.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {


    public static final CreativeModeTab Noxious_Dapper = new CreativeModeTab("Mushroom Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemFile.MUSHROOM.get());
        }
    };
}

package net.bilashenko.metro.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.bilashenko.metro.Metro;
import net.minecraftforge.registries.RegistryObject;

import static net.bilashenko.metro.Metro.ITEMS;

public class ItemFile {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Metro.MOD_ID);


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> MUSHROOM = ITEMS.register("noxious_dapper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Noxious_Dapper)));


    public static final RegistryObject<Item> METRO_FIRST_AID_KIT = ITEMS.register("first_aid_kit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Noxious_Dapper)));

    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Noxious_Dapper)));

    public static final RegistryObject<Item> METRO_MAP = ITEMS.register("metro_map",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Noxious_Dapper)));

}

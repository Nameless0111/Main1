package net.bilashenko.metro.block;


import net.bilashenko.metro.item.ModCreativeModeTab;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries. DeferredRegister;
import net.minecraftforge.registries. ForgeRegistries;
import net.bilashenko.metro.Metro;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import net.bilashenko.metro.item.ItemFile;
public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, Metro.MOD_ID);
    public static final RegistryObject<Block> METRO_LL = registryBlock( "metro_ll",
            () -> new Block(BlockBehaviour. Properties.of(Material.STONE)

.strength ( 3f).requiresCorrectToolForDrops()), ModCreativeModeTab.Noxious_Dapper);
    public static final RegistryObject<Block> SPARTA = registryBlock( "sparta",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.Noxious_Dapper);
    public static final RegistryObject<Block> CONCRETE_TUNNEL_WALL = registryBlock("concrete_tunnel_wall",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Noxious_Dapper);
    public static final RegistryObject<Block> YELLOW_SNOW = registryBlock("yellow_snow",
            () -> new Block(BlockBehaviour.Properties.of(Material.SNOW).sound(SoundType.SNOW)
                    .strength(0.2f,5f).requiresCorrectToolForDrops()), ModCreativeModeTab.Noxious_Dapper);
    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem (name, toReturns, tab);
        return toReturns;
    }


    public static <T extends Block>RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,

                                                                          CreativeModeTab tab) {

    return ItemFile.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
public static void register(IEventBus eventBus){

BLOCKS.register(eventBus);
}
}
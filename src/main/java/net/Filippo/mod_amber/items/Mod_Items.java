package net.Filippo.mod_amber.items;

import net.Filippo.mod_amber.Mod_Amber;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Mod_Items
{
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mod_Amber.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMBER_TAB)));
    public static final RegistryObject<Item> AMBER_RUDE = ITEMS.register("amber_rude", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AMBER_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }


}

package net.Filippo.mod_amber.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab AMBER_TAB = new CreativeModeTab("amber tab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Mod_Items.AMBER.get());
        }
    };
}

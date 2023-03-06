package com.yes.Ahh.Item;

import com.yes.Ahh.AhhModMain;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMetalItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AhhModMain.MODID);

    //Item Registration Begins

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)));

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)));

    public static final RegistryObject<Item> ALUMINUM = ITEMS.register("aluminum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus); }
}

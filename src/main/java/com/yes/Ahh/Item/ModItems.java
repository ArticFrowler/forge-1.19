package com.yes.Ahh.Item;

import com.yes.Ahh.AhhModMain;
import com.yes.Ahh.Item.Custom.EightBallItem;

import com.yes.Ahh.block.ModBlocks;
import com.yes.Ahh.fluid.ModFluids;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, AhhModMain.MODID);
	
	
	public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)));
	
	public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)));
	
	public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
			() -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
			() -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)));

	public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.AHH_TAB)
					.food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

	public static final RegistryObject<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket",
			() -> new BucketItem(ModFluids.SOURCE_SOAP_WATER,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}

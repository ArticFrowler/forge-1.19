package com.yes.Ahh.Item;

import com.yes.Ahh.AhhModMain;
import com.yes.Ahh.Item.Custom.EightBallItem;

import com.yes.Ahh.block.ModBlocks;
import com.yes.Ahh.fluid.ModFluids;
import com.yes.Ahh.materials.ModArmorMaterials;
import com.yes.Ahh.materials.ModToolTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
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

	public static final RegistryObject<Item> COOL_SWORD = ITEMS.register("cool_sword",
								//Tier, Attack Damage, Attack Speed
			() -> new SwordItem(Tiers.DIAMOND, 10, 5,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
			() -> new PickaxeItem(ModToolTiers.ZIRCON,4,6 ,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet", () ->
			new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.HEAD,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate", () ->
			new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.CHEST,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings", () ->
			new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.LEGS,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots", () ->
			new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.FEET,
					new Item.Properties().tab(ModCreativeModeTab.AHH_TAB).stacksTo(1)));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}

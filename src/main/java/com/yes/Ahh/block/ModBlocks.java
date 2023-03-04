package com.yes.Ahh.block;

import java.util.function.Supplier;

import com.yes.Ahh.AhhModMain;
import com.yes.Ahh.Item.ModCreativeModeTab;
import com.yes.Ahh.Item.ModItems;

import com.yes.Ahh.block.Custom.BlueberryCropBlock;
import com.yes.Ahh.block.Custom.JumpyBlock;
import com.yes.Ahh.block.Custom.ZirconLampBlock;
import com.yes.Ahh.fluid.ModFluids;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, AhhModMain.MODID);

	public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block", 
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AHH_TAB);
	
	public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore", 
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)), ModCreativeModeTab.AHH_TAB);

	public static final RegistryObject<Block> ENDSTONE_ZIRCON_ORE = registerBlock("end_zircon_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)), ModCreativeModeTab.AHH_TAB);

	public static final RegistryObject<Block> NETHER_ZIRCON_ORE = registerBlock("nether_zircon_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)), ModCreativeModeTab.AHH_TAB);
	
	public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore", 
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops(),
					UniformInt.of(3, 7)), ModCreativeModeTab.AHH_TAB);

	public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
			() -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.AHH_TAB);

	public static final RegistryObject<Block> ZIRCON_LAMP = registerBlock("zircon_lamp",
			() -> new ZirconLampBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops()
					//What this says is Light it should emit is 15 if LIT otherwise 0
					.lightLevel(state -> state.getValue(ZirconLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.AHH_TAB);

	public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
			() -> new BlueberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

	public static final RegistryObject<LiquidBlock> SOAP_WATER_BLOCK = BLOCKS.register("soap_water_block",
			() -> new LiquidBlock(ModFluids.SOURCE_SOAP_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));
	
	
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		
		return toReturn;
	}
	
	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
		return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
		
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
	
}
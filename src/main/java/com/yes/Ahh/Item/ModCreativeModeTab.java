package com.yes.Ahh.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
	public static final CreativeModeTab AHH_TAB = new CreativeModeTab("ahhtab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.ZIRCON.get());
		}
	};
}

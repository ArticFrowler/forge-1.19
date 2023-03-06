package com.yes.Ahh.integration;

import com.yes.Ahh.AhhModMain;
import com.yes.Ahh.block.ModBlocks;
import com.yes.Ahh.block.entity.ModelBlockEntities;
import com.yes.Ahh.recipe.GemInfusingStationRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class GemInfusingStationRecipeCatagory { /*implements IRecipeCategory<GemInfusingStationRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(AhhModMain.MODID, "gem_infusing");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(AhhModMain.MODID, "textures/gui/gem_infusing_station_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public GemInfusingStationRecipeCatagory(IGuiHelper helper){
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.GEM_INFUSING_STATION.get()));
    }

    @Override
    public RecipeType<GemInfusingStationRecipe> getRecipeType() {
        return JEIAhhModPlugin.INFUSION_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Gem Infusing Station");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, GemInfusingStationRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());
    }
   */
}

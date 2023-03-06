package com.yes.Ahh.integration;

import com.yes.Ahh.AhhModMain;
import com.yes.Ahh.recipe.GemInfusingStationRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.List;
import java.util.Objects;

//@JeiPlugin
public class JEIAhhModPlugin { /*implements IModPlugin {
    public static final RecipeType<GemInfusingStationRecipe> INFUSION_TYPE =
            new RecipeType<>(GemInfusingStationRecipeCatagory.UID, GemInfusingStationRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(AhhModMain.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                GemInfusingStationRecipeCatagory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<GemInfusingStationRecipe> recipesInfusing = rm.getAllRecipesFor(GemInfusingStationRecipe.Type.INSTANCE);
        registration.addRecipes(INFUSION_TYPE, recipesInfusing);
    }
   */
}

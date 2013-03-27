package ZoneSeek.common.recipes;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.items.ItemsHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapelessHandler {
	
	public static void setupRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHelper.InfectedStick, 1), new Object[] {new ItemStack(ItemsHelper.InfectedShard), new ItemStack(Item.stick)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.LagoonPlanks, 4), new Object[] {new ItemStack(BlocksHelper.LagoonLog)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.SludgePlanks, 4), new Object[] {new ItemStack(BlocksHelper.SludgeLog)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHelper.TaintedPage, 4), new Object[] {new ItemStack(ItemsHelper.TaintedInkDrop), new ItemStack(Item.paper)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.RedDye, 2), new Object[] {new ItemStack(BlocksHelper.Tulip)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.CrimsonDye, 2), new Object[] {new ItemStack(BlocksHelper.BloodFlower)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.YellowDye, 2), new Object[] {new ItemStack(BlocksHelper.Daisy)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.BlueDye, 2), new Object[] {new ItemStack(BlocksHelper.Iris)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.PinkDye, 2), new Object[] {new ItemStack(BlocksHelper.Blossoms)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.GrayDye, 2), new Object[] {new ItemStack(BlocksHelper.DeadFlower)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.GreenDyeDye, 2), new Object[] {new ItemStack(BlocksHelper.SpringFlowers)});
	}

}

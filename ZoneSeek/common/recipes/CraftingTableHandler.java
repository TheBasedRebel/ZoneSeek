package ZoneSeek.common.recipes;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.items.ItemsHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingTableHandler {
	
	public static void setupRecipes(){
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedBoots, 1), new Object[] {
			"   ", "P P", "P P", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedLeggings, 1), new Object[] {
			"PPP", "P P", "P P", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedHelmet, 1), new Object[] {
			"PPP", "PGP", " P ", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedChestplate, 1), new Object[] {
			"PPP", "PGP", "P P", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedGem, 1), new Object[] {
			"TTT", "   ", "   ", 'T', ItemsHelper.InfectedShard
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedStone, 1), new Object[] {
			"TTT", "TTT", "TTT", 'T', ItemsHelper.InfectedGem
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.LagoonStairs, 4), new Object[] {
			"T  ", "TT ", "TTT", 'T', BlocksHelper.LagoonPlanks
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeStairs, 4), new Object[] {
			"T  ", "TT ", "TTT", 'T', BlocksHelper.SludgePlanks
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.GraniteStairs, 4), new Object[] {
			"T  ", "TT ", "TTT", 'T', BlocksHelper.Granite
			
		});
		
		//Tool Recipe's Infected
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedPickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedHoe, 1), new Object[] {
			"TT ", " X ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});;
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedPaxcel, 1), new Object[] {
			"TQW", "RER", " X ", 'T', ItemsHelper.InfectedAxe, 'X', ItemsHelper.InfectedStick, 'Q', ItemsHelper.InfectedPickaxe, 'W', ItemsHelper.InfectedSpade, 'E', ItemsHelper.InfectedHoe, 'R', ItemsHelper.InfectedStone
			
		});
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.InfectedBlock, 1), new Object[] {
			"TTT", "TTT", "TTT", 'T', ItemsHelper.InfectedStone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.InfectedLamp, 1), new Object[] {
			"TTT", "TXT", "TTT", 'T', ItemsHelper.InfectedShard, 'X', Block.glowStone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeLamp, 1), new Object[] {
			"TTT", "TXT", "TTT", 'T', ItemsHelper.SludgeShard, 'X', Block.glowStone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.InfectedBrick, 4), new Object[] {
			"TQT", "QXQ", "TQT", 'T', ItemsHelper.InfectedShard, 'X', Block.brick, 'Q', Block.stoneBrick
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeBrick, 4), new Object[] {
			"TQT", "QXQ", "TQT", 'T', ItemsHelper.SludgeShard, 'X', Block.brick, 'Q', Block.stoneBrick
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeRock, 4), new Object[] {
			"XTX", "TXT", "XTX", 'T', ItemsHelper.SludgeShard, 'X', Block.cobblestone
			
		});
		
		//More Items
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeGem, 1), new Object[] {
			"TTT", "   ", "   ", 'T', ItemsHelper.SludgeShard
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeStone, 1), new Object[] {
			"TTT", "TTT", "TTT", 'T', ItemsHelper.SludgeStone
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BookOfInfection, 1), new Object[] {
			"STS", "TXT", "STS", 'X', ItemsHelper.TaintedPage, 'T', ItemsHelper.TaintedLeather, 'S', ItemsHelper.InfectedStone
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ObsidianStick, 8), new Object[] {
			"   ", "XTX", "XTX", 'T', BlocksHelper.SludgePlanks, 'X', Block.obsidian
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedStick, 4), new Object[] {
			"   ", " T ", " T ", 'T', BlocksHelper.LagoonPlanks
			
		});
		//----------
		
		//Misc
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.CarpetRed, 4), new Object[] {
			"TTT", "XXX", "TTT", 'X', Block.cloth, 'T', ItemsHelper.RedDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.HardWood, 4), new Object[] {
			"TTT", "TTT", "TTT", 'T', Block.planks
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.Tile, 4), new Object[] {
			"TYT", "XTX", "TYT", 'T', Block.stone, 'X', Item.bone, 'Y', Item.coal
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperWhite, 4), new Object[] {
			"TTT", "TTT", "TTT", 'T', Item.paper
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperGreenBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.GreenDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperBlueBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.BlueDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperRedBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.RedDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperYellowBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.YellowDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperCrimsonBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.CrimsonDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperGrayBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.GrayDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperPinkBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.PinkDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperGreen, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.GreenDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperBlue, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.BlueDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperRed, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.RedDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperYellow, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.YellowDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperCrimson, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.CrimsonDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperGray, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.GrayDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperPink, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.PinkDye
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.Counter, 1), new Object[] {
			"TTT", "XXX", "XXX", 'T', BlocksHelper.Granite, 'X', BlocksHelper.HardWood
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.Siding, 4), new Object[] {
			"TTT", "XXX", "TTT", 'T', BlocksHelper.HardWood, 'X', Item.bone
			
		});
		//Weapons
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedSword, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedBattleAxe, 1), new Object[] {
			"TTT", "TXT", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedProd, 1), new Object[] {
			"T T", "TXT", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeKatana, 1), new Object[] {
			" X ", " T ", " T ", 'T', ItemsHelper.ObsidianStick, 'X', ItemsHelper.SludgeStone
			
		});
		//New Recipes
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.LagoonLadder, 1), new Object[] {
			"X X", "XXX", "X X", 'X', ItemsHelper.LagoonStick
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.PalmWoodPlanks, 1), new Object[] {
			"   ", " X ", " X ", 'X', BlocksHelper.PalmLog
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ApophylliBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.ApophylliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ApophylliteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.ApophylliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ApophylliteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.ApophylliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ApophyllitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.ApophylliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ApophylliteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.ApophylliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.AxiBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.AxiniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.AxiniteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.AxiniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.AxiniteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.AxiniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.AxinitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.AxiniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.AxiniteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.AxiniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BetaBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.BetafiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BetafiteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.BetafiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BetafiteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.BetafiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BetafitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.BetafiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BetafiteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.BetafiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BroBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.BrochantiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BrochantiteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.BrochantiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BrochantiteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.BrochantiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BrochantitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.BrochantiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BrochantiteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.BrochantiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.DoloBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.DolomiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.DolomiteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.DolomiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.DolomiteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.DolomiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.DolomitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.DolomiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.DolomiteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.DolomiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.FoeBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.FotiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.FotiteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.FotiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.FotiteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.FotiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.FotitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.FotiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.FotiteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.FotiteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.GeniteBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.HeterogeniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.HeterogeniteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.HeterogeniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.HeterogeniteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.HeterogeniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.HeterogenitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.HeterogeniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.HeterogeniteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.HeterogeniteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.KasoBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.KasoliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.KasoliteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.KasoliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.KasoliteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.KasoliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.KasolitePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.KasoliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.KasoliteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.KasoliteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.LazarusBlade, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.LazuriteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.LazuriteAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.LazuriteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.LazuriteAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.LazuriteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.LazuritePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.LazuriteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.LazuriteSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.LazuriteCrystal, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.MasterCrystal, 1), new Object[] {
			"ABC", "DEF", "GHI", 'A', ItemsHelper.LazuriteCrystal, 'B', ItemsHelper.AxiniteCrystal, 'C', ItemsHelper.ApophylliteCrystal, 'D', ItemsHelper.BetafiteCrystal, 'E', ItemsHelper.BrochantiteCrystal, 'F', ItemsHelper.DolomiteCrystal, 'G', ItemsHelper.FotiteCrystal, 'H', ItemsHelper.HeterogeniteCrystal, 'I', ItemsHelper.KasoliteCrystal
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ScaleBoots, 1), new Object[] {
			"T T", "T T", "   ", 'T', ItemsHelper.CompactedScalePlate
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ScaleBoots, 1), new Object[] {
			"   ", "T T", "T T", 'T', ItemsHelper.CompactedScalePlate
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ScaleChestplate, 1), new Object[] {
			"T T", "TTT", "TTT", 'T', ItemsHelper.CompactedScalePlate
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ScaleHelmet, 1), new Object[] {
			"TTT", "T T", "   ", 'T', ItemsHelper.CompactedScalePlate
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ScaleHelmet, 1), new Object[] {
			"   ", "TTT", "T T", 'T', ItemsHelper.CompactedScalePlate
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ScaleLeggings, 1), new Object[] {
			"TTT", "T T", "T T", 'T', ItemsHelper.CompactedScalePlate
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SlimeCannon, 1), new Object[] {
			" TX", "TXT", "XT ", 'T', ItemsHelper.SlugSlime, 'X', Item.ingotIron
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SlimeClub, 1), new Object[] {
			"TTT", "TTT", " X ", 'T', ItemsHelper.SlugSlime, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SlimeStabber, 1), new Object[] {
			" T ", "TTT", " X ", 'T', ItemsHelper.SlugSlime, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeAxe, 1), new Object[] {
			" TT", " XT", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeHammer, 1), new Object[] {
			"TTT", "TTT", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeHoe, 1), new Object[] {
			"TT ", " X ", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeHoe, 1), new Object[] {
			" TT", " X ", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgePickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeSickle, 1), new Object[] {
			"TTT", "X T", "X  ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.SludgeStone, 'X', Item.stick
			
		});


		//test
	}

}

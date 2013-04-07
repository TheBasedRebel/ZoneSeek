package ZoneSeek.common.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import ZoneSeek.ZoneSeekArmor;
import ZoneSeek.ZoneSeekBlocks;
import ZoneSeek.ZoneSeekFood;
import ZoneSeek.ZoneSeekItems;
import ZoneSeek.ZoneSeekMaterials;
import ZoneSeek.ZoneSeekTools;
import ZoneSeek.ZoneSeekWeapons;
import ZoneSeek.common.IDsHelper;
import ZoneSeek.common.ZoneSeek;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlocksHelper {

	//Blocks
	public static Block Apophyllite;
	public static Block Axinite;
	public static Block Betafite;
	public static Block Brochantite;
	public static Block CarpetRed;
	public static Block CoconutBlock;
	public static Block Counter;
	public static Block Dolomite;
	public static Block Fotite;
	public static Block Granite;
	public static Block HardWood;
	public static Block Heterogenite;
	public static Block InfectedBlock;
	public static Block InfectedBrick;
	public static Block InfectedLamp;
	public static Block InfectedOre;
	public static Block Kasolite;
	public static Block LagoonDirt;
	public static Block LagoonGrass;
	public static Block LagoonLadder;
	public static Block LagoonLeaf;
    public static Block LagoonLog;
    public static Block LagoonPlanks;
    public static Block LagoonSapling;
    public static Block LagoonTallGrass;
    public static Block LagoonVines;
    public static Block Lazurite;
    public static Block PalmLeaf;
    public static Block PalmWoodPlanks;
    public static Block PalmLog;
    public static Block Siding;
    public static Block SludgeBrick;
    public static Block SludgeDirt;
    public static Block SludgeGrass;
    public static Block SludgeLamp;
    public static Block SludgeLeaf;
    public static Block SludgeLog;
    public static Block SludgeOre;
    public static Block SludgePlanks;
    public static Block SludgeRock;
    public static Block SludgeStoneGround;
    public static Block SludgeTallGrass;
    public static Block Tile;
    public static Block TropicalDirt;
    public static Block TropicalGrass;
    public static Block TropicalTallGrass;
    public static Block WallPaperBlue;
    public static Block WallPaperBlueBottom;
    public static Block WallPaperGreen;
    public static Block WallPaperGreenBottom;
    public static Block WallPaperRed;
    public static Block WallPaperRedBottom;
    public static Block WallPaperWhite;
    public static Block WallPaperYellow;
    public static Block WallPaperYellowBottom;
    public static Block LagoonStairs;
    public static Block SludgeStairs;
    public static Block GraniteStairs;   
    public static Block BloodFlower;
    public static Block Blossoms;
    public static Block Daisy;
    public static Block DeadFlower;
    public static Block Iris;
    public static Block SpringFlowers;
    public static Block Tulip;
    public static Block WallPaperCrimson;
    public static Block WallPaperCrimsonBottom;
    public static Block WallPaperGray;
    public static Block WallPaperGrayBottom;
    public static Block WallPaperPink;
    public static Block WallPaperPinkBottom;
    public static Block PalmStairs;
    public static Block HardWoodStairs;
    public static Block AnthraciteCoalOre;
    public static Block SlagBlock;
    public static BlockPortalPrehistoric portalprehistoric;
    public static Block Condensor;
    public static Block Extractor;
    public static Block FossilRock;
    public static Block PrehistoricDirt;
    public static Block PrehistoricGrass;
    public static Block PrehistoricLeaf;
    public static Block PrehistoricLog;
    public static Block PrehistoricSand;
    public static Block PrehistoricStone;
    public static Block PrehistoricTallGrass;

	public static void setupBlocks() {
		
		//Ores
		Apophyllite = new BlockOre(IDsHelper.ApophylliteID, "Apophyllite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Apophyllite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Axinite = new BlockOre(IDsHelper.AxiniteID, "Axinite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Axinite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Betafite = new BlockOre(IDsHelper.BetafiteID, "Betafite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Betafite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Brochantite = new BlockOre(IDsHelper.BrochantiteID, "Brochantite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Brochantite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Dolomite = new BlockOre(IDsHelper.DolomiteID, "Dolomite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Dolomite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Fotite = new BlockOre(IDsHelper.FotiteID, "Fotite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Fotite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Granite = new BlockOre(IDsHelper.GraniteID, "Granite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Granite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Heterogenite = new BlockOre(IDsHelper.HeterogeniteID, "Heterogenite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Heterogenite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		InfectedOre = new BlockInfectedOre(IDsHelper.InfectedOreID, "InfectedOre").setHardness(10F).setResistance(0.2F).setUnlocalizedName("InfectedOre").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Kasolite = new BlockOre(IDsHelper.KasoliteID, "Kasolite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Kasolite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Lazurite = new BlockOre(IDsHelper.LazuriteID, "Lazurite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Lazurite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeOre = new BlockOre(IDsHelper.SludgeOreID, "SludgeOre").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeOre").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		AnthraciteCoalOre = new BlockOre(IDsHelper.AnthraciteCoalOreID, "AnthraciteCoalOre").setHardness(7F).setResistance(0.2F).setUnlocalizedName("AnthraciteCoalOre").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		FossilRock = new BlockOre(IDsHelper.FossilRockID, "FossilRock").setHardness(15F).setResistance(0.2F).setUnlocalizedName("FossilRock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Machines
		Condensor = new BlockStone(IDsHelper.CondensorID, "Condesor").setHardness(2F).setResistance(0.2F).setUnlocalizedName("Condensor").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Extractor = new BlockStone(IDsHelper.ExtractorID, "Extractor").setHardness(2F).setResistance(0.2F).setUnlocalizedName("Extractor").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Normal Blocks Wood
		CarpetRed = new BlockWood(IDsHelper.CarpetRedID, "CarpetRed").setHardness(2F).setResistance(1F).setUnlocalizedName("CarpetRed").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		CoconutBlock = new BlockWood(IDsHelper.CoconutBlockID, "CoconutBlock").setHardness(2F).setResistance(1F).setUnlocalizedName("CoconutBlock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		HardWood = new BlockWood(IDsHelper.HardWoodID, "HardWood").setHardness(2F).setResistance(1F).setUnlocalizedName("HardWood").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonPlanks = new BlockWood(IDsHelper.LagoonPlanksID, "LagoonPlanks").setHardness(2F).setResistance(1F).setUnlocalizedName("LagoonPlanks").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmWoodPlanks = new BlockWood(IDsHelper.PalmWoodPlanksID, "PalmWoodPlanks").setHardness(2F).setResistance(0F).setUnlocalizedName("PalmWoodPlanks").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Siding = new BlockWood(IDsHelper.SidingID, "Siding").setHardness(2F).setResistance(1F).setUnlocalizedName("Siding").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgePlanks = new BlockWood(IDsHelper.SludgePlanksID, "SludgePlanks").setHardness(2F).setResistance(0F).setUnlocalizedName("SludgePlanks").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//WallPaper
		WallPaperBlue = new BlockWallPaperBlue(IDsHelper.WallPaperBlueID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperBlue").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperBlueBottom = new BlockWallPaperBlueB(IDsHelper.WallPaperBlueBottomID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperBlueBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperGreen = new BlockWallPaperGreen(IDsHelper.WallPaperGreenID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperGreen").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperGreenBottom = new BlockWallPaperGreenB(IDsHelper.WallPaperGreenBottomID).setHardness(2F).setResistance(10F).setUnlocalizedName("WallPaperGreenBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperRed = new BlockWallPaperRed(IDsHelper.WallPaperRedID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperRed").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperRedBottom = new BlockWallPaperRedB(IDsHelper.WallPaperRedBottomID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperRedBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperWhite = new BlockWallPaperWhite(IDsHelper.WallPaperWhiteID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperWhite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperYellow = new BlockWallPaperYellow(IDsHelper.WallPaperYellowID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperYellow").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperYellowBottom = new BlockWallPaperYellowB(IDsHelper.WallPaperYellowBottomID).setHardness(2F).setResistance(10F).setUnlocalizedName("WallPaperYellowBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		WallPaperCrimson = new BlockWallPaperCrimson(IDsHelper.WallPaperCrimsonID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperCrimson").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperCrimsonBottom = new BlockWallPaperCrimsonB(IDsHelper.WallPaperCrimsonBottomID).setHardness(2F).setResistance(10F).setUnlocalizedName("WallPaperCrimsonBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperGray = new BlockWallPaperGray(IDsHelper.WallPaperGrayID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperGray").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperGrayBottom = new BlockWallPaperGrayB(IDsHelper.WallPaperGrayBottomID).setHardness(2F).setResistance(10F).setUnlocalizedName("WallPaperGrayBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperPink = new BlockWallPaperPink(IDsHelper.WallPaperPinkID).setHardness(2F).setResistance(1F).setUnlocalizedName("WallPaperPink").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperPinkBottom = new BlockWallPaperPinkB(IDsHelper.WallPaperPinkBottomID).setHardness(2F).setResistance(10F).setUnlocalizedName("WallPaperPinkBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Normal Blocks Stone
		InfectedBlock = new BlockStone(IDsHelper.InfectedBlockID, "InfectedBlock").setHardness(2F).setResistance(0.2F).setUnlocalizedName("InfectedBlock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		InfectedBrick = new BlockStone(IDsHelper.InfectedBrickID, "InfectedBrick").setHardness(2F).setResistance(0.2F).setUnlocalizedName("InfectedBrick").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeBrick = new BlockStone(IDsHelper.SludgeBrickID, "SludgeBrick").setHardness(2F).setResistance(0.2F).setUnlocalizedName("SludgeBrick").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeRock = new BlockStone(IDsHelper.SludgeRockID, "SludgeRock").setHardness(2F).setResistance(0.2F).setUnlocalizedName("SludgeRock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeStoneGround = new BlockStone(IDsHelper.SludgeStoneGroundID, "SludgeStoneGround").setLightValue(0.5F).setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeStoneGround").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Tile = new BlockStone(IDsHelper.TileID, "Tile").setHardness(2F).setResistance(0.2F).setUnlocalizedName("Tile").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SlagBlock = new BlockStone(IDsHelper.SlagBlockID, "SlagBlock").setHardness(2F).setResistance(0.2F).setUnlocalizedName("SlagBlock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricStone = new BlockStone(IDsHelper.PrehistoricStoneID, "PrehistoricStone").setHardness(2F).setResistance(0.2F).setUnlocalizedName("PrehistoricStone").setCreativeTab(ZoneSeek.ZoneSeekBlocks);

		
		//Normal Blocks Ground
		LagoonDirt = new BlockGround(IDsHelper.LagoonDirtID, "LagoonDirt").setHardness(0.8F).setLightValue(0.5F).setResistance(0.2F).setUnlocalizedName("LagoonDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeDirt = new BlockGround(IDsHelper.SludgeDirtID, "SludgeDirt").setHardness(0.8F).setResistance(0.2F).setUnlocalizedName("SludgeDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		TropicalDirt = new BlockGround(IDsHelper.TropicalDirtID, "TropicalDirt").setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("TropicalDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricDirt = new BlockGround(IDsHelper.PrehistoricDirtID, "PrehistoricDirt").setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("PrehistoricDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricSand = new BlockGround(IDsHelper.PrehistoricSandID, "PrehistoricSand").setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("PrehistoricSand").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Normal Blocks Lamp
		InfectedLamp = new BlockLamp(IDsHelper.InfectedLampID, "InfectedLamp").setHardness(0.2F).setResistance(0.1F).setUnlocalizedName("InfectedLamp").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeLamp = new BlockLamp(IDsHelper.SludgeLampID, "SludgeLamp").setHardness(0.2F).setResistance(0.1F).setUnlocalizedName("SludgeLamp").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Special Blocks
		LagoonLadder = new BlockLagoonLadder(IDsHelper.LagoonLadderID).setHardness(2F).setResistance(1F).setUnlocalizedName("LagoonLadder").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Counter = new BlockCounter(IDsHelper.CounterID).setHardness(2F).setResistance(0.2F).setUnlocalizedName("Counter").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Portals
		portalprehistoric = (BlockPortalPrehistoric) new BlockPortalPrehistoric(IDsHelper.PrehistoricPortalID, "PrehistoricPortal").setUnlocalizedName("PrehistoricPortal");
		
		//Biome Blocks
		LagoonGrass = new BlockLagoonGrass(IDsHelper.LagoonGrassID).setHardness(0.7F).setLightValue(0.5F).setResistance(0.2F).setUnlocalizedName("LagoonGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonLeaf = new BlockLagoonLeaf(IDsHelper.LagoonLeafID).setHardness(0.5F).setLightValue(0.5F).setResistance(0.2F).setUnlocalizedName("LagoonLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonLog = new BlockLagoonLog(IDsHelper.LagoonLogID).setLightValue(0.5F).setHardness(2F).setResistance(0.2F).setUnlocalizedName("LagoonLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonSapling = new BlockLagoonSapling(IDsHelper.LagoonSaplingID).setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("LagoonSapling").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonTallGrass = new BlockLagoonTallGrass(IDsHelper.LagoonTallGrassID).setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("LagoonTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonVines = new BlockLagoonVines(IDsHelper.LagoonVinesID).setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("LagoonVines").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmLeaf = new BlockPalmLeaf(IDsHelper.PalmLeafID).setHardness(0.5F).setResistance(0.2F).setUnlocalizedName("PalmLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmLog = new BlockPalmLog(IDsHelper.PalmLogID).setHardness(2F).setResistance(0.2F).setUnlocalizedName("PalmLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeGrass = new BlockSludgeGrass(IDsHelper.SludgeGrassID).setHardness(0.7F).setResistance(0.2F).setUnlocalizedName("SludgeGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeLeaf = new BlockSludgeLeaf(IDsHelper.SludgeLeafID).setHardness(0.5F).setResistance(0.2F).setUnlocalizedName("SludgeLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeLog = new BlockSludgeLog(IDsHelper.SludgeLogID).setHardness(2F).setResistance(0.2F).setUnlocalizedName("SludgeLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeTallGrass = new BlockSludgeTallGrass(IDsHelper.SludgeTallGrassID).setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("SludgeTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		TropicalGrass = new BlockTropicalGrass(IDsHelper.TropicalGrassID).setHardness(0.7F).setResistance(0.2F).setUnlocalizedName("TropicalGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		TropicalTallGrass = new BlockTropicalTallGrass(IDsHelper.TropicalTallGrassID).setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("TropicalTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricGrass = new BlockPrehistoricGrass(IDsHelper.PrehistoricGrassID).setHardness(0.7F).setResistance(0.2F).setUnlocalizedName("PrehistoricGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricTallGrass = new BlockPrehistoricTallGrass(IDsHelper.PrehistoricTallGrassID).setHardness(0.1F).setResistance(0.2F).setUnlocalizedName("PrehistoricTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricLog = new BlockPrehistoricLog(IDsHelper.PrehistoricLogID).setHardness(2F).setResistance(0.2F).setUnlocalizedName("PrehistoricLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PrehistoricLeaf = new BlockPrehistoricLeaf(IDsHelper.PrehistoricLeafID).setHardness(0.5F).setResistance(0.2F).setUnlocalizedName("PrehistoricLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Stairs
		LagoonStairs = new BlockLagoonStairs(IDsHelper.LagoonStairsID, BlocksHelper.LagoonPlanks, 0).setUnlocalizedName("LagoonStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeStairs = new BlockSludgeStairs(IDsHelper.SludgeStairsID, BlocksHelper.SludgePlanks, 0).setUnlocalizedName("SludgeStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		GraniteStairs = new BlockGraniteStairs(IDsHelper.GraniteStairsID, BlocksHelper.Granite, 0).setUnlocalizedName("GraniteStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmStairs = new BlockPalmStairs(IDsHelper.PalmStairsID, BlocksHelper.PalmWoodPlanks, 0).setUnlocalizedName("PalmStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		HardWoodStairs = new BlockHardWoodStairs(IDsHelper.HardWoodStairsID, BlocksHelper.HardWood, 0).setUnlocalizedName("HardWoodStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Flowers
		BloodFlower = new BlockFlowerCustom(IDsHelper.BloodFlowerID, "BloodFlower").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("BloodFlower").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Blossoms = new BlockFlowerCustom(IDsHelper.BlossomsID, "Blossoms").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("Blossoms").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Daisy = new BlockFlowerCustom(IDsHelper.DaisyID, "Daisy").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("Daisy").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		DeadFlower = new BlockFlowerCustom(IDsHelper.DeadFlowerID, "DeadFlower").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("DeadFlower").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Iris = new BlockFlowerCustom(IDsHelper.IrisID, "Iris").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("Iris").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SpringFlowers = new BlockFlowerCustom(IDsHelper.SpringFlowersID, "SpringFlowers").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("SpringFlowers").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Tulip = new BlockFlowerCustom(IDsHelper.TulipID, "Tulip").setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("Tulip").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Machines
		//geothermalOven = new BlockLavaFurnace(IDsHelper.lavafurnaceID, "LavaFurnaceFront").setHardness(2.5F).setResistance(22F).setUnlocalizedName("geothermaloven").setStepSound(Block.soundStoneFootstep).setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		//geothermalOvenActive = new BlockLavaFurnace(IDsHelper.lavafurnaceID + 1, "LavaFurnaceFrontRunning").setHardness(2.5F).setResistance(22F).setUnlocalizedName("geothermaloven1").setStepSound(Block.soundStoneFootstep).setLightValue(0.3F);
		//researcher = new BlockResearcher(IDsHelper.researcherID, "ResearcherTop", "ResearcherSide").setUnlocalizedName("researcher").setHardness(2.5F).setResistance(10F).setCreativeTab(ZoneSeek.ZoneSeekBlocks).setStepSound(Block.soundMetalFootstep);
		//logger = new BlockLogger(IDsHelper.loggerID, "LoggerFront", "LoggerSide").setUnlocalizedName("logger").setHardness(1.2F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		//loggeractive = new BlockLogger(IDsHelper.loggerID + 10, "LoggerFrontRunning", "LoggerSide").setUnlocalizedName("logger").setHardness(1.2F).setStepSound(Block.soundWoodFootstep);
		
		MinecraftForge.setBlockHarvestLevel(InfectedOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Granite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SludgeOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Apophyllite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Axinite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Betafite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Brochantite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Dolomite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Fotite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Heterogenite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Kasolite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Lazurite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AnthraciteCoalOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(FossilRock, "pickaxe", 3);
		
		gameRegisters();
		languageRegisters();
	}

	private static void gameRegisters() {
		//Block Registry
		GameRegistry.registerBlock(InfectedOre, "AdamBahr_InfectedOre");
		GameRegistry.registerBlock(InfectedBlock, "AdamBahr_InfectedBlock");
		GameRegistry.registerBlock(InfectedLamp, "AdamBahr_InfectedLamp");
		GameRegistry.registerBlock(InfectedBrick, "AdamBahr_InfectedBrick");
		GameRegistry.registerBlock(LagoonLog, "AdamBahr_LagoonLog");
		GameRegistry.registerBlock(LagoonPlanks, "AdamBahr_LagoonPlanks");
		GameRegistry.registerBlock(LagoonSapling, "AdamBahr_LagoonSapling");
		GameRegistry.registerBlock(LagoonLeaf, "AdamBahr_LagoonLeaf");
		GameRegistry.registerBlock(LagoonDirt, "AdamBahr_LagoonDirt");
		GameRegistry.registerBlock(LagoonGrass, "AdamBahr_LagoonGrass");
		GameRegistry.registerBlock(LagoonTallGrass, "AdamBahr_LagoonTallGrass");
		GameRegistry.registerBlock(SludgeTallGrass, "AdamBahr_SludgeTallGrass");
		GameRegistry.registerBlock(LagoonVines, "AdamBahr_LagoonVines");
		GameRegistry.registerBlock(SludgeOre, "AdamBahr_SludgeOre");
		GameRegistry.registerBlock(SludgeBrick, "AdamBahr_SludgeBrick");
		GameRegistry.registerBlock(SludgeLog, "AdamBahr_Log");
		GameRegistry.registerBlock(SludgePlanks, "AdamBahr_SludgePlanks");
		GameRegistry.registerBlock(SludgeDirt, "AdamBahr_SludgeDirt");
		GameRegistry.registerBlock(SludgeGrass, "AdamBahr_SludgeGrass");
		GameRegistry.registerBlock(SludgeLamp, "AdamBahr_SludgeLamp");
		GameRegistry.registerBlock(SludgeRock, "AdamBahr_SludgeRock");
		GameRegistry.registerBlock(SludgeLeaf, "AdamBahr_SludgeLeaf");
		GameRegistry.registerBlock(CarpetRed, "AdamBahr_CarpetRed");
		GameRegistry.registerBlock(HardWood, "AdamBahr_HardWood");
		GameRegistry.registerBlock(Tile, "AdamBahr_Tile");
		GameRegistry.registerBlock(WallPaperWhite, "AdamBahr_WallPaperWhite");
		GameRegistry.registerBlock(WallPaperGreenBottom, "AdamBahr_WallPaperBottomGreen");
		GameRegistry.registerBlock(WallPaperBlueBottom, "AdamBahr_WallPaperBottomBlue");
		GameRegistry.registerBlock(WallPaperRedBottom, "AdamBahr_WallPaperBottomRed");
		GameRegistry.registerBlock(WallPaperYellowBottom, "AdamBahr_WallPaperBottomYellow");
		GameRegistry.registerBlock(WallPaperGreen, "AdamBahr_WallPaperGreen");
		GameRegistry.registerBlock(WallPaperBlue, "AdamBahr_WallPaperBlue");
		GameRegistry.registerBlock(WallPaperRed, "AdamBahr_WallPaperRed");
		GameRegistry.registerBlock(WallPaperYellow, "AdamBahr_WallPaperYellow");
		GameRegistry.registerBlock(Siding, "AdamBahr_Siding");
		GameRegistry.registerBlock(Granite, "AdamBahr_Granite");
		GameRegistry.registerBlock(Counter, "AdamBahr_Counter");
		GameRegistry.registerBlock(Apophyllite, "AdamBahr_Apophyllite");
		GameRegistry.registerBlock(Axinite, "AdamBahr_Axinite");
		GameRegistry.registerBlock(Betafite, "AdamBahr_Betafite");
		GameRegistry.registerBlock(Brochantite, "AdamBahr_Brochantite");
		GameRegistry.registerBlock(CoconutBlock, "AdamBahr_CoconutBlock");
		GameRegistry.registerBlock(Dolomite, "AdamBahr_Dolomite");
		GameRegistry.registerBlock(Fotite, "AdamBahr_Fotite");
		GameRegistry.registerBlock(Heterogenite, "AdamBahr_Heterogenite");
		GameRegistry.registerBlock(Kasolite, "AdamBahr_Kasolite");
		GameRegistry.registerBlock(Lazurite, "AdamBahr_Lazurite");
		GameRegistry.registerBlock(PalmLeaf, "AdamBahr_PalmLeaf");
		GameRegistry.registerBlock(PalmWoodPlanks, "AdamBahr_PalmWoodPlanks");
		GameRegistry.registerBlock(PalmLog, "AdamBahr_PalmLog");
		GameRegistry.registerBlock(SludgeStoneGround, "AdamBahr_SludgeStoneGround");
		GameRegistry.registerBlock(TropicalDirt, "AdamBahr_TropicalDirt");
		GameRegistry.registerBlock(TropicalGrass, "AdamBahr_TropicalGrass");
		GameRegistry.registerBlock(TropicalTallGrass, "AdamBahr_TropicalTallGrass");
		GameRegistry.registerBlock(LagoonStairs, "AdamBahr_LagoonStairs");
		GameRegistry.registerBlock(SludgeStairs, "AdamBahr_SludgeStairs");
		GameRegistry.registerBlock(GraniteStairs, "AdamBahr_GraniteStairs");
		GameRegistry.registerBlock(BloodFlower, "AdamBahr_BloodFlower");
		GameRegistry.registerBlock(Blossoms, "AdamBahr_Blossoms");
		GameRegistry.registerBlock(Daisy, "AdamBahr_Daisy");
		GameRegistry.registerBlock(DeadFlower, "AdamBahr_DeadFlower");
		GameRegistry.registerBlock(Iris, "AdamBahr_Iris");
		GameRegistry.registerBlock(SpringFlowers, "AdamBahr_SpringFlowers");
		GameRegistry.registerBlock(Tulip, "AdamBahr_Tulip");
		GameRegistry.registerBlock(LagoonLadder, "Lagoon Ladder");
		GameRegistry.registerBlock(WallPaperCrimson, "AdamBahr_WallPaperCrimson");
		GameRegistry.registerBlock(WallPaperCrimsonBottom, "AdamBahr_WallPaperBottomCrimson");
		GameRegistry.registerBlock(WallPaperGray, "AdamBahr_WallPaperGray");
		GameRegistry.registerBlock(WallPaperGrayBottom, "AdamBahr_WallPaperBottomGray");
		GameRegistry.registerBlock(WallPaperPink, "AdamBahr_WallPaperPink");
		GameRegistry.registerBlock(WallPaperPinkBottom, "AdamBahr_WallPaperBottomPink");
		GameRegistry.registerBlock(PalmStairs, "AdamBahr_PalmStairs");
		GameRegistry.registerBlock(HardWoodStairs, "AdamBahr_HardWoodStairs");
		GameRegistry.registerBlock(AnthraciteCoalOre, "AdamBahr_AnthraciteCoal");
		GameRegistry.registerBlock(SlagBlock, "AdamBahr_SlagBlock");
		GameRegistry.registerBlock(portalprehistoric, "AdamBahr_PrehistoricPortal");
		GameRegistry.registerBlock(FossilRock, "AdamBahr_FossilRock");		
		GameRegistry.registerBlock(Condensor, "AdamBahr_Condensor");
		GameRegistry.registerBlock(Extractor, "AdamBahr_Extractor");
		GameRegistry.registerBlock(PrehistoricDirt, "AdamBahr_PrehistoricDirt");
		GameRegistry.registerBlock(PrehistoricGrass, "AdamBahr_PrehistoricGrass");
		GameRegistry.registerBlock(PrehistoricLeaf, "AdamBahr_PrehistoricLeaf");
		GameRegistry.registerBlock(PrehistoricLog, "AdamBahr_PrehistoricLog");
		GameRegistry.registerBlock(PrehistoricStone, "AdamBahr_PrehistoricStone");
		GameRegistry.registerBlock(PrehistoricTallGrass, "AdamBahr_PrehistoricTallGrass");
		GameRegistry.registerBlock(PrehistoricSand, "AdamBahr_PrehistoricSand");
	}
	
	private static void languageRegisters() {
		//Blocks
		LanguageRegistry.addName(SludgeOre, "Sludge Ore");
		LanguageRegistry.addName(SludgeBrick, "Sludge Brick");
		LanguageRegistry.addName(SludgeLog, "Sludge Log");
		LanguageRegistry.addName(SludgePlanks, "Sludge Planks");
		LanguageRegistry.addName(SludgeDirt, "Sludge Dirt");
		LanguageRegistry.addName(SludgeGrass, "Sludge Grass");
		LanguageRegistry.addName(SludgeLamp, "Sludge Lamp");
		LanguageRegistry.addName(SludgeRock, "Sludge Rock");
		LanguageRegistry.addName(SludgeLeaf, "Sludge Leaf");
		LanguageRegistry.addName(CarpetRed, "Red Carpet");
		LanguageRegistry.addName(HardWood, "Hard Wood");
		LanguageRegistry.addName(Tile, "Tile");
		LanguageRegistry.addName(WallPaperWhite, "Wallpaper White");
		LanguageRegistry.addName(WallPaperGreenBottom, "Wallpaper Bottom Green");
		LanguageRegistry.addName(WallPaperBlueBottom, "Wallpaper Bottom Blue");
		LanguageRegistry.addName(WallPaperRedBottom, "Wallpaper Bottom Red");
		LanguageRegistry.addName(WallPaperYellowBottom, "Wallpaper Bottom Yellow");
		LanguageRegistry.addName(WallPaperGreen, "Wallpaper Green");
		LanguageRegistry.addName(WallPaperBlue, "Wallpaper Blue");
		LanguageRegistry.addName(WallPaperRed, "Wallpaper Red");
		LanguageRegistry.addName(WallPaperYellow, "Wallpaper Yellow");
		LanguageRegistry.addName(Siding, "Siding");
		LanguageRegistry.addName(Granite, "Granite");
		LanguageRegistry.addName(Counter, "Granite Counter");
		LanguageRegistry.addName(Apophyllite, "Apophyllite");
		LanguageRegistry.addName(Axinite, "Axinite");
		LanguageRegistry.addName(Betafite, "Betafite");
		LanguageRegistry.addName(Brochantite, "Brochantite");
		LanguageRegistry.addName(CoconutBlock, "Coconut Block");
		LanguageRegistry.addName(Dolomite, "Dolomite");
		LanguageRegistry.addName(Fotite, "Fotite");
		LanguageRegistry.addName(Heterogenite, "Heterogenite");
		LanguageRegistry.addName(Kasolite, "Kasolite");
		LanguageRegistry.addName(Lazurite, "Lazurite");
		LanguageRegistry.addName(PalmLeaf, "Palm Leaf");
		LanguageRegistry.addName(PalmWoodPlanks, "Palm Wood Planks");
		LanguageRegistry.addName(PalmLog, "Palm Log");
		LanguageRegistry.addName(SludgeStoneGround, "Sludge Stone Ground");
		LanguageRegistry.addName(TropicalDirt, "Tropical Dirt");
		LanguageRegistry.addName(TropicalGrass, "Tropical Grass");
		LanguageRegistry.addName(TropicalTallGrass, "Tropical Tall Grass");
		LanguageRegistry.addName(LagoonStairs, "Lagoon Stairs");
		LanguageRegistry.addName(SludgeStairs, "Sludge Stairs");
		LanguageRegistry.addName(GraniteStairs, "Granite Stairs");
		LanguageRegistry.addName(LagoonTallGrass, "Lagoon Tall Grass");
		LanguageRegistry.addName(LagoonVines, "Lagoon Vines");
		LanguageRegistry.addName(LagoonGrass, "Lagoon Grass");
		LanguageRegistry.addName(LagoonDirt, "Lagoon Dirt");
		LanguageRegistry.addName(SludgeTallGrass, "Sludge Tall Grass");
		LanguageRegistry.addName(InfectedBlock, "Infected Block");
		LanguageRegistry.addName(InfectedBrick, "Infected Brick");
		LanguageRegistry.addName(InfectedLamp, "Infected Lamp");
		LanguageRegistry.addName(InfectedOre, "Infected Ore");
		LanguageRegistry.addName(LagoonLeaf, "Lagoon Leaf");
		LanguageRegistry.addName(LagoonLog, "Lagoon Log");
		LanguageRegistry.addName(LagoonPlanks, "Lagoon Planks");
		LanguageRegistry.addName(LagoonSapling, "Lagoon Sapling");
		LanguageRegistry.addName(BloodFlower, "Blood Flower");
		LanguageRegistry.addName(Blossoms, "Blossoms");
		LanguageRegistry.addName(Daisy, "Daisy");
		LanguageRegistry.addName(DeadFlower, "Dead Flower");
		LanguageRegistry.addName(Iris, "Iris");
		LanguageRegistry.addName(SpringFlowers, "Spring Flowers");
		LanguageRegistry.addName(Tulip, "Tulip");
		LanguageRegistry.addName(LagoonLadder, "Lagoon Ladder");
		LanguageRegistry.addName(WallPaperCrimson, "Wallpaper Crimson");
		LanguageRegistry.addName(WallPaperCrimsonBottom, "Wallpaper Bottom Crimson");
		LanguageRegistry.addName(WallPaperGray, "Wallpaper Gray");
		LanguageRegistry.addName(WallPaperGrayBottom, "Wallpaper Bottom Gray");
		LanguageRegistry.addName(WallPaperPink, "Wallpaper Pink");
		LanguageRegistry.addName(WallPaperPinkBottom, "Wallpaper Bottom Pink");
		LanguageRegistry.addName(PalmStairs, "Palm Stairs");
		LanguageRegistry.addName(HardWoodStairs, "Hard Wood Stairs");
		LanguageRegistry.addName(AnthraciteCoalOre, "Anthracite Coal Ore");
		LanguageRegistry.addName(SlagBlock, "Slag Block");
		LanguageRegistry.addName(portalprehistoric, "Prehistoric Portal");
		LanguageRegistry.addName(FossilRock, "Fossil Rock");
		LanguageRegistry.addName(Condensor, "Condensor");
		LanguageRegistry.addName(Extractor, "Extractor");
		LanguageRegistry.addName(PrehistoricDirt, "Prehistoric Dirt");
		LanguageRegistry.addName(PrehistoricGrass, "Prehistoric Grass");
		LanguageRegistry.addName(PrehistoricLeaf, "Prehistoric Leaf");
		LanguageRegistry.addName(PrehistoricLog, "Prehistoric Log");
		LanguageRegistry.addName(PrehistoricStone, "Prehistoric Stone");
		LanguageRegistry.addName(PrehistoricTallGrass, "Prehistoric Tall Grass");
		LanguageRegistry.addName(PrehistoricSand, "Prehistoric Sand");
		
	}

}

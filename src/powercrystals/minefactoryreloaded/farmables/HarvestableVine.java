package powercrystals.minefactoryreloaded.farmables;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import powercrystals.minefactoryreloaded.api.HarvestType;
import powercrystals.minefactoryreloaded.api.IFactoryHarvestable;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HarvestableVine implements IFactoryHarvestable
{
	@Override
	public int getSourceId()
	{
		return Block.vine.blockID;
	}

	@Override
	public HarvestType getHarvestType()
	{
		return HarvestType.TreeLeaf;
	}

	@Override
	public boolean canBeHarvested(World world, Map<String, Boolean> harvesterSettings, int x, int y, int z)
	{
		return true;
	}

	@Override
	public List<ItemStack> getDrops(World world, Random rand, Map<String, Boolean> harvesterSettings, int x, int y, int z)
	{
		List<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(Block.vine));
		return drops;
	}

	@Override
	public void preHarvest(World world, int x, int y, int z)
	{
	}

	@Override
	public void postHarvest(World world, int x, int y, int z)
	{
	}
}

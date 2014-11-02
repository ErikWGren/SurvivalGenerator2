package com.intellectualsites.erikwolfy.generator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

import com.intellectualcrafters.plot.PlotGenerator;
import com.intellectualcrafters.plot.PlotManager;
import com.intellectualcrafters.plot.PlotWorld;

public class SurvivalGenerator extends PlotGenerator{

	short [][] result;
	
	private static PlotManager manager = null;
	SurvivalPlotworld plotworld;
	
	
	public SurvivalGenerator(String world) {
		super(world);
	}

	@Override
	public PlotWorld getNewPlotWorld(String world) {
		this.plotworld = new SurvivalPlotworld(world);
		return this.plotworld;
	}

	@Override
	public PlotManager getPlotManager() {
		return null;
	}
	
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world) {
		// disabling spawning for this world
		if (!this.plotworld.MOB_SPAWNING) {
			world.setSpawnFlags(false, false);
			world.setAmbientSpawnLimit(0);
			world.setAnimalSpawnLimit(0);
			world.setMonsterSpawnLimit(0);
			world.setWaterAnimalSpawnLimit(0);
		}
		return Arrays.asList((BlockPopulator) new SurvivalPop(this.plotworld));
	}
	
	private void setBlock(short[][] result, int x, int y, int z, short blkid) {
		if (result[y >> 4] == null) {
			result[y >> 4] = new short[4096];
		}
		result[y >> 4][((y & 0xF) << 8) | (z << 4) | x] = blkid;
	}
	
	@Override
	public short[][] generateExtBlockSections(World world, Random random, int cx, int cz, BiomeGrid biomes) {
		return result;
	}
}

package com.intellectualsites.erikwolfy.generator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class Generator extends JavaPlugin{
	
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		return new SurvivalGenerator(worldName);
	}
}

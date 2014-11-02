package com.intellectualsites.erikwolfy.generator;

import org.bukkit.configuration.ConfigurationSection;

import com.intellectualcrafters.plot.ConfigurationNode;
import com.intellectualcrafters.plot.PlotWorld;

public class SurvivalPlotworld extends PlotWorld{

	public SurvivalPlotworld(String world) {
		super(world);
	}

	@Override
	public ConfigurationNode[] getSettingNodes() {
		return null;
	}

	@Override
	public void loadConfiguration(ConfigurationSection arg0) {	
	}
}

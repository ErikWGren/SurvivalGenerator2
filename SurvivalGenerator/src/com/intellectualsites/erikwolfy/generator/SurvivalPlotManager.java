package com.intellectualsites.erikwolfy.generator;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Biome;

import com.intellectualcrafters.plot.Plot;
import com.intellectualcrafters.plot.PlotBlock;
import com.intellectualcrafters.plot.PlotId;
import com.intellectualcrafters.plot.PlotManager;
import com.intellectualcrafters.plot.PlotWorld;

public class SurvivalPlotManager extends PlotManager {

	@Override
	public boolean clearPlot(World arg0, Plot arg1) {
		return false;
	}

	@Override
	public boolean createRoadEast(PlotWorld arg0, Plot arg1) {
		return false;
	}

	@Override
	public boolean createRoadSouth(PlotWorld arg0, Plot arg1) {
		return false;
	}

	@Override
	public boolean createRoadSouthEast(PlotWorld arg0, Plot arg1) {
		
		return false;
	}

	@Override
	public boolean finishPlotMerge(World arg0, PlotWorld arg1, ArrayList<PlotId> arg2) {
		
		return false;
	}

	@Override
	public boolean finishPlotUnlink(World arg0, PlotWorld arg1, ArrayList<PlotId> arg2) {
		
		return false;
	}

	@Override
	public Location getPlotBottomLocAbs(PlotWorld arg0, PlotId arg1) {
		
		return null;
	}

	@Override
	public PlotId getPlotId(PlotWorld arg0, Location arg1) {
		
		return null;
	}

	@Override
	public PlotId getPlotIdAbs(PlotWorld arg0, Location arg1) {
		
		return null;
	}

	@Override
	public Location getPlotTopLocAbs(PlotWorld arg0, PlotId arg1) {
		
		return null;
	}

	@Override
	public Location getSignLoc(World arg0, PlotWorld arg1, Plot arg2) {
		
		return null;
	}

	@Override
	public boolean isInPlotAbs(PlotWorld arg0, Location arg1, PlotId arg2) {
		
		return false;
	}

	@Override
	public boolean removeRoadEast(PlotWorld arg0, Plot arg1) {
		
		return false;
	}

	@Override
	public boolean removeRoadSouth(PlotWorld arg0, Plot arg1) {
		
		return false;
	}

	@Override
	public boolean removeRoadSouthEast(PlotWorld arg0, Plot arg1) {
		
		return false;
	}

	@Override
	public boolean setBiome(World arg0, Plot arg1, Biome arg2) {
		
		return false;
	}

	@Override
	public boolean setFloor(World arg0, PlotWorld arg1, PlotId arg2, PlotBlock[] arg3) {
		
		return false;
	}

	@Override
	public boolean setWall(World arg0, PlotWorld arg1, PlotId arg2, PlotBlock arg3) {
		
		return false;
	}

	@Override
	public boolean setWallFilling(World arg0, PlotWorld arg1, PlotId arg2, PlotBlock arg3) {
		
		return false;
	}

	@Override
	public boolean startPlotMerge(World arg0, PlotWorld arg1, ArrayList<PlotId> arg2) {
		
		return false;
	}

	@Override
	public boolean startPlotUnlink(World arg0, PlotWorld arg1, ArrayList<PlotId> arg2) {
		
		return false;
	}

}

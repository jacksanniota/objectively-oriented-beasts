package edu.gatech.cs2340.group6.world;

import edu.gatech.cs2340.group6.object.Player;

import java.awt.*;
import java.util.Random;

public class WorldUtils {

    private static Random random = new Random();

    public static Region getRandomRegion(Universe universe) {
        int num = random.nextInt(universe.getRegions().size());
        return universe.getRegions().get(num);
    }

    public static double getRegionDistance(Player player, Region region) {
        Point playerCoords = player.getCurrentRegion().getCoords();
        Point regionCoords = region.getCoords();
        double xDistance = Math.pow((playerCoords.getX() - regionCoords.getX()), 2);
        double yDistance = Math.pow((playerCoords.getY() - regionCoords.getY()), 2);
        double totalDistance = Math.pow(xDistance + yDistance, .5);
        return Math.round(totalDistance);
    }
}

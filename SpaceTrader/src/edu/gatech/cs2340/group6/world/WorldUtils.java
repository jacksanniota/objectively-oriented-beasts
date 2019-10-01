package edu.gatech.cs2340.group6.world;

import java.util.Random;

public class WorldUtils {

    private static Random random = new Random();

    public static Region getRandomRegion(Universe universe) {
        int num = random.nextInt(universe.getRegions().size());
        return universe.getRegions().get(num);
    }
}

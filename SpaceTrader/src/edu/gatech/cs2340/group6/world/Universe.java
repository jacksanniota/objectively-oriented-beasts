package edu.gatech.cs2340.group6.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Universe {

    private static Universe instance = null;
    private static List<Region> regions = new ArrayList<>();

    private Universe() {
        createRegions();
    }

    public static Universe getInstance() {
        if (instance == null) {
            instance = new Universe();
        }
        return instance;
    }

    public List<Region> getRegions() {
        return regions;
    }

    private void createRegions() {
        for (int i = 0; i < 10; i++) {
            Region region = new Region("region" + i);
            regions.add(region);
        }
    }
}
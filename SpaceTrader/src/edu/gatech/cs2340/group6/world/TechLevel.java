package edu.gatech.cs2340.group6.world;

import java.util.Random;

public enum TechLevel {

    STONEAGE, AGRICULTURE, MEDIEVAL, RENAISSANCE, INDUSTRIAL, MODERN, FUTURISTIC;

    public static TechLevel getRandomLevel() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

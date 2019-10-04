package edu.gatech.cs2340.group6.world;

import java.awt.Point;
import java.util.Random;

public class Region {

    private String name;
    private Point coords;
    private TechLevel techLevel;

    public Region(String name) {
        this.name = name;
        this.coords = generateRandomCoords();
        this.techLevel = TechLevel.getRandomLevel();
    }

    public String getName() {
        return name;
    }

    public Point getCoords() {
        return coords;
    }

    public void setCoords(Point coords) {
        this.coords = coords;
    }

    public TechLevel getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(TechLevel techLevel) {
        this.techLevel = techLevel;
    }

    public Point generateRandomCoords() {
        Random r = new Random();
        Point point = new Point();
        int x = r.nextInt((200 - (-200)) + 1) + (-200);
        int y = r.nextInt((200 - (-200)) + 1) + (-200);
        point.setLocation(x, y);
        return point;
    }

    @Override
    public String toString() {
        return "[" + name + "] " + "Point: " + coords.toString() + " | TechLevel: " + techLevel.toString();
    }
}

package edu.gatech.cs2340.group6.skills;

public class Merchant implements Skill {

    private int points = 0;

    public Merchant(int points) {
        this.points = points;
    }

    public String toString() {
        return "Merchant";
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}

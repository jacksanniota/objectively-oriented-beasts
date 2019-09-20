package edu.gatech.cs2340.group6.skills;

public class Pilot implements Skill  {

    private int points = 0;

    public Pilot(int points) {
        this.points = points;
    }

    public String toString() {
        return "Pilot";
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

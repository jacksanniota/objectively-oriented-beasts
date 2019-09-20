package edu.gatech.cs2340.group6.skills;

public class Fighter implements Skill {

    private int points = 0;

    public Fighter(int points) {
        this.points = points;
    }

    public String toString() {
        return "Fighter";
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}

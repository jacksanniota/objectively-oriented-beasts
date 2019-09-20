package edu.gatech.cs2340.group6.skills;

public class Engineer implements Skill {

    private int points = 0;

    public Engineer(int points) {
        this.points = points;
    }

    public String toString() {
        return "Engineer";
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}

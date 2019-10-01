package edu.gatech.cs2340.group6.object;

import edu.gatech.cs2340.group6.skills.Pilot;
import edu.gatech.cs2340.group6.skills.Skill;
import edu.gatech.cs2340.group6.skills.Skills;
import edu.gatech.cs2340.group6.world.Region;

public class Player {

    private String name;
    private Skills skills;
    private double tokens = 0;
    private Difficulty difficulty;
    private Region currentRegion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public double getTokens() {
        return tokens;
    }

    public void addTokens(double amount) {
        tokens += amount;
    }

    public void setTokens(double amount) {
        tokens = amount;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Region getCurrentRegion() {
        return currentRegion;
    }

    public void setCurrentRegion(Region currentRegion) {
        this.currentRegion = currentRegion;
    }
}

package edu.gatech.cs2340.group6.object;

import edu.gatech.cs2340.group6.skills.Skill;

public class Player {

    private String name;
    private Skill skill;
    private double tokens = 0;
    private Difficulty difficulty;

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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}

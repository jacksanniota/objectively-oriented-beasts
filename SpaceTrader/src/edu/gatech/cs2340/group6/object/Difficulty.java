package edu.gatech.cs2340.group6.object;

public enum Difficulty {
    EASY(16, 1000), MEDIUM(12, 500), HARD(8, 100);

    private int skillPoints;
    private int startingTokens;
    Difficulty(int skillPoints, int startingTokens) {
        this.skillPoints = skillPoints;
        this.startingTokens = startingTokens;
    }

    public int getStartingTokens() {
        return startingTokens;
    }

    public int getSkillPoints() {
        return skillPoints;
    }
}

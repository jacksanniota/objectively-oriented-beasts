package edu.gatech.cs2340.group6.object;

public enum Difficulty {
    EASY(16), MEDIUM(12), HARD(8);

    private int skillPoints;
    Difficulty(int skillPoints) {
        this.skillPoints = skillPoints;
    }
}

package edu.gatech.cs2340.group6.skills;

public class SkillUtils {

    public static Skill stringToSkill(String skillName) {
        if (skillName.equals("Fighter")) {
            return new Fighter();
        }
        if (skillName.equals("Merchant")) {
            return new Merchant();
        }
        if (skillName.equals("Engineer")) {
            return new Engineer();
        }
        if (skillName.equals("Pilot")) {
            return new Pilot();
        }
        return null;
    }
}

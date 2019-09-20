package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;
import edu.gatech.cs2340.group6.object.Player;

import javax.swing.*;
import java.awt.*;

public class ViewConfigScreen {

    public JPanel getScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        Player player = Game.getPlayer();
        JLabel name = new JLabel("Name: " + player.getName());
        JLabel difficulty = new JLabel("Difficulty: " + player.getDifficulty().toString());
        JLabel skill = new JLabel("Name: " + player.getSkill().toString());
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        difficulty.setAlignmentX(Component.CENTER_ALIGNMENT);
        skill.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(name);
        panel.add(difficulty);
        panel.add(skill);
        return panel;
    }
}

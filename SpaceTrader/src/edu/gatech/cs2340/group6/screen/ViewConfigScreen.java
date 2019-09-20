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
        JLabel fighter = new JLabel("Fighter Points: " + player.getSkills().getFighter().getPoints());
        JLabel engineer = new JLabel("Engineer Points: " + player.getSkills().getEngineer().getPoints());
        JLabel pilot = new JLabel("Pilot Points: " + player.getSkills().getPilot().getPoints());
        JLabel merchant = new JLabel("Merchant Points: " + player.getSkills().getMerchant().getPoints());
        JLabel tokens = new JLabel("Tokens: " + player.getTokens());
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        difficulty.setAlignmentX(Component.CENTER_ALIGNMENT);
        fighter.setAlignmentX(Component.CENTER_ALIGNMENT);
        engineer.setAlignmentX(Component.CENTER_ALIGNMENT);
        pilot.setAlignmentX(Component.CENTER_ALIGNMENT);
        merchant.setAlignmentX(Component.CENTER_ALIGNMENT);
        tokens.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(name);
        panel.add(difficulty);
        panel.add(fighter);
        panel.add(merchant);
        panel.add(pilot);
        panel.add(engineer);
        panel.add(tokens);
        return panel;
    }
}

package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;
import edu.gatech.cs2340.group6.object.Player;
import edu.gatech.cs2340.group6.world.Region;
import edu.gatech.cs2340.group6.world.Universe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegionScreen {

    public JPanel getScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        Player player = Game.getPlayer();
        Region currentRegion = player.getCurrentRegion();
        JLabel regionName = new JLabel("Region: " + currentRegion.getName());
        JLabel techLevel = new JLabel("Tech Level: " + currentRegion.getTechLevel().toString());
        JLabel regionCoords = new JLabel("Coordinates: (" + currentRegion.getCoords().getX()
                                        + ", " + currentRegion.getCoords().getY() + ")");
        JButton travelButton = new JButton("Travel");
        travelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenUtils.changeScreen(new TravelScreen().getScreen());
            }
        });
        regionName.setAlignmentX(Component.CENTER_ALIGNMENT);
        regionCoords.setAlignmentX(Component.CENTER_ALIGNMENT);
        techLevel.setAlignmentX(Component.CENTER_ALIGNMENT);
        travelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(regionName);
        panel.add(regionCoords);
        panel.add(techLevel);
        panel.add(travelButton);
        return panel;
    }
}

package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;
import edu.gatech.cs2340.group6.object.Player;
import edu.gatech.cs2340.group6.world.Region;
import edu.gatech.cs2340.group6.world.Universe;
import edu.gatech.cs2340.group6.world.WorldUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelScreen {

    public JPanel getScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        Player player = Game.getPlayer();
        Universe universe = Universe.getInstance();
        JLabel title = new JLabel("Where do you want to travel?");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);
        for (Region region : universe.getRegions()) {
            double distance = WorldUtils.getRegionDistance(player, region);
            if (distance == 0) {
                continue;
            }
            String regionDistance = Double.toString(distance);
            JButton travelButton = new JButton(region.getName());
            travelButton.setActionCommand(region.getName());
            travelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Region newRegion = Universe.getRegionFromName(e.getActionCommand());
                    if (newRegion != null) {
                        player.setCurrentRegion(newRegion);
                    }
                    ScreenUtils.changeScreen(new RegionScreen().getScreen());
                }
            });
            JLabel regionCoords = new JLabel("X: " + region.getCoords().getX() + " | Y: " + region.getCoords().getY());
            JLabel techLevel = new JLabel("TechLevel: " + region.getTechLevel().toString());
            JLabel regionLabel = new JLabel("Region Distance : " + regionDistance);
            regionCoords.setAlignmentX(Component.CENTER_ALIGNMENT);
            techLevel.setAlignmentX(Component.CENTER_ALIGNMENT);
            travelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            regionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(travelButton);
            panel.add(techLevel);
            panel.add(regionCoords);
            panel.add(regionLabel);
        }
        return panel;
    }

}

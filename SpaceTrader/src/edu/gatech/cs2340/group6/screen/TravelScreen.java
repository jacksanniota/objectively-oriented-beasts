package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;
import edu.gatech.cs2340.group6.object.Player;
import edu.gatech.cs2340.group6.world.Region;
import edu.gatech.cs2340.group6.world.Universe;

import javax.swing.*;

public class TravelScreen {

    public JPanel getScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        Player player = Game.getPlayer();
        Universe universe = Universe.getInstance();
        for (Region region : universe.getRegions()) {
            
        }
        return panel;
    }

}

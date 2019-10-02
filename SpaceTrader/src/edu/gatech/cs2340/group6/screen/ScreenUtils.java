package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;

import javax.swing.JPanel;

public class ScreenUtils {

    public static void changeScreen(JPanel panel) {
        Game.getInstance().getContentPane().removeAll();
        Game.getInstance().getContentPane().add(panel);
        Game.getInstance().getContentPane().validate();
        Game.getInstance().getContentPane().repaint();
    }
}

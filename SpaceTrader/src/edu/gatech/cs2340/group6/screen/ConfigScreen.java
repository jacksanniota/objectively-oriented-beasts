package edu.gatech.cs2340.group6.screen;

import javax.swing.*;
import java.awt.*;

public class ConfigScreen {

    public JPanel getScreen() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JLabel nameLabel = new JLabel("Name");
        JTextField nameInput = new JTextField("John Smith");
        nameInput.setSize(100, 20);
        JLabel selectDifficulty = new JLabel("Select Difficulty");
        JRadioButton easyButton = new JRadioButton("Easy");
        JRadioButton mediumButton = new JRadioButton("Medium");
        JRadioButton hardButton = new JRadioButton("Hard");
        jPanel.add(nameLabel, BorderLayout.WEST);
        jPanel.add(nameInput, BorderLayout.NORTH);
        return jPanel;
    }
}

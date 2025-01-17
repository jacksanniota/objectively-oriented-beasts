package edu.gatech.cs2340.group6;

import edu.gatech.cs2340.group6.object.Player;
import edu.gatech.cs2340.group6.screen.ConfigScreen;
import edu.gatech.cs2340.group6.world.Universe;
import edu.gatech.cs2340.group6.world.WorldUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {

    private static Game instance = null;
    private static Player player;
    private static Universe universe;

    public Game(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setResizable(true);
        JPanel contentPane = createStartPanel();
        this.setContentPane(contentPane);
        this.setVisible(true);
        player = new Player();
        universe = Universe.getInstance();
        player.setCurrentRegion(WorldUtils.getRandomRegion(universe));
    }

    private JPanel createStartPanel() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JLabel welcomeText = new JLabel("Welcome to SpaceTrader");
        welcomeText.setHorizontalAlignment(JLabel.CENTER);
        JButton button = new JButton("Start Game");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                instance.getContentPane().removeAll();
                instance.getContentPane().add(new ConfigScreen().getScreen());
                instance.getContentPane().validate();
                instance.getContentPane().repaint();
            }
        });
        jPanel.add(welcomeText, BorderLayout.CENTER);
        jPanel.add(button, BorderLayout.SOUTH);
        return jPanel;
    }

    public static Player getPlayer() {
        return player;
    }

    public static Game getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Game game = new Game("SpaceTrader");
        instance = game;
    }

}

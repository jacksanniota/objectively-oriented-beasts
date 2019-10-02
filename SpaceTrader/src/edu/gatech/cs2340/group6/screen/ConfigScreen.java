package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;
import edu.gatech.cs2340.group6.object.Difficulty;
import edu.gatech.cs2340.group6.skills.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigScreen {

    public JPanel getScreen() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        JLabel nameLabel = new JLabel("Name");
        JTextField nameInput = new JTextField("John Smith");
        nameInput.setMaximumSize(new Dimension(Integer.MAX_VALUE, nameInput.getPreferredSize().height));

        JPanel difficultyPanel = new JPanel();
        difficultyPanel.setLayout(new GridLayout());
        JLabel selectDifficulty = new JLabel("Select Difficulty");
        JRadioButton easyButton = new JRadioButton("Easy");
        easyButton.setActionCommand("EASY");
        JRadioButton mediumButton = new JRadioButton("Medium");
        mediumButton.setActionCommand("MEDIUM");
        JRadioButton hardButton = new JRadioButton("Hard");
        hardButton.setActionCommand("HARD");
        difficultyPanel.add(selectDifficulty);
        difficultyPanel.add(easyButton);
        difficultyPanel.add(mediumButton);
        difficultyPanel.add(hardButton);
        ButtonGroup difficultyGroup = new ButtonGroup();
        difficultyGroup.add(easyButton);
        difficultyGroup.add(mediumButton);
        difficultyGroup.add(hardButton);

        JPanel skillPanel = new JPanel();
        skillPanel.setLayout(new GridLayout());
        JLabel skillsLabel = new JLabel("Select Skill Points");

        JLabel fighterLabel = new JLabel("Fighter");
        JTextField fighter = new JTextField();

        JLabel merchantLabel = new JLabel("Merchant");
        JTextField merchant = new JTextField();

        JLabel pilotLabel = new JLabel("Pilot");
        JTextField pilot = new JTextField();

        JLabel engineerLabel = new JLabel("Engineer");
        JTextField engineer = new JTextField();

        skillPanel.add(skillsLabel);
        skillPanel.add(fighterLabel);
        skillPanel.add(fighter);
        skillPanel.add(merchantLabel);
        skillPanel.add(merchant);
        skillPanel.add(pilotLabel);
        skillPanel.add(pilot);
        skillPanel.add(engineerLabel);
        skillPanel.add(engineer);

        JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = getPlayerName(nameInput);
                Difficulty difficulty = getSelectedDifficulty(difficultyGroup);

                int fighterAmount = Integer.parseInt(fighter.getText());
                int engineerAmount = Integer.parseInt(engineer.getText());
                int pilotAmount = Integer.parseInt(pilot.getText());
                int merchantAmount = Integer.parseInt(merchant.getText());
                int total = fighterAmount + engineerAmount + merchantAmount + pilotAmount;
                if (total > difficulty.getSkillPoints()) {
                    return;
                }
                Skills skills = new Skills();
                skills.setFighter(new Fighter(fighterAmount));
                skills.setEngineer(new Engineer(engineerAmount));
                skills.setPilot(new Pilot(pilotAmount));
                skills.setMerchant(new Merchant(merchantAmount));

                updatePlayer(name, difficulty, skills);
                ScreenUtils.changeScreen(new ViewConfigScreen().getScreen());
            }
        });

        nameInput.setAlignmentX(Component.CENTER_ALIGNMENT);
        selectDifficulty.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel.add(nameLabel);
        jPanel.add(nameInput);
        jPanel.add(difficultyPanel);
        jPanel.add(skillPanel);
        jPanel.add(continueButton, BorderLayout.SOUTH);
        return jPanel;
    }

    private Difficulty getSelectedDifficulty(ButtonGroup difficultyGroup) {
        ButtonModel button = difficultyGroup.getSelection();
        Difficulty difficulty = Difficulty.valueOf(button.getActionCommand());
        if (difficulty == null) {
            throw new IllegalArgumentException("Difficulty does not exist.");
        }

        return difficulty;
    }

    private String getPlayerName(JTextField nameInput) {
        return nameInput.getText();
    }

    private void updatePlayer(String name, Difficulty difficulty, Skills skills) {
        Game.getPlayer().setName(name);
        Game.getPlayer().setDifficulty(difficulty);
        Game.getPlayer().setSkills(skills);
        Game.getPlayer().setTokens(difficulty.getStartingTokens());
    }
}

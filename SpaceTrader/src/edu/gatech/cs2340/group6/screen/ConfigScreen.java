package edu.gatech.cs2340.group6.screen;

import edu.gatech.cs2340.group6.Game;
import edu.gatech.cs2340.group6.object.Difficulty;
import edu.gatech.cs2340.group6.skills.Skill;
import edu.gatech.cs2340.group6.skills.SkillUtils;

import javax.swing.*;
import javax.swing.border.Border;
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
        JLabel skillsLabel = new JLabel("Select Skill");
        JRadioButton fighter = new JRadioButton("Fighter");
        fighter.setActionCommand("Fighter");
        JRadioButton merchant = new JRadioButton("Merchant");
        merchant.setActionCommand("Merchant");
        JRadioButton pilot = new JRadioButton("Pilot");
        pilot.setActionCommand("Pilot");
        JRadioButton engineer = new JRadioButton("Engineer");
        engineer.setActionCommand("Engineer");
        skillPanel.add(skillsLabel);
        skillPanel.add(fighter);
        skillPanel.add(merchant);
        skillPanel.add(pilot);
        skillPanel.add(engineer);
        ButtonGroup skillsGroup = new ButtonGroup();
        skillsGroup.add(fighter);
        skillsGroup.add(merchant);
        skillsGroup.add(pilot);
        skillsGroup.add(engineer);

        JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = getPlayerName(nameInput);
                Difficulty difficulty = getSelectedDifficulty(difficultyGroup);
                Skill skill = getSelectedSkill(skillsGroup);
                updatePlayer(name, difficulty, skill);
                Game.getInstance().getContentPane().removeAll();
                Game.getInstance().getContentPane().add(new ViewConfigScreen().getScreen());
                Game.getInstance().getContentPane().validate();
                Game.getInstance().getContentPane().repaint();
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

    private Skill getSelectedSkill(ButtonGroup skillsGroup) {
        ButtonModel button = skillsGroup.getSelection();
        Skill skill = SkillUtils.stringToSkill((button.getActionCommand()));
        if (skill == null) {
            throw new IllegalArgumentException("Skill does not exist.");
        }

        return skill;
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

    private void updatePlayer(String name, Difficulty difficulty, Skill skill) {
        Game.getPlayer().setName(name);
        Game.getPlayer().setDifficulty(difficulty);
        Game.getPlayer().setSkill(skill);
    }
}

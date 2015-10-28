package com.Joe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AgileOrWaterFall extends JFrame{
    private JPanel rootPanel;
    private JTextField projectName;
    private JCheckBox a1020MembersCheckBox;
    private JCheckBox yesDeadlineCheckBox;
    private JCheckBox a50100MembersCheckBox;
    private JCheckBox noDeadlineCheckBox;
    private JCheckBox yesExperienceCheckBox1;
    private JCheckBox noExperienceCheckBox;
    private JCheckBox sameLocationCheckBox;
    private JCheckBox differentLocationCheckBox;
    private JCheckBox yesQualityCheckBox2;
    private JCheckBox noQualityCheckBox2;
    private JCheckBox yesCheckBox3;
    private JCheckBox noCheckBox3;
    private JButton recommendButton;
    private JLabel resultsLabel;

    private boolean members;
    private boolean deadlines;
    private boolean experiences;
    private boolean locations;
    private boolean quality;
    private boolean prototype;

    protected AgileOrWaterFall(){
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);


        a1020MembersCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) { members = a1020MembersCheckBox.isSelected();}
        });
        a50100MembersCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) { members = a50100MembersCheckBox.isSelected();}
        });
        noDeadlineCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                deadlines = noDeadlineCheckBox.isSelected();
            }
        });
        yesExperienceCheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                experiences = yesExperienceCheckBox1.isSelected();
            }
        });
        noExperienceCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                experiences = noExperienceCheckBox.isSelected();
            }
        });
        sameLocationCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                locations = sameLocationCheckBox.isSelected();
            }
        });
        differentLocationCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                locations = differentLocationCheckBox.isSelected();
            }
        });
        yesQualityCheckBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                quality = yesQualityCheckBox2.isSelected();
            }
        });
        noQualityCheckBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                quality = noQualityCheckBox2.isSelected();
            }
        });
        yesCheckBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                prototype = yesCheckBox3.isSelected();
            }
        });
        noCheckBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                prototype = noCheckBox3.isSelected();
            }
        });
        yesDeadlineCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                deadlines = yesDeadlineCheckBox.isSelected();
            }
        });

        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String member = (members)? "": "";
                String deadline = (deadlines)? "":"";
                String qualitys = (quality)? "" : "";
            }
        });
    }

}
